package ej19;


import java.util.List;

public class CelciusDecorator extends WeatherDecorator {
    public CelciusDecorator(WeatherData weatherData) {
        super(weatherData);
    }

    @Override
    public double getTemperatura() {
        return this.getTemperaturas().get(this.getTemperaturas().size() - 1);
    }

    private List<Double> cambiarACelcius() {
        List<Double> temperaturas = super.getTemperaturas();
        temperaturas.replaceAll(temperatura -> Math.round(((temperatura - 32) / 1.8) * 100.0) / 100.0);
        return temperaturas;
    }

    @Override
    public List<Double> getTemperaturas() {
        return cambiarACelcius();
    }

    @Override
    public String displayData() {
        return "Temperatura C: " +  this.getTemperatura() +
                " Presión atmosf: " + this.getPresion() +
                " Radiación solar: " + this.getRadiacionSolar();
    }
}
