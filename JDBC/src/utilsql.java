import org.junit.Test;

import java.sql.*;


public class utilsql {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public utilsql() {}

    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.
                getConnection("jdbc:mysql://localhost:" +
                        "3306/bjpowernode","root","15826287139Chen");
        return conn;
    }
    @Test
    public void test() throws Exception
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.
                getConnection("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=mybatis" ,"ssa","123456");

    }

    public static void close (Connection conn, Statement stat, ResultSet rs)
    {
        try {
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            stat.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

