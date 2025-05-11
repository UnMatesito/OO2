package ej15;

public class Director {
    private ComputadoraBuilder builder;
    private Catalogo catalogo;

    public void setBuilder(ComputadoraBuilder builder) {
        this.builder = builder;
    }

    public void build(){
        builder.reset();
        builder.agregarProcesador(catalogo);
        builder.agregarMemoria(catalogo);
        builder.agregarDiscoDuro(catalogo);
        builder.agregarTarjetaGrafica(catalogo);
        builder.agregarGabinete(catalogo);
    }
}
