package ej9;

import java.time.LocalDate;

public class PoliticaFlexible implements PoliticaCancelacion {
    @Override
    public double calcularPoliticaCancelacion(Reserva reserva, LocalDate fechaCancelacion) {
        return reserva.montoAPagar();
    }

    @Override
    public void pasarAPoliticaEstricta(AutoEnAlquiler auto) {
        auto.setPolitica(new PoliticaEstricta());
    }

    @Override
    public void pasarAPoliticaFlexible(AutoEnAlquiler auto) {
    }

    @Override
    public void pasarAPoliticaModerada(AutoEnAlquiler auto) {
        auto.setPolitica(new PoliticaModerada());
    }
}
