package com.chanelcode.boot;

import com.chanelcode.boot.bean.Pet;
import com.chanelcode.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods：代理bean的方法
 *      Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 *      Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 *      组件依赖必须使用Full模式默认。其他默认是否Lite模式
 *
 *
 *
 * 4、@Import({User.class, DBHelper.class})
 *      给容器中自动创建出这两个类型的组件、默认组件的名字就是全类名
 */

/**
 * @Import({User.class})
 * 加载组件 调用该类的无参构造方法
 */

/**
 * @ImportResource("classpath:config.xml")
 * 加载xml配置文件
 *
 */

/**
 * @ConditionalOnBean(name="Lucy")
 * 条件装配
*装到类上的时候条件满足后才会加载类上的组件
*装到方法上的时候条件满足后才会加载对应方法的组件
*
* */
//@Configuration(proxyBeanMethods = false)  在容器中不会保存 每次调用都是多例
@Configuration
public class Config {


    @Bean
    public User UserBean()
    {
        User chanel = new User("CHANEL", 14);
        chanel.setPet(PetBean());
        return chanel;
    }

    @Bean
    public Pet PetBean()
    {
        return new Pet("Lucy");
    }
}
