package ej19;

public class AverageDecorator extends WeatherDecorator{
    public AverageDecorator(WeatherData weatherData) {
        super(weatherData);
    }

    public double getAverage(){
        return Math.round(this.getTemperaturas().stream().mapToDouble(Double::doubleValue).average().getAsDouble() * 100.0) / 100.0;
    }

    @Override
    public String displayData() {
        return this.getWeatherData().displayData() +
                " Promedio: " + this.getAverage();
    }
}
