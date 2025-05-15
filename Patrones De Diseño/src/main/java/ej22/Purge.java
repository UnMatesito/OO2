package ej22;

public class Purge extends ProcessStep{
    @Override
    protected boolean basicExecute(MixingTank tank) throws InterruptedException {
        if (tank.isUpTo() == 0) {
            return false;
        }
        else {
            tank.heatPower(0.0);
            tank.mixerPower(0.0);
            tank.purge();
            Thread.sleep(4000);
            if (tank.isUpTo() != 0){
                return false;
            }
            return true;
        }
    }
}
