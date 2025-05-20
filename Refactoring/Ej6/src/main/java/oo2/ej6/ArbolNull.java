package oo2.ej6;

public class ArbolNull implements Arbol{
    @Override
    public Arbol getHijoIzquierdo() {
        return this;
    }

    @Override
    public Arbol getHijoDerecho() {
        return this;
    }

    @Override
    public int getValor() {
        return 0;
    }

    @Override
    public boolean esNulo() {
        return true;
    }
}
