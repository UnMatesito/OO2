package ej13;

public class SandwichVegano extends Builder {

    @Override
    public void agregarPan() {
        this.getSandwich().setPan(new Ingrediente("Pan Integral", 100));
    }

    @Override
    public void agregarAderezo() {
        this.getSandwich().setAderezo(new Ingrediente("Salsa Criolla", 20));
    }

    @Override
    public void agregarPrincipal() {
        this.getSandwich().setPrincipal(new Ingrediente("Milanesa de Girgolas", 500));
    }

    @Override
    public void agregarAdicional() {
        this.getSandwich().setAdicional(new Ingrediente("Sin Adicional", 0));
    }
}
