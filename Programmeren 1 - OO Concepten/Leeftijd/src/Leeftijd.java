import java.time.LocalDate;
import java.util.Scanner;

public class Leeftijd {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String naam;
        int geboortejaar;
        int jaar = LocalDate.now().getYear();
        int leeftijd;

        System.out.println("Wat is je naam: ");
        naam = keyboard.nextLine();
        System.out.println("Beste " + naam + ", geef je geboortejaar: ");
        geboortejaar = keyboard.nextInt();
        leeftijd = jaar - geboortejaar;
        System.out.println("Als alles goed loopt, word je dit jaar " + leeftijd);
    }
}
