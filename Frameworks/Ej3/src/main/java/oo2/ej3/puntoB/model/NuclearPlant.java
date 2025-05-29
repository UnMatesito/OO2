package oo2.ej3.puntoB.model;

public class NuclearPlant extends EnergySource
{
    public void consumeBattery(Robot r) {
        System.out.println("Robot " + r.getName() + " using nuclear energy");
    }
 
}
