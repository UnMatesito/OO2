package oo2.ej3.puntoA.model;

public abstract class SolarPanelRobot extends Robot{
    private int batteryLevel = 100;

    public SolarPanelRobot(String name) {
        super(name);
    }

    @Override
    public void consumeBattery() {
        System.out.println("Robot " + this.getName() + " using solar panel energy");
    }

    public boolean suficienteEnergiaParaDisparar(){
        return batteryLevel > 10; //Example
    }
}
