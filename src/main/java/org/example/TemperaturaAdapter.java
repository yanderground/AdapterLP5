package org.example;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TemperaturaAdapter extends TemperaturaFahrenheit {

    private ITemperatura temperaturaCelsius;

    public TemperaturaAdapter(ITemperatura temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public String recuperarTemperatura() {
        float fahrenheit = this.getTemperaturaFahrenheit();
        float celsius = (fahrenheit - 32) * 5 / 9;
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("#.00", symbols);
        temperaturaCelsius.setTemperatura(String.format("%.2f", celsius));
        return temperaturaCelsius.getTemperatura();
    }

    public void salvarTemperatura() {
        float celsius = Float.parseFloat(temperaturaCelsius.getTemperatura());
        float fahrenheit = (celsius * 9 / 5) + 32;
        this.setTemperaturaFahrenheit(fahrenheit);
    }
}
