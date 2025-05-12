package ej22;

public class MixingTank {


    public boolean heatPower(double percentage){
        // configura el nivel potencia de la fuente de calor del tanque de 0 a 100
        return percentage >= 0 && percentage <= 100;
    }
    public boolean mixerPower(double percentage){
        // configura el nivel de potencia de la mezcladora del tanque de 0 a 100
        return percentage >= 0 && percentage <= 100;
    }

    public boolean purge(){
        // comanda al tanque para que se desagote
        return true;
    }

    public double isUpTo(){
        // retorna el volumen ocupado del tanque de 0 a 100
        return 0.4;
    }

    public double temperature(){
        // retorna la temperatura del contenido del tanque
        return 0.30;
    }
}
