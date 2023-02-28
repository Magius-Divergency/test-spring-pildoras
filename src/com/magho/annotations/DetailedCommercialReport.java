package com.magho.annotations;

import org.springframework.stereotype.Component;

@Component
public class DetailedCommercialReport implements ICommercialReport{

    @Override
    public String getCommercialReport() {
        return "Detailed commercial report presented.";
    }
}
