package ej22;

public class LightMix extends ProcessStep{
    @Override
    protected boolean basicExecute(MixingTank tank) {
        double temp = tank.temperature();
        tank.heatPower(1);
        Thread.sleep(2000);
        if(tank.temperature()-temp == 10 ){
            tank.mixerPower(0.05)
            return true;
        }
        else {
            return false;
        }
    }
}
