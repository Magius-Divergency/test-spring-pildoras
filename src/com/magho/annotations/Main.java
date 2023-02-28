package com.magho.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee juan = context.getBean("ExperiencedVendor", Employee.class);

        System.out.println(juan.getTasks());
        System.out.println(juan.getReport());

        context.close();
    }
}
