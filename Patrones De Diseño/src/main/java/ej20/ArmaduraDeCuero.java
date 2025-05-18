package ej20;

public class ArmaduraDeCuero implements Armadura{
    @Override
    public int dañoEspada() {
        return 8;
    }

    @Override
    public int dañoArco() {
        return 5;
    }

    @Override
    public int dañoBaston() {
        return 2;
    }
}
