package oo2.ej1;

public class EmpleadoTemporario extends EmpleadoConHijos{
    public double horasTrabajadas = 0;
    // ......

    public EmpleadoTemporario(String nombre, String apellido, double sueldoBasico, int cantidadHijos, double horasTrabajadas) {
        super(nombre, apellido, sueldoBasico, cantidadHijos);
        this.horasTrabajadas = horasTrabajadas;
    }

    public double remuneracionPorHijos(){
        return (super.getCantidadHijos() * 1000) + (horasTrabajadas * 500);
    }
}
