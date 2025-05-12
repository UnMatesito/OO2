package ej19;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation implements WeatherData{
    private List<Double> temperaturas;
    private double presion;
    private double radiacionSolar;

    public HomeWeatherStation(List<Double> temperaturas, double presion, double radiacionSolar) {
        this.temperaturas = temperaturas;
        this.presion = presion;
        this.radiacionSolar = radiacionSolar;
    }

    //retorna la temperatura en grados Fahrenheit.
    public double getTemperatura(){
        return this.temperaturas.get(this.temperaturas.size() - 1);
    }

    //retorna la presión atmosférica en hPa
    public double getPresion(){
        return this.presion;
    }

    //retorna la radiación solar
    public double getRadiacionSolar(){
        return this.radiacionSolar;
    }

    //retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
    public List<Double> getTemperaturas(){
        return new ArrayList<>(temperaturas);
    }

    //retorna un reporte de todos los datos: temperatura, presión, y radiación solar.
    public String displayData(){
        return "Temperatura F: " + this.getTemperatura() +
                " Presión atmosf: " + this.getPresion() +
                " Radiación solar: " + this.getRadiacionSolar();
    }
}
