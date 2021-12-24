package cn.edu.lzit.jdbc02.util;

import java.sql.*;

/**
 * 提供Connection和Statement接口的类
 */
public class DatabaseFactory {
    static Connection con=null;
    //static Statement stmt=null;

    public static Connection getConnection() {
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

    public static Statement getStatement() throws SQLException {
        //返回sql语句对象,支持滚动结果集
        return getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    }

    public static PreparedStatement getPreparedStatement(String sql) throws SQLException {
        return getConnection().prepareStatement(sql);
    }


    // 关闭数据库连接，释放资源
    public static void release(ResultSet rs, Statement stmt, Connection con) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            rs = null;
        }
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
}
