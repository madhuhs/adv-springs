package com.jspiders.springs.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2
{
    public static void main(String[] args)
    {
        System.out.println("Program starts...");

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

       LifeCycleDemo lifecycle = context.getBean("lifecycle",LifeCycleDemo.class);
       lifecycle.useBean();
       System.out.println("Program ends...");
    }
}
