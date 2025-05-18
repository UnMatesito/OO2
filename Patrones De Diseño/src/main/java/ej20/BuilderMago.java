package ej20;

public class BuilderMago extends Builder {
    @Override
    protected void agregarArmadura() {
        this.getPersonaje().setArmadura(new ArmaduraDeCuero());
    }

    @Override
    protected void agregarArma() {
        this.getPersonaje().setArma(new Baston());
    }

    @Override
    protected void agregarHabilidad() {
        this.getPersonaje().setHabilidad("Combate a distancia");
    }
}
