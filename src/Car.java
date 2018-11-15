import java.awt.*;

public class Car {
    double averageMPG;
    String licensePlate;
    Color paintColor;
    boolean isWorking;

    public Car(double averageMPG, String licensePlate, Color paintColor, boolean isWorking) {
        this.averageMPG = averageMPG;
        this.licensePlate = licensePlate;
        this.paintColor = paintColor;
    }

    public void changeColor (Color newColor) {
        this.paintColor = newColor;
    }

}
