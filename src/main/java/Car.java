import java.util.Random;

public class Car{
    private final String name;
    private int position = 0;

    public Car(String name){
        this.name = name;
    }

    public void move() {
        if (randomInt() >= 4) position += 1;
    }

    private int randomInt(){
        Random random = new Random();
        return random.nextInt(10);
    }

    public int getPosition(){
        return position;
    }

    public String getName(){
        return this.name;
    }
}

// TODO:cars 순회하면서 position max 받는거 만들기.
