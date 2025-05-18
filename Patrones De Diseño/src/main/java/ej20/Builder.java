package ej20;

public abstract class Builder {
    private Personaje personaje;

    public void reset(String nombre){
        personaje = new Personaje(nombre);
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    protected abstract void agregarArmadura();
    protected abstract void agregarArma();
    protected abstract void agregarHabilidad();
}
