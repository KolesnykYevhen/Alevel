package service;
import model.Car;
import java.util.Random;

public class CarService {

    public Car create() {
        String manufacturer = randomString();
        String engine = randomString();
        String color = randomString();
        Car car = new Car(manufacturer, engine, color);
        return car;
    }

    private String randomString() {
        String symbols = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int length = 7;
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(symbols.length());
            char randomChar = symbols.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }

    public void print(Car car) {
        System.out.println("Manufacturer: " + car.getManufacturer() + " Engine: " + car.getEngine() + " Color: " +
        car.getColor() + " Count: " + car.getCount() + " Price: " + car.getPrice());
    }
}

