package ej18;

public class DecoratorTamaño extends Decorator{
    public DecoratorTamaño(Component component) {
        super(component);
    }

    @Override
    public String prettyPrint() {
        return this.getComponent().prettyPrint() + " - " + this.getTamaño();
    }
}
