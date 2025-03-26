package oo2.ej1;

public class EmpleadoPasante extends Empleado{
    // ......

    public EmpleadoPasante(String nombre, String apellido, double sueldoBasico) {
        super(nombre, apellido, sueldoBasico);
    }

    public double calcularAdicionales(){
        return 0;
    }
}
