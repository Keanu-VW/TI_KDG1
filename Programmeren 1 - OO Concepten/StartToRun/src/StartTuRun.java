import java.util.Scanner;

public class StartTuRun {
    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);

     int maxHartslag;
     int leeftijd;
     int trainHartslag;
     int category;
     int rustHartslag;

    System.out.println("Deze applicatie berekent je ideale trainingshartslag aan de hand van de formule van Karvonen.");

    System.out.println("Geef je leeftijd: ");
    leeftijd = keyboard.nextInt();

    System.out.println("Geef je hartslag in rust: ");
    rustHartslag = keyboard.nextInt();

    System.out.println("Welk soort training wil je doen? \n" +
            "1 : recuperatie training \n" +
            "2 : LSD training (Long Slow Distance) \n" +
            "3 : extensieve uithouding \n" +
            "4 : intensieve uithouding \n" +
            "5 : tempo-interval \n" +
            "6 : intensieve interval");
    System.out.println("Maak je keuze: ");
    category = keyboard.nextInt();

    maxHartslag  = 220 - leeftijd;
    System.out.println("Je maximale hartslag is " + maxHartslag + ".");

        category = switch (category) {
            case 1 -> 65;
            case 2 -> 70;
            case 3 -> 75;
            case 4 -> 85;
            case 5 -> 90;
            case 6 -> 95;
            default -> category;
        };

    trainHartslag = rustHartslag + ((maxHartslag - rustHartslag) * category / 100);
    System.out.println("Je traint best met een hartslag rond " + trainHartslag + ".");
    }
}
/*

Deze applicatie berekent je ideale trainingshartslag aan de hand van de formule van Karvonen.
Geef je leeftijd: 35
Geef je hartslag in rust: 75
Welk soort training wil je doen?
1 : recuperatie training
2 : LSD training (Long Slow Distance)
3 : extensieve uithouding
4 : intensieve uithouding
5 : tempo-interval
6 : intensieve interval
Maak je keuze: 5
Je maximale hartslag is 185.
Je traint best met een hartslag rond de 174.

 */