package oo2.ej2.parte2;

public abstract class Elemento {
    private String nombre;

    public Elemento(String nombre) {
        this.nombre = nombre;
    }

    public abstract String jugarContraPapel();

    public abstract String jugarContraTijera();

    public abstract String jugarContraPiedra();

    public abstract String jugarContraLagarto();

    public abstract String jugarContraSpock();

    public abstract String jugarContra(Elemento elemento);
}
