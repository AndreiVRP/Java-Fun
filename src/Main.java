import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Car newCar = new Car(15.5, "2375AA-1", Color.WHITE, true);
        System.out.println("The new car's license number is " + newCar.licensePlate);
        newCar.changeColor(Color.RED);
        System.out.println(newCar.paintColor);

    }
}
