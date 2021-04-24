
import bean.LoginService;

import java.lang.reflect.Method;

public class ReflectTest08 {
    public static void main(String[] args) throws Exception{
        LoginService loginService = new LoginService();
        System.out.println(loginService.Login("admin","123"));



        //通过反射机制调方法

        Class loginclass = loginService.getClass();
        Method loginmethod = loginclass.getDeclaredMethod("Login", String.class, String.class);


        System.out.println(loginmethod.invoke(loginService,"admin","123433"));



        Method logoutmethod = loginclass.getDeclaredMethod("Logout");
        logoutmethod.invoke(loginService);


    }
}
