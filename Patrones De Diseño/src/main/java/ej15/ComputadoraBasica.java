package ej15;

import java.util.List;

public class ComputadoraBasica extends ComputadoraBuilder{
    @Override
    public void agregarProcesador(Catalogo catalogo) {
        this.getComputadora().setProcesador(List.of(catalogo.getComponente("Procesador Basico")));
    }

    @Override
    public void agregarMemoria(Catalogo catalogo) {
        this.getComputadora().setMemoria(List.of(catalogo.getComponente("8 GB")));
    }

    @Override
    public void agregarDiscoDuro(Catalogo catalogo) {
        this.getComputadora().setDiscoDuro(List.of(catalogo.getComponente("HDD 500 GB")));
    }

    @Override
    public void agregarTarjetaGrafica(Catalogo catalogo) {
        this.getComputadora().setTarjetaGrafica(null);
    }

    @Override
    public void agregarGabinete(Catalogo catalogo) {
        this.getComputadora().setGabinete(List.of(catalogo.getComponente("Gabinete Estandar"), catalogo.getComponente("Fuente estándar")));
    }
}
