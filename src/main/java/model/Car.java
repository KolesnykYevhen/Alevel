package model;

import java.util.Random;
import java.util.UUID;

public class Car {
    private final String id;
    private String manufacturer;
    private Engine engine;
    private Color color;
    private int count;
    private int price;
    private final Random random = new Random();

    public Car() {
        this.id = UUID.randomUUID().toString();
    }

    public Car(String manufacturer, Engine engine, Color color) {
        this.id = UUID.randomUUID().toString();
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.color = color;
        this.count = 1;
        this.price = random.nextInt(1000000);
    }

    public String getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Random getRandom() {
        return random;
    }

}