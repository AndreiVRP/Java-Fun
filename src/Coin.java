import java.util.Random;

public class Coin {
    public final static int heads = 0;
    public final static int tails = 1;

    private int faceUp;

    public Coin() {
        this.flip();
    }

    public  void flip() {
        Random rand = new Random();
        faceUp = rand.nextInt(2);
    }

    public String getFaceUp() {
        if (faceUp == heads) {
            return "It's HEADS!";
        } else if (faceUp == tails) {
            return "It's TAILS!";
        } else {
            return "Invalid Output!";
        }
    }

}
