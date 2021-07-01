import com.chanelcode.bean.BeanLife;
import com.chanelcode.bean.Book;
import com.chanelcode.bean.Stu;
import com.chanelcode.bean.UserAnno;
import com.chanelcode.dao.UserDao;
import com.chanelcode.dao.UserDaoImp;
import com.chanelcode.service.Books;
import com.chanelcode.service.UserService;
import com.chanelcode.util.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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



    @org.junit.Test
    public void test2()
    {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("config.xml");

        Books books = applicationContext.getBean("books",Books.class);

        Book book = books.getBook();
        System.out.println(book);
    }


    @org.junit.Test
    public void testCollection()
    {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("config1.xml");

        Stu stu = applicationContext.getBean("stu", Stu.class);

        System.out.println(stu);

    }

    @org.junit.Test
    public void testFactoryBean()
    {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("config1.xml");
        Book book = applicationContext.getBean("facbook",Book.class);
        System.out.println(book);
    }

    @org.junit.Test
    public void testBeanLife()
    {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("config1.xml");
        System.out.println("第四步 创建bean实例对象");
        BeanLife beanLife = applicationContext.getBean("life",BeanLife.class);
        System.out.println(beanLife);

        ((ClassPathXmlApplicationContext) applicationContext).close();
    }


    @org.junit.Test
    public void testAnno()
    {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("configAnno.xml");

       UserService userService = applicationContext.getBean("userService",UserService.class);

       userService.add();


    }





    @org.junit.Test
    public void testSpringConfig()
    {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService = applicationContext.getBean("userService",UserService.class);

        userService.add();


    }

}
