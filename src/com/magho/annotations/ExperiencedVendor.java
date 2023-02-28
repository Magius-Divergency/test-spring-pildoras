package com.magho.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExperiencedVendor implements Employee{

    @Autowired
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
