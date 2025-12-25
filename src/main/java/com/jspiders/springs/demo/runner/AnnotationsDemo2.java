package com.jspiders.springs.demo.runner;

import com.jspiders.springs.AppConfig;
import com.jspiders.springs.demo.Sample;
import com.jspiders.springs.demo.model.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationsDemo2
{
    public static void main(String[] args)
    {
        System.out.println("Program starts...");

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

       Employee emp = context.getBean("employee", Employee.class);

        System.out.println(emp.getId());

        System.out.println(emp.getContact());
        System.out.println(emp.getAddress());

        System.out.println("Program ends...");
    }
}
