import model.Car;
import service.CarService;

public class Main {
    public static void main(final String[] arg) {
        final CarService carService = new CarService();
        for (int i =0; i < 3; i++){
            final Car car = carService.create();
            carService.print(car);
            carService.check(car);
        }
    }
}
