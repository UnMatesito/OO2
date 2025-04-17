package ej9;

import java.time.LocalDate;

public class PoliticaModerada implements PoliticaCancelacion {
    @Override
    public double calcularPoliticaCancelacion(Reserva reserva, LocalDate fechaCancelacion) {
        if (fechaCancelacion.isBefore(reserva.getFecha().minusDays(7))){
            return reserva.montoAPagar();
        } else if (fechaCancelacion.isBefore(reserva.getFecha().minusDays(2))) {
            return reserva.montoAPagar() * 0.50;
        } else {
            return 0;
        }
    }

    @Override
    public void pasarAPoliticaFlexible(AutoEnAlquiler auto){
        auto.setPolitica(new PoliticaFlexible());
    }

    @Override
    public void pasarAPoliticaEstricta(AutoEnAlquiler auto) {
        auto.setPolitica(new PoliticaEstricta());
    }

    @Override
    public void pasarAPoliticaModerada(AutoEnAlquiler auto) {
    }
}
