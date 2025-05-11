package ej15;

import java.util.List;

public class ComputadoraIntermedio extends ComputadoraBuilder {
    @Override
    public void agregarProcesador(Catalogo catalogo) {
        this.getComputadora().setProcesador(List.of(catalogo.getComponente("Procesador Intermedio")));
    }

    @Override
    public void agregarMemoria(Catalogo catalogo) {
        this.getComputadora().setMemoria(List.of(catalogo.getComponente("16 GB")));
    }

    @Override
    public void agregarDiscoDuro(Catalogo catalogo) {
        this.getComputadora().setDiscoDuro(List.of(catalogo.getComponente("SSD 500 GB")));
    }

    @Override
    public void agregarTarjetaGrafica(Catalogo catalogo) {
        this.getComputadora().setTarjetaGrafica(List.of(catalogo.getComponente("GTX 1650")));
    }

    @Override
    public void agregarGabinete(Catalogo catalogo) {
        this.getComputadora().setGabinete(List.of(catalogo.getComponente("Gabinete Intermedio"), catalogo.getComponente("Fuente 800W")));
    }
}
