package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TemperaturaTest {

    @Test
    void deveRetornarTemperaturaCelsius() {
        Temperatura temperatura = new Temperatura();
        temperatura.setTemperatura("100.00");

        assertEquals("100,00", temperatura.getTemperatura());
    }

    @Test
    void deveRetornarTemperaturaFahrenheit() {
        Temperatura temperatura = new Temperatura();
        temperatura.setTemperatura("100.00");

        assertEquals(212.0f, temperatura.getTemperaturaFahrenheit());
    }

    @Test
    void deveConverterFahrenheitParaCelsius() {
        TemperaturaFahrenheit tempFahrenheit = new TemperaturaFahrenheit();
        tempFahrenheit.setTemperaturaFahrenheit(212.0f);

        TemperaturaAdapter adaptador = new TemperaturaAdapter(new TemperaturaCelsius());
        adaptador.setTemperaturaFahrenheit(212.0f);

        assertEquals("100,00", adaptador.recuperarTemperatura());
    }

    @Test
    void deveConverterCelsiusParaFahrenheit() {
        TemperaturaCelsius tempCelsius = new TemperaturaCelsius();
        tempCelsius.setTemperatura("100.00");

        TemperaturaAdapter adaptador = new TemperaturaAdapter(tempCelsius);
        adaptador.salvarTemperatura();

        assertEquals(212.0f, adaptador.getTemperaturaFahrenheit());
    }
}
