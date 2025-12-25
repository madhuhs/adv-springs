package com.jspiders.springs.demo.runner;

import com.jspiders.springs.AppConfig;
import com.jspiders.springs.demo.Sample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemo
{
    public static void main(String[] args)
    {
        System.out.println("Program starts...");

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        Sample s1 = context.getBean("sample",Sample.class);

        s1.showValue();

        s1.increment();
        s1.showValue();

        System.out.println("Program ends...");
    }
}
