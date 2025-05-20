package oo2.ej6;

public class ArbolBinario implements Arbol{
    private int valor;
    private Arbol hijoIzquierdo;
    private Arbol hijoDerecho;

    public ArbolBinario(int valor) {
        this.valor = valor;
        this.hijoIzquierdo = new ArbolNull();
        this.hijoDerecho = new ArbolNull();
    }

    @Override
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public Arbol getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(Arbol hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    @Override
    public Arbol getHijoDerecho() {
        return hijoDerecho;
    }

    public void setDerecha(Arbol hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public String recorrerPreorden() {
        Recorrido recorridoPreorden = new RecorridoPreorden();
        return recorridoPreorden.recorrer(this);
    }

    public String recorrerInorden() {
        Recorrido recorridoInorden = new RecorridoInorden();
        return recorridoInorden.recorrer(this);
    }

    public String recorrerPostorden() {
        Recorrido recorridoPostorden = new RecorridoPostorden();
        return recorridoPostorden.recorrer(this);
    }

    @Override
    public boolean esNulo() {
        return false;
    }
}

