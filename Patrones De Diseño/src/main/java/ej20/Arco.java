package ej20;

public class Arco implements Arma{
    @Override
    public int dañoContra(Armadura armadura) {
        return armadura.dañoArco();
    }
}
