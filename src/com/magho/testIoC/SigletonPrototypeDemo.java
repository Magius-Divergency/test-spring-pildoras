package com.magho.testIoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SigletonPrototypeDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextPrototype.xml");

        SecretarioEmpleado Paco = context.getBean("secretarioEmpleado", SecretarioEmpleado.class);
        SecretarioEmpleado Pedro = context.getBean("secretarioEmpleado", SecretarioEmpleado.class);

        // como hemos modificado el scope, los objetos ya no apuntan a la misma dirección de memoria
        System.out.println(Paco);
        System.out.println(Pedro);

        if(Paco == Pedro) {
            System.out.println("Es el mismo objeto");
        }
    }
}
