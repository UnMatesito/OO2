package oo2.ej3.puntoA.model;

public class SolarPanelCaterpillarRobotWithBombs extends SolarPanelCaterpillarRobot {
    public SolarPanelCaterpillarRobotWithBombs(String name) {
        super(name);
    }

    @Override
    public void fireArms() {
        System.out.println("Robot " + this.getName() + " firing bombs");
    }
}
