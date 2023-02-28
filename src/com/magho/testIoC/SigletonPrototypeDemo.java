package com.magho.testIoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SigletonPrototypeDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        SecretarioEmpleado Paco = context.getBean("secretarioEmpleado", SecretarioEmpleado.class);
        SecretarioEmpleado Pedro = context.getBean("secretarioEmpleado", SecretarioEmpleado.class);

        // comprobamos que como por defecto spring usa el patron singleton, ambos objetos apuntan a la misma direccion
        // de memoria
        System.out.println(Paco);
        System.out.println(Pedro);

        if(Paco == Pedro) {
            System.out.println("Es el mismo objeto");
        }
    }
}
