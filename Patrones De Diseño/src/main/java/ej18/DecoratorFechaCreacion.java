package ej18;

public class DecoratorFechaCreacion extends Decorator{
    public DecoratorFechaCreacion(Component component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return this.getComponent().prettyPrint() + " - " + this.getFechaCreacion();
    }
}
