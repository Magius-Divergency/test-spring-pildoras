package com.magho.annotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ExperiencedVendor implements Employee, InitializingBean, DisposableBean {

    @Autowired
    @Qualifier("detailedCommercialReport")
    private ICommercialReport report;

    @Override
    public void destroy() throws Exception {
        System.out.println("Executed before bean destruction.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Executed after bean creation.");
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
