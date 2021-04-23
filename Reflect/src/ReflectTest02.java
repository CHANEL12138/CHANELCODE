import Reflect.bean.User;

import java.io.FileReader;
import java.util.Properties;

public class ReflectTest02 {
    public static void main(String[] args) throws Exception{
        FileReader reader = new FileReader("src/main/java/Reflect/classinfo.properties");
        Properties pro = new Properties();
        pro.load(reader);
        reader.close();

        String classname = pro.getProperty("classname");
        Class a = Class.forName(classname);
        Object obj = a.newInstance();
        System.out.println(obj);

        a = User.class;
        obj = a.newInstance();
        System.out.println(obj);
        System.out.println(a);


        User user = new User();
        a = user.getClass();
        System.out.println(a);

    }
}
