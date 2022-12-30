import repository.CarRepository;
import service.CarService;
import util.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        final CarService carService = new CarService(new CarRepository());
        final RandomGenerator rg = new RandomGenerator();
        carService.create(rg);
    }
}