package ej15;

import java.util.List;

public class ComputadoraGamer extends ComputadoraBuilder {
    @Override
    public void agregarProcesador(Catalogo catalogo) {
        this.getComputadora().setProcesador(List.of(catalogo.getComponente("Procesador Gamer"), catalogo.getComponente("Pad Termico"), catalogo.getComponente("Cooler")));
    }

    @Override
    public void agregarMemoria(Catalogo catalogo) {
        this.getComputadora().setMemoria(List.of(catalogo.getComponente("32 GB"), catalogo.getComponente("32 GB")));
    }

    @Override
    public void agregarDiscoDuro(Catalogo catalogo) {
        this.getComputadora().setDiscoDuro(List.of(catalogo.getComponente("SSD 500 GB"), catalogo.getComponente("SSD 1 TB")));
    }

    @Override
    public void agregarTarjetaGrafica(Catalogo catalogo) {
        this.getComputadora().setTarjetaGrafica(List.of(catalogo.getComponente("RTX 4090")));
    }

    @Override
    public void agregarGabinete(Catalogo catalogo) {
        this.getComputadora().setGabinete(List.of(catalogo.getComponente("Gabinete Gamer"), catalogo.getComponente("fuente " + (this.getComputadora().consumo() + (this.getComputadora().consumo() * 0.50)) + "W")));
    }
}
