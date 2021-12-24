package cn.edu.lzit.dbcp;

import java.sql.SQLException;
import org.apache.commons.dbutils.handlers.BeanHandler;
public class ResultSetTest1 {
    public static void testBeanHandler() throws SQLException {
        BaseDao basedao = new BaseDao();
        String sql = "select * from user1 where id=?";
        User user = (User) basedao.query(sql, new BeanHandler<User>(User.class), 1);
        System.out.print("id为1的User对象的name值为：" + user.getName());
    }
    public static void main(String[] args) throws SQLException {
        testBeanHandler();
    }
}