package oo2.ej3.puntoA.model;

public class NuclearOvercraftRobotWithBombs extends NuclearOvercraftRobot
{
    public NuclearOvercraftRobotWithBombs(String name) {
        super(name);
    }
    
    /**
     * This method is an exact replica of the one in class NuclearCaterpillarRobotWithBombs
     * THAT IS NOT GOOD!!
     */
    public void fireArms() {
        System.out.println("Robot " + this.getName() + " firing bombs");
    }
}
