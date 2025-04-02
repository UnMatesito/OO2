package oo2.ej4;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    private LocalDate fechaAlta;

    public LocalDate getFechaAlta() {
        return this.fechaAlta;
    }

    public int getAñosDesdeFechaAlta() {
        return Period.between(this.fechaAlta, LocalDate.now()).getYears();
    }
}
