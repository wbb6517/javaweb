package cn.edu.lzit.jdbcutils;

import org.junit.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DBUtilsDaoTest {

    private static DBUtilsDao dao = new DBUtilsDao();

    @Test
    public void findAll() throws SQLException {
        ArrayList<User> list = (ArrayList<User>) dao.findAll();
        for (int i = 0; i < list.size(); i++){
            System.out.println("第" + (i + 1) + "条数据的username值为:"
                    + list.get(i).getName());
        }

    }

    @Test
    public void find() throws SQLException {
        User user = dao.find(2);
        System.out.println(user.getId() + "," + user.getName() + ","
                + user.getPassword());
    }

    @Test
    public void insert() throws SQLException {
        User user = new User();
        user.setName("赵四");
        user.setPassword("444444");
        boolean b = dao.insert(user);
        System.out.println(b);
    }

    @Test
    public void update() throws SQLException {
        User user = new User();
        user.setName("赵四");
        user.setPassword("666777");
        user.setId(4);
        boolean b = dao.update(user);
        System.out.println(b);
    }

    @Test
    public void delete() throws SQLException {
        boolean b = dao.delete(4);
        System.out.println(b);
    }
}