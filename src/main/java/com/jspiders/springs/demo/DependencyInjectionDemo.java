package com.jspiders.springs.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionDemo
{
    public static void main(String[] args)
    {
        System.out.println("Program starts...");

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Employee emp = context.getBean("employee", Employee.class);

        System.out.println(emp.getContact());
        System.out.println(emp.getAddress());

        System.out.println("ID     : "+emp.getId());
        System.out.println("Name   : "+emp.getName());
        System.out.println("Salary : "+emp.getSalary());

        System.out.println("Program ends...");
    }
}
