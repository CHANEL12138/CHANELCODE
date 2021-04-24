package bean;

public class LoginService {
    public String username;
    public String password;



    public boolean Login(String name,String password) {
        return (name.equals("admin") && password.equals("123")) ;
    }

    public void Logout()
    {
        System.out.println("You have logged out");
    }


}
