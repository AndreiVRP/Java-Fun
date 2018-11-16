import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;



public class Main {
    public static void main(String[] args) {

        //tried import static
        out.println("HI THERE");

        //Hello, World!
        System.out.println("Hello, World!");
        //Section 3 - Java Basics
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

        //Section 3 - Challenge
        Dog myDog = new Dog("Rex", "Labrador Retriever", 5);
        myDog.bark();

        //Section 4 - Control Flow

        //if statement
        String day = new String("Saturday");
        System.out.println(day);

        //for strings use equals() instead of ==
        if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("It's time to relax!");
        } else if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
            System.out.println("Chances are, it's a working day and you have some tasks to accomplish...");
        } else {
            System.out.println("You've probably made a typo! Please, correct it!");
        }
        //There is a better option -> combining enums with switch and encapsulating it into a function (maybe even returning a string value)

        //loops
        //WHILE LOOP
        //never executed if the condition is false right off the bat
        int x = 10;
        while (x > 0) {
            System.out.println(x);
            x -= 1;
        }
        System.out.println("WHILE: Go!");

        //DO WHILE LOOP
        //executed at least once because the condition is checked at the end...
        x = 10;
        do {
            System.out.println(x);
            x -= 1;
        } while (x > 0); //...that's why it should be changed to x > 1 for a countdown
        System.out.println("DO WHILE: Go!");

        //FOR LOOP
        x = 10;
        for (int i = x; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("FOR: Go!");

    }


}