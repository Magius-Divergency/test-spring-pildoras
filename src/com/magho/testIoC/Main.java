package com.magho.testIoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        /*
        Empleado empleadoUno = new JefeEmpleado();

        System.out.println(empleadoUno.getTareas());
         */

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        DirectorEmpleado Juan = context.getBean("miEmpleado", DirectorEmpleado.class);

        System.out.println(Juan.getTareas());
        System.out.println(Juan.getInforme());
        System.out.println(Juan.getEmail());
        System.out.println(Juan.getNombreEmpresa());

        SecretarioEmpleado Paco = context.getBean("secretarioEmpleado", SecretarioEmpleado.class);
        System.out.println(Paco.getTareas());
        System.out.println(Paco.getInforme());
        System.out.println(Paco.getEmail());
        System.out.println(Paco.getNombreEmpresa());

        context.close();
    }
}
