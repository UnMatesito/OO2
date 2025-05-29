package oo2.ej3.puntoB.model;

public class Robot
{
    String name;
    Locomotion locomotion;
    EnergySource energySource;
    ArmsSystem armsSystem;
    ItemsCollector collector;
       
    public Robot (String name, Locomotion locomotion,
          EnergySource energySource, ArmsSystem armsSystem) {
        this.collector = new ItemsCollector();
        this.locomotion = locomotion;
        this.energySource = energySource;
        this.armsSystem = armsSystem;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void step() {
        locomotion.move(this);
        energySource.consumeBattery(this);
        armsSystem.fireArms(this);
        collector.collectArtifacts(this);
    }

    public void setLocomotion(Locomotion locomotion) {
        this.locomotion = locomotion;
    }

    public void setEnergySource(EnergySource energySource) {
        this.energySource = energySource;
    }
    
}
