package com.chanelcode.UserDAO;

import com.chanelcode.entity.User;
import com.chanelcode.util.UtilMySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public int add(User user)
    {
        String sql = "insert into users(Username,Password,sex,email)" +
                "values(?,?,?,?)";
        Connection conn = null;
        PreparedStatement pre = null;
        int result = 0;
        try {
            conn = UtilMySQLConnection.getConnection();
            pre = conn.prepareStatement(sql);
            pre.setString(1,user.getUsername());
            pre.setString(2,user.getPassword());
            pre.setString(3,user.getSex());
            pre.setString(4,user.getEmail());
            result = pre.executeUpdate();




        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            UtilMySQLConnection.close(conn,pre,null);
        }
        return result;
    }


    public List<User> find()
    {
        String sql = "select * from users";
        Connection connection = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        List<User> ls = new ArrayList<>();
        try {
            connection = UtilMySQLConnection.getConnection();
            pre = connection.prepareStatement(sql);
            rs = pre.executeQuery();
            while (rs.next())
            {
                Integer UserID = rs.getInt("UserID");
                String Username = rs.getString("Username");
                String Password = rs.getString("Password");
                String sex = rs.getString("sex");
                String email = rs.getString("email");
                User user = new User(UserID,Username,Password,sex,email);
                ls.add(user);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            UtilMySQLConnection.close(connection,pre,rs);
        }
        return ls;
    }


    public int delete(String Userid)
    {
        String sql = "delete from users where UserID=?";
        Connection conn = null;
        PreparedStatement pre = null;
        int result = 0;
        try {
            conn = UtilMySQLConnection.getConnection();
            pre = conn.prepareStatement(sql);
            pre.setString(1,Userid);
            result = pre.executeUpdate();




        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            UtilMySQLConnection.close(conn,pre,null);
        }
        return result;
    }

    public int login(String Username,String password)
    {
        String sql = "select count(*) from users where Username = ? and Password = ?";
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        int result = 0;
        try {
            conn = UtilMySQLConnection.getConnection();
            pre = conn.prepareStatement(sql);
            pre.setString(1,Username);
            pre.setString(2,password);
            rs = pre.executeQuery();
            while (rs.next())
            {
                result = rs.getInt("count(*)");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            UtilMySQLConnection.close(conn,pre,rs);
        }
        return result;
    }
}

