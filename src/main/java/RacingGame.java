import java.util.*;

public class RacingGame{
    private List<Car> cars;

    public RacingGame(List<Car> cars) {
        this.cars = cars;
    }

    private void moveCar() {
        for (Car car : cars) {
            car.move();
        }
    }

    private void printPositions() {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    public void playGame(){
        moveCar();
        printPositions();
    }
}
