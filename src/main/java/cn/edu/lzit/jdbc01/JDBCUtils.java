package cn.edu.lzit.jdbc01;

import java.sql.*;

public class JDBCUtils {
    // 加载驱动，并建立数据库连接
    public static Connection getConnection() {

        Connection con = null;     //用于连接数据库

        try {
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
            String user = "root";
            String password = "mysql";
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return con;
    }

    // 关闭数据库连接，释放资源
    public static void release(Statement stmt, Connection con) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            stmt = null;
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            con = null;
        }
    }

    public static void release(ResultSet rs, Statement stmt, Connection con) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            rs = null;
        }
        release(stmt, con);
    }
}
