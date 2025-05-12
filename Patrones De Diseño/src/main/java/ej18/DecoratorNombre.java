package ej18;

public class DecoratorNombre extends Decorator{
    public DecoratorNombre(Component component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return this.getNombre();
    }
}
