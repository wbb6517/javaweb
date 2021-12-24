package cn.edu.lzit.jdbc01;

import java.sql.*;

public class Example02 {
    public static void main(String[] args) {
        Connection con = null;     //用于连接数据库
        PreparedStatement pst = null;     //用于执行SQL语句

        try{
            //1.注册并加载驱动
            /*
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

            //3.获取sql语句对象
            String sql = "insert into sort values(?,?)";
            pst=con.prepareStatement(sql);

            //4.执行sql，给占位符赋值
            pst.setInt(1,5);
            pst.setString(2,"网络19");
            //java.sql.Date date=new java.sql.Date(new java.util.Date().getTime());
            int row = pst.executeUpdate();
            if (row==1){
                System.out.println("数据插入成功！");
            }else {
                System.out.println("数据插入失败！");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //5.关闭连接，释放资源
            if (pst!=null) {
                try {
                    pst.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                pst=null;
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













