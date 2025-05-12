package ej21;

import java.time.LocalDate;

public class MamiferoReal implements Mamifero{
    private String id;
    private String especie;
    private LocalDate fechaNacimiento;
    private Mamifero padre;
    private Mamifero madre;

    public String getIdentificador(){
        return id;
    }

    public String getEspecie(){
        return especie;
    }

    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }

    public Mamifero getPadre(){
        return padre;
    }

    public Mamifero getMadre(){
        return madre;
    }

    @Override
    public Mamifero getAbueloPaterno() {
        return padre.getPadre();
    }

    @Override
    public Mamifero getAbuelaPaterna() {
        return padre.getMadre();
    }

    @Override
    public Mamifero getAbueloMaterno() {
        return madre.getPadre();
    }

    @Override
    public Mamifero getAbuelaMaterna() {
        return madre.getMadre();
    }

    public boolean tieneComoAncestroA(Mamifero unMamifero){
        if (padre == unMamifero || madre == unMamifero){
            return true;
        }
        return padre.tieneComoAncestroA(unMamifero) || madre.tieneComoAncestroA(unMamifero);
    }
}
