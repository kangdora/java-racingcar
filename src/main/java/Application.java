import java.io.*;
import java.util.*;

public class Application {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(",");
        Car[] racingCars = new Car[input.length];

        int T = Integer.parseInt(br.readLine());

        for (int i=0;i<input.length;i++){
            Car car = new Car(input[i]);
            racingCars[i] = car;
        }

        RacingGame racingGame = new RacingGame(List.of(racingCars));
        for (int i=0;i<T;i++) racingGame.playGame();
    }
}