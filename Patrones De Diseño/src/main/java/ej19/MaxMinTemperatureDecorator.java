package ej19;

public class MaxMinTemperatureDecorator extends WeatherDecorator{
    public MaxMinTemperatureDecorator(WeatherData weatherData) {
        super(weatherData);
    }

    public double getMaxTemperature(){
        return this.getTemperaturas().stream().mapToDouble(temperatura -> temperatura.doubleValue()).max().getAsDouble();
    }

    public double getMinTemperature(){
        return this.getTemperaturas().stream().mapToDouble(temperatura -> temperatura.doubleValue()).min().getAsDouble();
    }

    @Override
    public String displayData() {
        return this.getWeatherData().displayData() +
                " Mínimo: " + this.getMinTemperature() +
                " Máximo: " + this.getMaxTemperature();
    }
}
