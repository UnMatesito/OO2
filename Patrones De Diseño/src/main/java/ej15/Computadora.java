package ej15;

import java.util.List;

public class Computadora {
    private List<Componente> procesador;
    private List<Componente> memoria;
    private List<Componente> discoDuro;
    private List<Componente> tarjetaGrafica;
    private List<Componente> gabinete;

    public void setProcesador(List<Componente> procesador) {
        this.procesador = procesador;
    }

    public void setMemoria(List<Componente> memoria) {
        this.memoria = memoria;
    }

    public void setDiscoDuro(List<Componente> discoDuro) {
        this.discoDuro = discoDuro;
    }

    public void setTarjetaGrafica(List<Componente> tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public void setGabinete(List<Componente> gabinete) {
        this.gabinete = gabinete;
    }

    public double getPrecio(){
        return getPrecioProcesador() + getPrecioMemoria() + getPrecioDiscoDuro() + getPrecioTarjetaGrafica() + getPrecioGabinete();
    }

    public double precioFinal(){
        return getPrecio() + (getPrecio() * 0.21);
    }

    public double consumo(){
        return getConsumoProcesador() + getConsumoMemoria() + getConsumoDiscoDuro() + getConsumoTarjetaGrafica() + getConsumoGabinete();
    }

    private double getPrecioProcesador(){
        return procesador.stream().mapToDouble(Componente::getPrecio).sum();
    }

    private double getPrecioMemoria(){
        return memoria.stream().mapToDouble(Componente::getPrecio).sum();
    }

    private double getPrecioDiscoDuro(){
        return discoDuro.stream().mapToDouble(Componente::getPrecio).sum();
    }

    private double getPrecioTarjetaGrafica(){
        return tarjetaGrafica.stream().mapToDouble(Componente::getPrecio).sum();
    }

    private double getPrecioGabinete(){
        return gabinete.stream().mapToDouble(Componente::getPrecio).sum();
    }

    private double getConsumoProcesador(){
        return procesador.stream().mapToDouble(Componente::getConsumo).sum();
    }

    private double getConsumoMemoria(){
        return memoria.stream().mapToDouble(Componente::getConsumo).sum();
    }

    private double getConsumoDiscoDuro(){
        return discoDuro.stream().mapToDouble(Componente::getConsumo).sum();
    }

    private double getConsumoTarjetaGrafica(){
        return tarjetaGrafica.stream().mapToDouble(Componente::getConsumo).sum();
    }

    private double getConsumoGabinete(){
        return gabinete.stream().mapToDouble(Componente::getConsumo).sum();
    }
}
