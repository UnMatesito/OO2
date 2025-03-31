package oo2.ej1;

public class EmpleadoPlanta extends EmpleadoConHijos{
    // ......

    public EmpleadoPlanta(String nombre, String apellido, double sueldoBasico, int cantidadHijos) {
        super(nombre,apellido,sueldoBasico,cantidadHijos);
    }

    public double remuneracionPorHijos() {
        return super.getCantidadHijos() * 2000;
    }
}
