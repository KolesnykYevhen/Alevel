package service;
import model.Car;
import java.util.Random;

public class CarService {
    public Car create(){
        return new Car(getRandomString(), getRandomString(), getRandomString());
    }
    public static void print(Car car) {
        System.out.println("Manufacturer: " + car.getManufacturer() + " Engine: " + car.getEngine() + " Color: " +
                car.getColor() + " Count: " + car.getCount() + " Price: " + car.getPrice());
    }
    private static String getRandomString() {
        int lenght = 8;
        Random random = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < lenght; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            builder.append(randomChar);
        }
        return builder.toString();
    }
}
