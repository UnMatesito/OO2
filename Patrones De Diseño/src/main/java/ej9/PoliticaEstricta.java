package ej9;

import java.time.LocalDate;

public class PoliticaEstricta implements PoliticaCancelacion {
    @Override
    public double calcularPoliticaCancelacion(Reserva reserva, LocalDate fechaCancelacion) {
        return 0;
    }

    @Override
    public void pasarAPoliticaFlexible(AutoEnAlquiler auto) {
        auto.setPolitica(new PoliticaFlexible());
    }

    @Override
    public void pasarAPoliticaModerada(AutoEnAlquiler auto) {
        auto.setPolitica(new PoliticaModerada());
    }

    @Override
    public void pasarAPoliticaEstricta(AutoEnAlquiler auto) {
    }
}
