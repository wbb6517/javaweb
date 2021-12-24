package cn.edu.lzit.jdbc02.util;

import org.junit.Test;

import java.sql.*;

import static org.junit.Assert.*;

public class JDBCUtilsTest {

    @Test
    public void getConnection() {
        Connection con = null;     //用于连接数据库
        Statement stmt = null;     //用于执行SQL语句
        ResultSet rs = null;

        try {
            //静态方法
            //con = DatabaseFactory.getConnection();

            //System.out.println("成功连接数据库！");
            //stmt = con.createStatement();
            stmt = DatabaseFactory.getStatement();
            rs = stmt.executeQuery("select * from comment");
            while (rs.next()) {
                System.out.print(rs.getString(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getDate(3) + "\t");
                System.out.print(rs.getString(4));

                System.out.println();
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            DatabaseFactory.release(rs,stmt,con);
        }
    }
}