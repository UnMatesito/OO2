package oo2.ej3.puntoB.model;

public class SolarPanel extends EnergySource
{
    private int power = 100;

    public void consumeBattery(Robot r) {
        System.out.println("Robot " + r.getName() + " using nuclear energy");
    }

    public boolean suficienteEnergiaParaDisparar(Robot r){
        return this.power > 0;
    }
}
