import java.io.FileInputStream;
import java.util.Properties;

public class IOPropertiesTest01 {
    public static void main(String[] args) throws Exception{
        FileInputStream fl = new FileInputStream("src/main/java/userconfig");
        Properties ps = new Properties();
        ps.load(fl);
        String ss = ps.getProperty("username");
        System.out.println(ss);

    }
}
