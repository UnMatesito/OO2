package ej18;

public class DecoratorExtension extends Decorator{
    public DecoratorExtension(Component component) {
        super(component);
    }

    @Override
    public String prettyPrint(){
        return this.getComponent().prettyPrint() + " - " + this.getExtension();
    }
}
