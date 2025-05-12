package ej21;

import java.time.LocalDate;

public class MamiferoNull implements Mamifero{

    @Override
    public String getIdentificador() {
        return "Anonimo";
    }

    @Override
    public String getEspecie() {
        return "Anonimo";
    }

    @Override
    public LocalDate getFechaNacimiento() {
        return null;
    }

    @Override
    public Mamifero getPadre() {
        return this;
    }

    @Override
    public Mamifero getMadre() {
        return this;
    }

    @Override
    public Mamifero getAbueloPaterno() {
        return this;
    }

    @Override
    public Mamifero getAbuelaPaterna() {
        return this;
    }

    @Override
    public Mamifero getAbueloMaterno() {
        return this;
    }

    @Override
    public Mamifero getAbuelaMaterna() {
        return this;
    }

    @Override
    public boolean tieneComoAncestroA(Mamifero unMamifero) {
        return false;
    }
}
