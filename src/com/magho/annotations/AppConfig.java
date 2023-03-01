package com.magho.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.magho.annotations")
public class AppConfig {

    //define el bean para shopping commercial report
    @Bean
    public ICommercialReport shoppingDepartmentReport() { //será el id del bean para inyectarlo
        return new ShoppingCommercialReport();
    }

    //definir el bean para CFO e inyectar dependencias
    @Bean
    public Employee chiefFinancialOfficer(){
        return new ChiefFinancialOfficer(shoppingDepartmentReport());
    }
}
