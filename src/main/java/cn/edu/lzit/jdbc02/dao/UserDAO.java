package cn.edu.lzit.jdbc02.dao;

import cn.edu.lzit.jdbc02.pojo.User;

public interface UserDAO {
    public boolean saveUsePS(User user);
    public boolean saveUseSt(User user);
    public boolean delete(User user);
    public boolean update(User user);
    public User findByPartProperty(String userName,String userPassword );

}
