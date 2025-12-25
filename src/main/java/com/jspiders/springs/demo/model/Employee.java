package com.jspiders.springs.demo.model;

import com.jspiders.springs.demo.model.Address;
import com.jspiders.springs.demo.model.ContactInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//<bean>
public class Employee
{
   private int id;
   private String name;
   private double salary;
   private ContactInfo contact;
   private Address address;

   //Injecting dependency in Constructor
    @Autowired
    public Employee(ContactInfo contact)
   {
       this.contact = contact;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ContactInfo getContact() {
        return contact;
    }

    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }
}
