package ej19;

import java.util.List;

public class WeatherDecorator implements WeatherData{
    private WeatherData weatherData;

    public WeatherDecorator(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    @Override
    public double getTemperatura() {
        return this.weatherData.getTemperatura();
    }

    @Override
    public double getPresion() {
        return this.weatherData.getPresion();
    }

    @Override
    public double getRadiacionSolar() {
        return this.weatherData.getRadiacionSolar();
    }

    @Override
    public List<Double> getTemperaturas() {
        return this.weatherData.getTemperaturas();
    }

    @Override
    public String displayData() {
        return this.weatherData.displayData();
    }
}
