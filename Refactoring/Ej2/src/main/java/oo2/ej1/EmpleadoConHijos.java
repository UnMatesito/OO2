package oo2.ej1;

public abstract class EmpleadoConHijos extends Empleado{
    private int cantidadHijos = 0;

    public EmpleadoConHijos(String nombre, String apellido, double sueldoBasico, int cantidadHijos) {
        super(nombre,apellido,sueldoBasico);
        this.cantidadHijos = cantidadHijos;
    }

    public double calcularAdicionales() {
        return remuneracionPorHijos();
    }

    public int getCantidadHijos(){
        return cantidadHijos;
    }

    public abstract double remuneracionPorHijos();
}
