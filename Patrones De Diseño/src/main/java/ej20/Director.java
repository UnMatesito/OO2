package ej20;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void build(String nombre) {
        builder.reset(nombre);
        builder.agregarArmadura();
        builder.agregarArma();
        builder.agregarHabilidad();
    }
}
