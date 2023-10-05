import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        int product;
        int getal1;
        int getal2;
        int getal3;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Geef een getal: ");
        getal1 = keyboard.nextInt();
        System.out.println("Geef nog een getal: ");
        getal2 = keyboard.nextInt();
        System.out.println("Geef een laatste getal: ");
        getal3 = keyboard.nextInt();

        product = getal1 * getal2 * getal3;

        System.out.println("Het product is: " + product);
    }
}
