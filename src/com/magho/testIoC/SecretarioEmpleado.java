package com.magho.testIoC;

public class SecretarioEmpleado implements Empleado{

    private InformeInt informe;

    private String nombreEmpresa;
    private String email;

    public void setInforme(InformeInt informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "Tareas de secretario";
    }

    @Override
    public String getInforme() {
        return "Informe del secretario: " + informe.getInforme();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
