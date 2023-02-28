package com.magho.testIoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLifeCycle {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextBeanLifeCycle.xml");

        Empleado juan = context.getBean("miEmpleado", Empleado.class);

        // al ejecutarlo veremos que realiza las tareas del init antes de entregar el informe y las del destroy después
        System.out.println(juan.getInforme());

        context.close();

    }
}
