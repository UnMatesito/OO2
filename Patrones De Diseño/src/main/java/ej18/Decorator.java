package ej18;

import java.time.LocalDate;

public abstract class Decorator implements Component{
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public Component getComponent() {
        return component;
    }

    @Override
    public String getNombre() {
        return component.getNombre();
    }

    @Override
    public String getExtension() {
        return component.getExtension();
    }

    @Override
    public int getTamaño() {
        return component.getTamaño();
    }

    @Override
    public LocalDate getFechaCreacion() {
        return component.getFechaCreacion();
    }

    @Override
    public LocalDate getFechaModificacion() {
        return component.getFechaModificacion();
    }

    @Override
    public String getPermisos() {
        return component.getPermisos();
    }

    @Override
    public String prettyPrint(){
       return component.prettyPrint();
    }
}
