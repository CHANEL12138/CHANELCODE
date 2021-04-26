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

