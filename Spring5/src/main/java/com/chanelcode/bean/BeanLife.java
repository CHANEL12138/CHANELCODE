package com.chanelcode.bean;

public class BeanLife {
    public BeanLife() {
        System.out.println("第一步 无参构造");
    }
    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步 set方法设置属性");
    }
    public void initMethod()
    {
        System.out.println("后置处理器");
        System.out.println("第三步 initialmethod执行初始化方法");
        System.out.println("后置处理器");    }

    public void destoryMethod()
    {
        System.out.println("第五步 执行销毁方法");
    }

}
