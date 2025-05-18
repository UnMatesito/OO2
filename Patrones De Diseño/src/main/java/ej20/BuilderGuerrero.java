package ej20;

public class BuilderGuerrero extends Builder{
    @Override
    protected void agregarArmadura() {
        this.getPersonaje().setArmadura(new ArmaduraDeAcero());
    }

    @Override
    protected void agregarArma() {
        this.getPersonaje().setArma(new Espada());
    }

    @Override
    protected void agregarHabilidad() {
        this.getPersonaje().setHabilidad("Cuerpo a Cuerpo");
    }
}
