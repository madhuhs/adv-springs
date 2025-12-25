package com.jspiders.springs.demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleDemo implements
        InitializingBean,
        BeanNameAware,
        DisposableBean {

    public LifeCycleDemo() {
        System.out.println("1. Bean creation");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("2. setBeanName executed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("3. afterPropertiesSet executed");
    }
    public void useBean(){
        System.out.println("4. Bean utilisation");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("5. destroy executed");
    }
}


