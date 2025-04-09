package ej2;

public abstract class Personal{
    public double sueldo(){
        return this.basico() + this.adicional() - this.descuento();
    }

    protected abstract double basico();

    protected abstract double adicional();

    private double descuento(){
        return (this.basico() * 0.13) + (this.descuento() * 0.5);
    }
}
