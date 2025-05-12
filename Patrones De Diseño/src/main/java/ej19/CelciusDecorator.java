package ej19;


public class CelciusDecorator extends WeatherDecorator {
    public CelciusDecorator(WeatherData weatherData) {
        super(weatherData);
        turnToCelcius();
    }

    private void turnToCelcius(){
        this.getWeatherData().getTemperaturas().replaceAll(temperatura -> Math.round((temperatura * 1.8 + 32) * 100.0) / 100.0);
    }

    @Override
    public String displayData() {
        return "Temperatura C: " + this.getTemperatura() +
                " Presión atmosf: " + this.getPresion() +
                " Radiación solar: " + this.getRadiacionSolar();
    }
}
