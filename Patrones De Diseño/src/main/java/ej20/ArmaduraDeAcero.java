package ej20;

public class ArmaduraDeAcero implements Armadura {
    @Override
    public int dañoEspada() {
        return 3;
    }

    @Override
    public int dañoArco() {
        return 2;
    }

    @Override
    public int dañoBaston() {
        return 1;
    }
}
