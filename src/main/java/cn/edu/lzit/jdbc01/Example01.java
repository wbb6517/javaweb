package cn.edu.lzit.jdbc01;


import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class Example01 {
    //执行查询操作
    public static void main(String[] args) {

        Connection con = null;     //用于连接数据库
        Statement stmt = null;     //用于执行SQL语句
        ResultSet rs = null;

        try{
            //1.注册并加载驱动
            /* *
            *  Class.forName(String)的作用是要求JVM查找并加载指定的类，也就是说JVM会执行该类的静态代码段。
            *  newInstance()方法和new关键字,前者是使用类加载机制，后者是创建一个新类
            * */
            //Driver driver = new Driver();
            //DriverManager.deregisterDriver(driver);
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.获取连接对象
            String url = "jdbc:mysql://192.168.102.130:3306/jdbc";
            String user="root";
            String password="mysql";
            con = DriverManager.getConnection(url, user, password);

            //3.获取操作数据的对象
            stmt=con.createStatement();

            //4.向数据库发送查询语句
            String sql = "select * from comment";
            rs=stmt.executeQuery(sql);

            //5.遍历结果集，获取查询的数据
            while(rs.next()){
                System.out.print(rs.getString(1)+"\t");
                System.out.print(rs.getString(2)+"\t");
                System.out.print(rs.getDate(3)+"\t");
                System.out.print(rs.getString(4)+"\n");
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            //6.关闭连接，释放资源
            if (rs!=null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                rs=null;
            }
            if (stmt!=null) {
                try {
                    stmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                stmt=null;
            }
            if (con!=null) {
                try {
                    con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                con=null;
            }
        }
    }
}
