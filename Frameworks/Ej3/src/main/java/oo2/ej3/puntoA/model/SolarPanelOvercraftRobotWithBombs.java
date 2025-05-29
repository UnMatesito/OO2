package oo2.ej3.puntoA.model;

public class SolarPanelOvercraftRobotWithBombs extends SolarPanelOvercraftRobot {
    public SolarPanelOvercraftRobotWithBombs(String name) {
        super(name);
    }

    @Override
    public void fireArms() {
        System.out.println("Robot " + this.getName() + " firing bombs");
    }
}
