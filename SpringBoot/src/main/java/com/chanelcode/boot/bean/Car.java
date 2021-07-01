package com.chanelcode.boot.bean;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 从配置文件中读取以前缀.属性名开头
 *
 * @Component
 * //先加载组件
 * @ConfigurationProperties(prefix = "mycar")
 *
 * 或者
 * 在配置类中加载@EnableConfigurationProperties(Car.class)注解
 * 在加载的类上加@ConfigurationProperties(prefix = "mycar")注解
 */

@Data
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Integer price;

}
