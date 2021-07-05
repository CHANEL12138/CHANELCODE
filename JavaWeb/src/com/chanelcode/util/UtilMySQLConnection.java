package com.chanelcode.util;

import java.sql.*;

public class UtilMySQLConnection {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public UtilMySQLConnection() {}
    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/users","root","15826287139Chen");
        return conn;
    }

    public static void close (Connection conn, PreparedStatement stat, ResultSet rs)
    {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            if (stat != null) {
                stat.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

