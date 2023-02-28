package com.magho.annotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ExperiencedVendor implements Employee, InitializingBean, DisposableBean {

    @Autowired
    @Qualifier("detailedCommercialReport")
    private ICommercialReport report;

    // ejecutado antes de la destrucción del bean
    @Override
    public void destroy() throws Exception {
        System.out.println("Executed before bean destruction.");
    }

    // ejecutado tras la creación del bean
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
