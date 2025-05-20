package oo2.ej6;

public class RecorridoInorden implements Recorrido{
    @Override
    public String recorrer(Arbol arbol) {
        if (arbol.esNulo()) {
            return "";
        }
        return recorrer(arbol.getHijoIzquierdo()) + arbol.getValor() + " - " + recorrer(arbol.getHijoDerecho());
    }
}
