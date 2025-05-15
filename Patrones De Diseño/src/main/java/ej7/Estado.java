package ej7;

public abstract class Estado {
    private double total;

    public Estado() {
        total = 0;
    }

    public abstract double setValor(double valor);
    public abstract double sumar();
    public abstract double restar();
    public abstract double multiplicar();
    public abstract double dividir();

    public abstract void error(Calculadora calculadora);{
        if (esOperacion()){
            ;
        }
    }

    private boolean esOperacion() {
        return false;
    }
}
