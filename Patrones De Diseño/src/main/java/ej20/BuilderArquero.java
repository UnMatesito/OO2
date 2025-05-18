package ej20;

public class BuilderArquero extends Builder{
    @Override
    protected void agregarArmadura() {
        this.getPersonaje().setArmadura(new ArmaduraDeCuero());
    }

    @Override
    protected void agregarArma() {
        this.getPersonaje().setArma(new Arco());
    }

    @Override
    protected void agregarHabilidad() {
        this.getPersonaje().setHabilidad("Combate a disparo de flechas");
    }
}
