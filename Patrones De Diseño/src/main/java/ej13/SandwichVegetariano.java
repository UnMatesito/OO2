package ej13;

public class SandwichVegetariano extends Builder {

    @Override
    public void agregarPan() {
        this.getSandwich().setPan(new Ingrediente("Pan con Semillas", 120));
    }

    @Override
    public void agregarAderezo() {
        this.getSandwich().setAderezo(new Ingrediente("Sin Aderezo", 0));
    }

    @Override
    public void agregarPrincipal() {
        this.getSandwich().setPrincipal(new Ingrediente("Provoleta Grillada", 200));
    }

    @Override
    public void agregarAdicional() {
        this.getSandwich().setAdicional(new Ingrediente("Berenjenas al Escabeche", 100));
    }
}
