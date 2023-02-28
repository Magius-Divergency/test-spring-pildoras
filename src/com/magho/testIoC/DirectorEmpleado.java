package com.magho.testIoC;

public class DirectorEmpleado implements Empleado{

    private InformeInt informe;

    private String nombreEmpresa;
    private String email;

    // creación de contructor con inyección de dependencia
    public DirectorEmpleado(InformeInt informe){
        this.informe = informe;
    }


    // init. ejecutar tareas antes de que el bean esté disponible
    public void initMethod() {
        System.out.println("Tasks to execute before the bean is available");
    }

    // destroy. ejecutar tareas despues de que el bean se haya utilizado
    public void endMethod() {
        System.out.println("Tasks to execute after the bean has been used");
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
