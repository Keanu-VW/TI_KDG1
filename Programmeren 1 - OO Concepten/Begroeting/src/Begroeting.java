import java.util.Scanner;

public class Begroeting {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String naam;

        System.out.println("Wat is je naam?");
        naam = keyboard.nextLine();

        System.out.println("Welkom " + naam + "!");
    }
}
