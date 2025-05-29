package oo2.ej3.puntoA.model;

public abstract class NuclearOvercraftRobot extends NuclearRobot
{
    public NuclearOvercraftRobot(String name) {
        super(name);
    }
    
    public void move() {
        System.out.println("Robot " + this.getName() + " moving on overcraft");
    }
}
