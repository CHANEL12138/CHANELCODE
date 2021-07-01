package com.chanelcode.boot.bean;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("pet")
@Data
public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

}
