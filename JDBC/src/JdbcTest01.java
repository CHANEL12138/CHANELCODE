import java.sql.*;
import java.util.ResourceBundle;


public class JdbcTest01 {
    public static void main(String[] args) {
        ResourceBundle rs = ResourceBundle.getBundle("MysqlDatabase");

        String username = rs.getString("username");
        String password = rs.getString("password");
        String sqlType = rs.getString("sqlType");
        String conninfo = rs.getString("conninfo");



        Connection coon = null;
        Statement stat = null;
        ResultSet rst = null;

        try {

            Class.forName(sqlType);
            coon = DriverManager.getConnection(conninfo,username,password);

            stat = coon.createStatement();

            String sql = "select * from emp";
            rst = stat.executeQuery(sql);
            while(rst.next())
            {
                for(int i = 1;i < 5;i++)
                {
                    System.out.print(rst.getString(i));
                    System.out.println(" ");
                }
                System.out.println(" \n");
            }




        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                rst.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                stat.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                coon.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


    }
}
