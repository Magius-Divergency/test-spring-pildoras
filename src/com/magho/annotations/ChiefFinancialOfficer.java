package com.magho.annotations;

public class ChiefFinancialOfficer implements Employee{

    private ICommercialReport commercialReport;

    public ChiefFinancialOfficer(ICommercialReport commercialReport) {
        this.commercialReport = commercialReport;
    }

    @Override
    public String getTasks() {
        return "Tasks for the CFO";
    }

    @Override
    public String getReport() {
        return commercialReport.getCommercialReport();
    }

}
