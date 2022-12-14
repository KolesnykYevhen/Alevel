package model;

import java.util.Random;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Car {
    private String manufacturer;
    private Engine engine;
    private Color color;
    private int count;
    private int price;
    private Type type;

    @Setter(AccessLevel.NONE)
    private String uuidOfCar;

    public Car() {
        this.uuidOfCar = UUID.randomUUID().toString();
    }

    private final Random random = new Random();
    public Car(String manufacturer, Engine engine, Color color) {
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.color = color;
        this.count = 1;
        this.price = Math.abs(random.nextInt());
        this.uuidOfCar = UUID.randomUUID().toString();
        this.type = type;
    }
}