package oo2.ej3.puntoB.model;

public class FourXFourTractionWheels extends Locomotion{
    @Override
    public void move(Robot r) {
        System.out.println("Robot " + r.getName() + " moving on 4X4 Traction Wheels");
    }
}
