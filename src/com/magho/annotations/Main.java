package com.magho.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee empleado = context.getBean("chiefFinancialOfficer", Employee.class);

        System.out.println(empleado.getTasks());
        System.out.println(empleado.getReport());

        context.close();
    }
}
