package ej20;

public class Baston implements Arma{
    @Override
    public int dañoContra(Armadura armadura) {
        return armadura.dañoBaston();
    }
}
