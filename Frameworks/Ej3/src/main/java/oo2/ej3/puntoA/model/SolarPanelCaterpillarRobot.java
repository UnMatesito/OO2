package oo2.ej3.puntoA.model;

public abstract class SolarPanelCaterpillarRobot extends SolarPanelRobot {
    public SolarPanelCaterpillarRobot(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Robot " + this.getName() + " moving on caterpillar");
    }
}
