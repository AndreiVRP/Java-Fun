import java.util.Random;

public class Dice {
    Random r;

    public Dice() {
        this.r = new Random();
    }

    public String roll() {
        int currentRoll = r.nextInt(6) + 1;
        return "The result is " + currentRoll;
    }

}
