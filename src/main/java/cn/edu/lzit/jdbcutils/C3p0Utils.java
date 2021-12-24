package cn.edu.lzit.jdbcutils;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class C3p0Utils {
    private static DataSource ds;
    static {
        //采用默认配置
        ds = new ComboPooledDataSource();
    }

    //提供数据源配置
    public static DataSource getDataSource() {
        return ds;
    }

    //提供连接对象
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}