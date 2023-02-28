package com.magho.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Employee juan = context.getBean("experiencedVendor", Employee.class);
        Employee paco = context.getBean("experiencedVendor", Employee.class);

        // muestran la misma dirección porque spring por defecto usa singleton
        System.out.println(juan.getTasks());
        System.out.println(juan.getReport());

        context.close();
    }
}
