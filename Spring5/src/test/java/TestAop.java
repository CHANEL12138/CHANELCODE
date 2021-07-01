import com.chanelcode.aopAnno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {


    @Test
    public void testAopBefore()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configaop.xml");
        User user = applicationContext.getBean("user", User.class);
        user.add();


    }


}
