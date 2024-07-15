package org.example;

public class TemperaturaCelsius implements ITemperatura {

    private String celsius;

    @Override
    public String getTemperatura() {
        return this.celsius;
    }

    @Override
    public void setTemperatura(String celsius) {
        this.celsius = celsius;
    }
}
