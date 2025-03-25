package oo2.ej1;

public class EmpleadoPlanta extends Empleado{
    public int cantidadHijos = 0;
    // ......

    public double sueldo() {
        return this.sueldoBasico + (this.cantidadHijos * 2000) - (this.sueldoBasico * 0.13);
    }
}
