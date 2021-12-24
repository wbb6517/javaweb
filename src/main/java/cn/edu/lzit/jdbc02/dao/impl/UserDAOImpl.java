package cn.edu.lzit.jdbc02.dao.impl;

import cn.edu.lzit.jdbc02.dao.UserDAO;
import cn.edu.lzit.jdbc02.pojo.User;
import cn.edu.lzit.jdbc02.util.DatabaseFactory;

import java.sql.*;

public class UserDAOImpl implements UserDAO {
    Connection con = null;
    Statement stmt=null;
    PreparedStatement prst=null;
    ResultSet rs=null;

    //数据库操作，保存user对象代表的数据，插入成为一条记录,使用Statement
    public boolean saveUseSt(User user){

        try {

            user=solveNum(user);

            String sql = "INSERT INTO user(number,petname,userNameTrue,userPassword,gender,email,address) " +
                    "VALUES('"
                    + user.getNumber()
                    + "','"
                    + user.getPetName()
                    + "','"
                    + user.getUserNameTrue()
                    + "','"
                    + user.getUserPassword()
                    + "','"
                    + user.getGender()
                    + "','"
                    + user.getEmail()
                    + "','"
                    + user.getAddress() + "')";
            //System.out.println(sql);
            //返回插入影响的行数
            int num = stmt.executeUpdate(sql);
            if (num > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DatabaseFactory.release(rs,stmt,con);
        }
        return false;
    }

    //数据库操作，保存user对象代表的数据，插入成为一条记录,使用PreparedStatement
    public boolean saveUsePS(User user){

        try {

            user=solveNum(user);

            String sql ="INSERT INTO user(number,petname,userNameTrue,userPassword,gender,email,address) " +
                                    "VALUES(?,?,?,?,?,?,?)";
            prst = DatabaseFactory.getPreparedStatement(sql);
            prst.setInt(1,user.getNumber());
            prst.setString(2,user.getPetName());
            prst.setString(3,user.getUserNameTrue());
            prst.setString(4,user.getUserPassword());
            prst.setString(5,user.getGender());
            prst.setString(6,user.getEmail());
            prst.setString(7,user.getAddress());


            //System.out.println(sql);
            //返回插入影响的行数
            int num = prst.executeUpdate();
            if (num > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DatabaseFactory.release(rs,prst,con);
        }
        return false;
    }

    //处理number自动增长
    private User solveNum(User user) throws SQLException {
        // 获得Statement对象
        stmt= DatabaseFactory.getStatement();

        //插入之前先处理number问题
        int i=1;
        rs= stmt.executeQuery("SELECT * FROM user");
        while(rs.next()){
            if (rs.getInt("number")!=i){
                user.setNumber(i);
                break;
            }
            i++;
        }
        return user;
    }


    //数据库操作，删除user对象代表的记录
    public boolean delete(User user){
        boolean flag=true;
        try {
            stmt= DatabaseFactory.getStatement();
            // 发送SQL语句
            String sql = "DELETE FROM user WHERE number ='"+user.getNumber()+"'";
            int num = stmt.executeUpdate(sql);
            if (num > 0) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DatabaseFactory.release(rs,stmt,con);
        }
        return flag;
    }

    //修改数据库信息
    public boolean update(User user) {

        try {
            String sql ="UPDATE user set petName= ? ,userNameTrue= ? ,userPassword= ? ,gender= ?,email=?,address=? WHERE number=?";
            prst = DatabaseFactory.getPreparedStatement(sql);
            prst.setInt(7,user.getNumber());
            prst.setString(1,user.getPetName());
            prst.setString(2,user.getUserNameTrue());
            prst.setString(3,user.getUserPassword());
            prst.setString(4,user.getGender());
            prst.setString(5,user.getEmail());
            prst.setString(6,user.getAddress());

            int num = prst.executeUpdate();
            if (num > 0) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DatabaseFactory.release(rs,prst,con);
        }
        return false;
    }

    //数据库操作，查询该用户，取出数封装成User类对象
    public User findByPartProperty(String petName,String userPassword ){
        User user=null;

        try {
            stmt= DatabaseFactory.getStatement();
            rs= stmt.executeQuery("SELECT * FROM user WHERE petName='"+petName+"' and userPassword='"+userPassword+"'");
            while (rs.next()){
                user=new User();
                user.setNumber(rs.getInt("number"));
                user.setPetName(rs.getString(2));
                user.setUserNameTrue(rs.getString(3));
                user.setUserPassword(rs.getString(4));
                user.setGender(rs.getString(5));
                user.setEmail(rs.getString(6));
                user.setAddress(rs.getString(7));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DatabaseFactory.release(rs,stmt,con);
        }

        return user;
    }


}



