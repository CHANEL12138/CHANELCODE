import com.chanelcode.bean.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test()
    {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("config.xml");

        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book);


        Book book1 = applicationContext.getBean("book1",Book.class);
        System.out.println(book1);



    }
}
