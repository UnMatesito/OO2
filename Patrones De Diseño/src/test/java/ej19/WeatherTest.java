package ej19;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherTest {
    private HomeWeatherStation station;
    private WeatherDecorator decorator;

    @BeforeEach
    void setUp() {
        station = new HomeWeatherStation(List.of(75.0, 90.3, 85.2), 1008, 200);
        decorator = new WeatherDecorator(station);
    }

    @Test
    void testExample5() {
        assertEquals("Temperatura F: 85.2 Presión atmosf: 1008.0 Radiación solar: 200.0", decorator.displayData());
        WeatherDecorator decorator1 = new CelciusDecorator(decorator);
        WeatherDecorator decorator2 = new AverageDecorator(decorator1);
        WeatherDecorator decorator3 = new MaxMinTemperatureDecorator(decorator2);
        assertEquals("Temperatura C: 29.56 Presión atmosf: 1008.0 Radiación solar: 200.0 Promedio: 28.61 Mínimo: 23.89 Máximo: 32.39", decorator3.displayData());
    }
    // TODO: Preguntar porque las temperaturas no cambian a Celcius
}
