package oo2.ej1;

public abstract class Empleado {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;

    public Empleado(String nombre, String apellido, double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
    }

    public abstract double calcularAdicionales();

    public double aportesDel13Porciento(){
        return this.sueldoBasico * 0.13;
    }

    public double calcularSueldo(){
        return this.sueldoBasico + calcularAdicionales() - aportesDel13Porciento();
    }
}
