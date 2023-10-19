package main.java.observer;

public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();
        Observer display = new TemperatureDisplay();
        Observer fan = new Fan();

        sensor.registerObserver(display);
        sensor.registerObserver(fan);

        sensor.setTemperature(30);
        sensor.setTemperature(20);

        sensor.removeObserver(fan);
        sensor.setTemperature(15);
    }
}
