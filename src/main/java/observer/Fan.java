package main.java.observer;

public class Fan implements Observer {
    @Override
    public void update(int temperature) {
        if (temperature > 25) {
            System.out.println("Ligando o ventilador.");
        } else {
            System.out.println("Desligando o ventilador.");
        }
    }
}
