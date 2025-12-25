package com.jspiders.springs.demo.model;

import org.springframework.stereotype.Component;

@Component
public class ContactInfo
{
   private String email;
   private String mobile;
   private String workEmail;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
