package ej14;

public abstract class Prestamo {
    private double liquidez;

    public Prestamo(double liquidez) {
        this.liquidez = liquidez;
    }

    public double getLiquidez() {
        return liquidez;
    }

    public abstract double calcularValor();

    public double valorPrendario(){
        return calcularValor() * liquidez;
    }
}
