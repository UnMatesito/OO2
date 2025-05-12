package ej21;

import java.time.LocalDate;

public interface Mamifero {

    String getIdentificador();

    String getEspecie();

    LocalDate getFechaNacimiento();

    Mamifero getPadre();

    Mamifero getMadre();

    Mamifero getAbueloPaterno();

    Mamifero getAbuelaPaterna();

    Mamifero getAbueloMaterno();

    Mamifero getAbuelaMaterna();

    boolean tieneComoAncestroA(Mamifero unMamifero);
}
