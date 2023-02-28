package com.magho.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExperiencedVendor implements Employee{

    private ICommercialReport report;

    // spring con autowired comprueba el proyecto para ver si hay alguna clase que implemente la interfaz y de esa clase
    // obtiene la inyección de dependencia
    @Autowired
    public ExperiencedVendor(ICommercialReport report) {
        this.report = report;
    }

    @Override
    public String getTasks() {
        return "Sell our products";
    }

    @Override
    public String getReport() {
        return report.getCommercialReport();
    }
}
