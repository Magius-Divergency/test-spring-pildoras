package com.magho.annotations;

import org.springframework.stereotype.Component;

@Component
public class CommercialReport implements ICommercialReport{

    @Override
    public String getCommercialReport() {
        return "Commercial report presented.";
    }
}
