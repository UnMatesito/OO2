package ej18;

public class DecoratorPermisos extends Decorator{
    public DecoratorPermisos(Component component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return this.getComponent().prettyPrint() + " - " + this.getPermisos();
    }
}
