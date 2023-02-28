package com.magho.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // cambiar el contexto para que lo tome de la clase de configuración
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee juan = context.getBean("experiencedVendor", Employee.class);
        Employee paco = context.getBean("experiencedVendor", Employee.class);

        System.out.println(juan.getTasks());
        System.out.println(juan.getReport());

        context.close();
    }
}
