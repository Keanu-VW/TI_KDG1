import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Beste patient, dit programma berekent je BMI.");

        System.out.println("Geef je gewicht in kilogram: ");
        double gewicht = keyboard.nextDouble();

        System.out.println("Geef je lengte in meter: ");
        double lengte = keyboard.nextDouble();

        System.out.println("He BMI is: " + (gewicht / (lengte * lengte)));
    }
}
