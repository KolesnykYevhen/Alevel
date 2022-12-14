package repository;
import model.Car;
import model.PassengerCar;
import model.Color;

public class CarRepository {
    private static PassengerCar[] cars = new PassengerCar[10];

    public void save(final PassengerCar car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = car;
                break;
            }
            if (i == cars.length - 1) {
                increaseArray();
            }
        }
    }

    public void insert(final PassengerCar car, int indexInsertCar) {
        if (car == null) {
            return;
        }
        deleteByUuid(car.getUuidOfCar());
        if (indexInsertCar > indexOfLastCar()) {
            indexInsertCar = indexOfLastCar() + 1;
        }
        if (indexInsertCar <= 0) {
            indexInsertCar = 0;
        }
        System.arraycopy(cars, indexInsertCar, cars, indexInsertCar + 1,
                indexOfLastCar() - indexInsertCar + 1);
        cars[indexInsertCar] = car;
    }

    public PassengerCar[] getAll() {
        final PassengerCar[] carsArray = new PassengerCar[indexOfLastCar() + 1];
        System.arraycopy(cars, 0, carsArray, 0, indexOfLastCar() + 1);
        return carsArray;
    }

    public PassengerCar getByUuid(final String uuidOfCar) {
        if (uuidOfCar == null) {
            return null;
        }
        final int indexCar = indexCarByUuid(uuidOfCar);
        if (indexCar == -1) {
            return null;
        }
        return cars[indexCar];
    }

    public void updateColor(final String uuidOfCar, final Color color) {
        final PassengerCar car = getByUuid(uuidOfCar);
        if (car == null || color == null) {
            return;
        }
        car.setColor(color);
    }

    public void updateColorRandom(final String uuidOfCar) {
        final PassengerCar car = getByUuid(uuidOfCar);
        if (car == null) {
            return;
        }
        Color newColor;
        do {
            newColor = Color.randomColor();
        } while (car.getColor().equals(newColor));
        updateColor(uuidOfCar, newColor);
    }

    public void updatePrice(final String uuidOfCar, final int price) {
        if (price < 0) {
            return;
        }
        final PassengerCar car = getByUuid(uuidOfCar);
        if (car == null) {
            return;
        }
        getByUuid(uuidOfCar).setPrice(price);
    }

    public void deleteByUuid(final String uuidOfCar) {
        if (uuidOfCar == null) {
            return;
        }
        int indexOfDeletedCar = indexCarByUuid(uuidOfCar);
        if (indexCarByUuid(uuidOfCar) == -1) {
            return;
        }
        System.arraycopy(cars, indexOfDeletedCar + 1, cars, indexOfDeletedCar,
                indexOfLastCar() - indexOfDeletedCar);
        cars[indexOfLastCar()] = null;

    }

    private int indexCarByUuid(final String uuidOfCar) {
        int indexCarByUuid = -1;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getUuidOfCar().equals(uuidOfCar)) {
                indexCarByUuid = i;
                break;
            }
        }
        return indexCarByUuid;
    }

    private int indexOfLastCar() {
        int indexOfLastCar = -1;
        for (PassengerCar car : cars) {
            if (car != null) {
                indexOfLastCar++;
            } else {
                break;
            }
        }
        return indexOfLastCar;
    }

    private void increaseArray() {
        PassengerCar[] carsNewArray = new PassengerCar[cars.length * 2];
        System.arraycopy(cars, 0, carsNewArray, 0, cars.length);
    }
}