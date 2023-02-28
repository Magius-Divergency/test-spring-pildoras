package com.magho.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ExperiencedVendor implements Employee{

    // como tenemos dos componentes que implementan la interfaz, debemos añadir la etiqueta qualifier para definir
    // cual es el bean que debe inyectar
    @Autowired
    @Qualifier("detailedCommercialReport")
    private ICommercialReport report;

    @Override
    public String getTasks() {
        return "Sell our products";
    }

    @Override
    public String getReport() {
        return report.getCommercialReport();
    }
}
