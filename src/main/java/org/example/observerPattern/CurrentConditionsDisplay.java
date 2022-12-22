package org.example.observerPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
       System.out.println("Current temprature is " + this.temperature + " Faranheit" + " Pressure: " + this.pressure + " Humidity: " + this.humidity);
    }


}
