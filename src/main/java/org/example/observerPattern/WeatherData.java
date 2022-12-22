package org.example.observerPattern;

import javax.swing.*;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }


    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList
                .forEach(observer -> {
                    observer.update();
                });
    }

    public void measurementsChanged() {//getting update from Weather Station=> this is directly connected to the Weather Station
        notifyObservers();
    }

    public void setMeasurements(float temp, float humid, float pressure) {//make an api call to the specific website;
        this.humidity = humid;
        this.temperature = temp;
        this.pressure = pressure;
        measurementsChanged();
    }
}
