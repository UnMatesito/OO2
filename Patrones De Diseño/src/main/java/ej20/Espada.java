package ej20;

public class Espada implements Arma{
    @Override
    public int dañoContra(Armadura armadura) {
        return armadura.dañoEspada();
    }
}
