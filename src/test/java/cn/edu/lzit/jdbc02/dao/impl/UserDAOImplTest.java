package cn.edu.lzit.jdbc02.dao.impl;

import cn.edu.lzit.jdbc02.dao.UserDAO;
import cn.edu.lzit.jdbc02.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDAOImplTest {

    @Test
    public void saveUseSt() {
        User user = new User("1","1","1","男","1","1");
        UserDAO dao = new UserDAOImpl();
        System.out.println(dao.saveUseSt(user));
    }

    @Test
    public void saveUsePS() {
        User user = new User("1","1","1","男","1","1");
        UserDAO dao = new UserDAOImpl();
        System.out.println(dao.saveUsePS(user));
    }

    @Test
    public void delete() {
        User user = new User();
        user.setNumber(1);
        UserDAO dao = new UserDAOImpl();
        System.out.println(dao.delete(user));
    }
    @Test
    public void update(){
        User user = new User(1,"1","1","1","女","1","1");
        UserDAO dao = new UserDAOImpl();
        System.out.println(dao.update(user));
    }

    @Test
    public void findByPartProperty() {
        UserDAO dao = new UserDAOImpl();
        User wxx = dao.findByPartProperty("wxx", "123456");
        System.out.println(wxx.getNumber());
        System.out.println(wxx.getPetName());
        System.out.println(wxx.getUserNameTrue());
        System.out.println(wxx.getUserPassword());
        System.out.println(wxx.getGender());
        System.out.println(wxx.getEmail());
        System.out.println(wxx.getAddress());
    }
}