package ej18;

public class DecoratorFechaModificacion extends Decorator{
    public DecoratorFechaModificacion(Component component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return this.getComponent().prettyPrint() + " - " + this.getFechaModificacion();
    }
}
