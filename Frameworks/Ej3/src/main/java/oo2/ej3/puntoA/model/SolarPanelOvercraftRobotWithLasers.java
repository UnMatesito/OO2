package oo2.ej3.puntoA.model;

public class SolarPanelOvercraftRobotWithLasers extends SolarPanelOvercraftRobot {
    public SolarPanelOvercraftRobotWithLasers(String name) {
        super(name);
    }

    @Override
    public void fireArms() {
        System.out.println("Robot " + this.getName() + " firing lasers");
    }
}
