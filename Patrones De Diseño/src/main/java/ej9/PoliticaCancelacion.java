package ej9;

import java.time.LocalDate;

public interface PoliticaCancelacion {
    double calcularPoliticaCancelacion(Reserva reserva, LocalDate fechaCancelacion);

    void pasarAPoliticaFlexible(AutoEnAlquiler auto);

    void pasarAPoliticaModerada(AutoEnAlquiler auto);

    void pasarAPoliticaEstricta(AutoEnAlquiler auto);
}
