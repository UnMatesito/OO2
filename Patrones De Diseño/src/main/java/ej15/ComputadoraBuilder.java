package ej15;

public abstract class ComputadoraBuilder {
    private Computadora computadora;

    public void reset(){
        this.computadora = new Computadora();
    }

    public Computadora getComputadora(){
        return this.computadora;
    }

    public abstract void agregarProcesador(Catalogo catalogo);
    public abstract void agregarMemoria(Catalogo catalogo);
    public abstract void agregarDiscoDuro(Catalogo catalogo);
    public abstract void agregarTarjetaGrafica(Catalogo catalogo);
    public abstract void agregarGabinete(Catalogo catalogo);
}
