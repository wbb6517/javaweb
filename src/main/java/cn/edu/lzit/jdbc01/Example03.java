package cn.edu.lzit.jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Example03 {
    public static void main(String[] args) {

        Connection con = null;     //用于连接数据库
        Statement stmt = null;     //用于执行SQL语句
        ResultSet rs = null;

        try {
            //1.加载注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.获取连接对象
            String url = "jdbc:mysql://192.168.102.130:3306/jdbc";
            String user="root";
            String password="mysql";
            con = DriverManager.getConnection(url, user, password);

            //3.获取sql语句对象,支持滚动结果集
            stmt= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            //4.执行sql语句
            rs=stmt.executeQuery("select * from comment");

            //5.遍历结果集
            rs.absolute(2);
            System.out.println("第二行结果："+rs.getString("commentId"));

            rs.beforeFirst();//定位光标到第一行前面
            rs.next();//光标定位到第一行
            System.out.println("第一行结果："+rs.getString("commentId"));

            rs.afterLast();
            rs.previous();
            System.out.println("最后一行结果："+rs.getString("commentId"));


        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            //关闭链接，释放资源
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
