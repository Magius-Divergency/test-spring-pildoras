package com.magho.testIoC;

public class JefeEmpleado implements Empleado{

    private InformeInt informe;

    public JefeEmpleado(InformeInt informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas(){
        return "Tareas de Jefe";
    }

    @Override
    public String getInforme() {
        return "Informe del jefe: " + informe.getInforme();
    }
}
