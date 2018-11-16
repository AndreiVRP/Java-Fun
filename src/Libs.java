//playing around with libraries

import static java.lang.System.out;
import java.util.Random;


public class Libs {
    public static void main(String[] args) {
        out.println("Let's get started!");

        /*
        double power = Math.pow(5,3);
        out.println(power);

        Random rand = new Random();
        int randomNumber = rand.nextInt();
        out.println(randomNumber);
        int randomNumberWithBounds = rand.nextInt(10);
        out.println(randomNumberWithBounds);
        */

        //Tossing a coin
        Coin coin = new Coin();

        int gameSession = 15;

        for (int i = 0; i < gameSession; i++) {
            coin.flip();
            String result = coin.getFaceUp();
            out.println(result);
        }

        out.println("The session is over!");


        //Rolling a dice
        Dice dice = new Dice();
        String firstRoll = dice.roll();
        String secondRoll = dice.roll();
        out.println(firstRoll);
        out.println(secondRoll);

    }
}
