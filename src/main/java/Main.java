import model.PassengerCar;
import model.Car;
import model.Truck;
import repository.CarRepository;
import model.Type;
import service.CarService;


public class Main {
    public static void main(String[] args) {
        final CarService carService = new CarService(new CarRepository());
        Car passengerCar1 = carService.create(Type.CAR);
        Car passengerCar2 = carService.create(Type.CAR);
        Car truck = carService.create(Type.TRUCK);

        System.out.println(carService.carEquals(passengerCar1, truck));
        System.out.println(carService.carEquals(passengerCar1, passengerCar1));
        System.out.println(carService.carEquals(passengerCar1, passengerCar2));
    }
}