package cn.edu.lzit.dbcp;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.*;
import java.sql.*;

public class Example01 {
    public static DataSource ds = null;
    static {
        // 获取DBCP数据源实现类对象
        BasicDataSource bds = new BasicDataSource();
        // 设置连接数据库需要的配置信息
        bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        bds.setUrl("jdbc:mysql://192.168.102.130:3306/jdbc");
        bds.setUsername("root");
        bds.setPassword("mysql");
        // 设置连接池的参数
        bds.setInitialSize(5);
        bds.setMaxActive(5);
        ds = bds;
    }
    public static void main(String[] args) throws SQLException {
        // 获取数据库连接对象
        Connection conn = ds.getConnection();
        //获取数据库连接信息
        DatabaseMetaData metaData = conn.getMetaData();
        //打印数据库连接信息
        System.out.println(metaData.getURL()
                +",UserName="+metaData.getUserName()
                +","+metaData.getDriverName());
    }

}
