package oo2.ej6;

public class RecorridoPostorden implements Recorrido{
    @Override
    public String recorrer(Arbol arbol) {
        if (arbol.esNulo()) {
            return "";
        }
        return recorrer(arbol.getHijoIzquierdo()) + recorrer(arbol.getHijoDerecho()) + arbol.getValor() + " - ";
    }
}
