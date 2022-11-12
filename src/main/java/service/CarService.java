package service;
import model.Car;
import java.util.Random;

public class CarService {
    public Car create() {
        return new Car(RandGeneratedStr(5), RandGeneratedStr(5), RandGeneratedStr(5));
    }

    public void print(Car car) {
        System.out.println("Manufacturer: " + car.getManufacturer() + " Engine: " + car.getEngine() + " Color: " +
                car.getColor() + " Count: " + car.getCount() + " Price: " + car.getPrice());
    }

        private static String RandGeneratedStr(int l) {
            String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
            StringBuilder s = new StringBuilder(l);
            int i;
            for (i = 0; i < l; i++) {
                int ch = (int) (AlphaNumericStr.length() * Math.random());
                s.append(AlphaNumericStr.charAt(ch));
            }

            return s.toString();

        }

}