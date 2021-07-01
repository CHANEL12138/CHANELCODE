import com.chanelcode.controller.MyController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {



    @Test
    public void test()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        MyController mycontroller = applicationContext.getBean("myController", MyController.class);

        mycontroller.test();
    }
}

