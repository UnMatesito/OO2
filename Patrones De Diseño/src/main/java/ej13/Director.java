package ej13;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void build(){
        this.builder.reset();
        this.builder.agregarPan();
        this.builder.agregarAderezo();
        this.builder.agregarPrincipal();
        this.builder.agregarAdicional();
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
