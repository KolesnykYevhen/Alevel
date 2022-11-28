package service;
import model.Car;
import model.Color;
import model.Engine;

import java.util.Random;

public class CarService {
    private final Random random = new Random();

    public Car create() {
        return new Car(randomString(), new Engine(), getRandomColor());
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

    private Color getRandomColor() {
        Color[] values = Color.values();
        int randomIndex = random.nextInt(values.length);
        return values[randomIndex];
    }


    public void check(Car car) {
        if(car.getCount() > 0 && car.getEngine().getPower() > 200) {
            System.out.println("Готово к продаже");
        } else if (car.getCount() < 1 && car.getEngine().getPower() <= 200) {
            System.out.println("Нет машины и мощность меньше чем нужно");
        } else if (car.getCount() < 1) {
            System.out.println("Нет машины");
        } else if (car.getEngine().getPower() <= 200) {
            System.out.println("Мощность меньше 200");
        }
    }
}

