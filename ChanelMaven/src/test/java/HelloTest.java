import junit.framework.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void TestAdd1()
    {
        System.out.println("Test1 Starts");
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.add(50,60);
        Assert.assertEquals(110,res);
        System.out.println("Test1 ends");
    }
    @Test
    public void TestAdd2()
    {
        System.out.println("Test2 Starts");
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.add(52,62);
        Assert.assertEquals(114,res);
        System.out.println("Test2 ends");

    }
}
