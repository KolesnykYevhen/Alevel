import model.PassengerCar;
import model.Truck;
import repository.CarRepository;
import service.CarService;


public class Main {
    public static void main(String[] args) {
        final CarService carService = new CarService(new CarRepository());
        PassengerCar passengerCar = carService.createPassengerCar();
        passengerCar.restore();
        Truck truck = carService.createTruck();
        truck.restore();
    }
}