package oo2.ej3.puntoA.model;

public class SolarPanelCaterpillarRobotWithLasers extends SolarPanelCaterpillarRobot {
    public SolarPanelCaterpillarRobotWithLasers(String name) {
        super(name);
    }

    @Override
    public void fireArms() {
        System.out.println("Robot " + this.getName() + " firing lasers");
    }
}
