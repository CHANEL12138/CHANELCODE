package com.chanelcode.boot;

import com.chanelcode.boot.bean.Pet;
import com.chanelcode.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**主程序类
 * @SpringBootApplication 这是一个SpringBoot应用
 */


@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);


        User userBean = run.getBean("UserBean", User.class);
        System.out.println(userBean);


        Pet pet = userBean.getPet();
        Pet petBean = run.getBean("PetBean", Pet.class);


        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法。默认为true
        // SpringBoot总会检查这个组件是否在容器中有。
        //保持组件单实例
        System.out.println(pet==petBean);


    }
}
