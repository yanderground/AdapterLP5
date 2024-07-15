package org.example;

public class Temperatura {

    ITemperatura temperatura;
    TemperaturaAdapter persistencia;

    public Temperatura() {
        temperatura = new TemperaturaCelsius();
        persistencia = new TemperaturaAdapter(temperatura);
    }

    public void setTemperatura(String celsius) {
        temperatura.setTemperatura(celsius);
        persistencia.salvarTemperatura();
    }

    public String getTemperatura() {
        return persistencia.recuperarTemperatura();
    }


    public float getTemperaturaFahrenheit() {
        return persistencia.getTemperaturaFahrenheit();
    }

}
