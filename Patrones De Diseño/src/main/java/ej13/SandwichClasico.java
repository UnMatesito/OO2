package ej13;

public class SandwichClasico extends Builder{

    @Override
    public void agregarPan() {
        this.getSandwich().setPan(new Ingrediente("Pan Brioche", 100));
    }

    @Override
    public void agregarAderezo() {
        this.getSandwich().setAderezo(new Ingrediente("Base de Mayonesa", 20));
    }

    @Override
    public void agregarPrincipal() {
        this.getSandwich().setPrincipal(new Ingrediente("Carne de Ternera", 300));
    }

    @Override
    public void agregarAdicional() {
        this.getSandwich().setAdicional(new Ingrediente("Tomate", 80));
    }
}
