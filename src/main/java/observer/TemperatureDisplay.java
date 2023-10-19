package main.java.observer;

public class TemperatureDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("A temperatura mudou para " + temperature + "°C.");
    }
}
