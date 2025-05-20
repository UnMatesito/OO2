package oo2.ej6;

public class RecorridoPreorden implements Recorrido{
    @Override
    public String recorrer(Arbol arbol) {
        if (arbol.esNulo()) {
            return "";
        }
        return arbol.getValor() + " - " + recorrer(arbol.getHijoIzquierdo()) + recorrer(arbol.getHijoDerecho());
    }
}
