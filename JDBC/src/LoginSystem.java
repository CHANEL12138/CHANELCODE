import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;


public class LoginSystem {
    public static void main(String[] args) {
        Map<String,String> LoginMap = Init();
        boolean IsLogin = Login(LoginMap);


    }

    private static boolean Login(Map<String, String> loginMap) {
        ResourceBundle resourceBundle =
                ResourceBundle.getBundle("MysqlDatabase");
        String SqlType = resourceBundle.getString("sqlType");
        String conninfo = resourceBundle.getString("conninfo");
        String LoginU = loginMap.get("username");
        String LoginP = loginMap.get("password");


        Connection conn = null;

        try {
            Class.forName(SqlType);
            conn = DriverManager.getConnection(conninfo,LoginU,LoginP);






        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }


    }


    private static Map<String,String> Init() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String LoginN = input.nextLine();
        System.out.print("请输入密码：");
        String LoginP = input.nextLine();

        Map<String,String> LoginMap = new HashMap<>();
        LoginMap.put("username",LoginN);
        LoginMap.put("password",LoginP);

        return LoginMap;
    }
}
