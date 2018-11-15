import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {

        //Hello, World!
        System.out.println("Hello, World!");

        //working with classes and their instances
        Car newCar = new Car(15.5, "2375AA-1", Color.WHITE, true);
        System.out.println("The new car's license number is " + newCar.licensePlate);
        newCar.changeColor(Color.RED);
        System.out.println(newCar.paintColor);

        //working with strings

        String userInput = "This is a test user input";
        String upperCaseUserUnput = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(upperCaseUserUnput);
        char first = userInput.charAt(0);
        System.out.println(first);
        System.out.println(userInput.contains("test"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String userInputString = sc.next();
        System.out.println(userInputString.toUpperCase());

        System.out.println("Enter a number:");
        String userInputInt = sc.next();
        System.out.println(userInputInt);

        String text = new String("BBB");
        String replacedText = text.replace("B", "A");
        System.out.println(replacedText);


        //working with arrays
        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 1;
        numbers[2] = 32;
        numbers[3] = 23;
        numbers[4] = 99;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int[] numbers2 = {7,35,13,8,79};
        System.out.println(numbers2.length);

        //passing by value
        double newCarSpeed = 50.5;
        newCar.speedingUp(newCarSpeed);
        System.out.println(newCarSpeed);
        newCarSpeed = newCar.speedingUp2(50.5);
        System.out.println(newCarSpeed);

        //Section 3 - challenge
        Dog myDog = new Dog("Rex", "Labrador Retriever", 5);
        myDog.bark();
    }
}