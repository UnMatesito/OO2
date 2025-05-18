package ej20;

public class ArmaduraDeHierro implements Armadura{
    @Override
    public int dañoEspada() {
        return 5;
    }

    @Override
    public int dañoArco() {
        return 3;
    }

    @Override
    public int dañoBaston() {
        return 1;
    }
}
