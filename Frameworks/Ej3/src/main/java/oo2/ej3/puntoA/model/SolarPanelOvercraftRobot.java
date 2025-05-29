package oo2.ej3.puntoA.model;

public abstract class SolarPanelOvercraftRobot extends SolarPanelRobot {
    public SolarPanelOvercraftRobot(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Robot " + this.getName() + " moving on overcraft");
    }
}
