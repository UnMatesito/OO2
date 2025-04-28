package ej13;

public class SandwichSinTACC extends Builder{

    @Override
    public void agregarPan() {
        this.getSandwich().setPan(new Ingrediente("Pan de Chipa", 150));
    }

    @Override
    public void agregarAderezo() {
        this.getSandwich().setAderezo(new Ingrediente("Salsa Tartara", 18));
    }

    @Override
    public void agregarPrincipal() {
        this.getSandwich().setPrincipal(new Ingrediente("Carne de Pollo", 250));
    }

    @Override
    public void agregarAdicional() {
        this.getSandwich().setAdicional(new Ingrediente("Verduras grillada", 200));
    }
}
