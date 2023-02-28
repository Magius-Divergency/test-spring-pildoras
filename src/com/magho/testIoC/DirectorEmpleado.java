package com.magho.testIoC;

public class DirectorEmpleado implements Empleado{

    private InformeInt informe;

    private String nombreEmpresa;
    private String email;

    // creación de contructor con inyección de dependencia
    public DirectorEmpleado(InformeInt informe){
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "Tareas del director";
    }

    @Override
    public String getInforme() {
        return "Informe del director: " + informe.getInforme();
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
