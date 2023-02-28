package com.magho.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExperiencedVendor implements Employee{

    private ICommercialReport report;

    @Autowired
    public void createReport(ICommercialReport report) {
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
