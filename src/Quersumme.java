import java.util.Scanner;

public class Quersumme {

    // Eingabe: Bitte eine max. 5 stellige Zahl eingeben: 1234
    // Ausgabe: 4 + 3 + 2 + 1 = 10

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte eine max. 5 stellige Zahl eingeben: ");
        int zahl = eingabe.nextInt();

        // z.B. zahl = 12345
        int quersumme = 0;
//        int stelle1 = zahl / 10_000;    // liefert: 1
//        zahl = zahl % 10_000;           // -> schneidet die 10'000er Stelle ab
//        int stelle2 = zahl / 1_000;    // liefert: 2
//        zahl = zahl % 1_000;            // -> schneidet die 1'000er Stelle ab
//        int stelle3 = zahl / 100;       // liefert: 3
//        zahl = zahl % 100;              // -> schneidet die 100er Stelle ab
//        int stelle4 = zahl / 10;        // liefert: 4
//        zahl = zahl % 10;               // schneidet die 10er Stelle ab
//        int stelle5 = zahl / 1;         // liefert: 5

        // Schleife:
        // 1) 1234 -> stelle: 4, zahl = 123
        // 2) 123  -> stelle: 3, zahl = 12
        // 3) 12   -> stelle: 2, zahl = 1
        // 4) 1    -> stelle: 1, zahl = 0
        while (zahl > 0) {
            int stelle = zahl % 10;
            zahl = zahl / 10;
            System.out.print(stelle);
            if (zahl > 0)
                System.out.print(" + ");
            quersumme = quersumme + stelle;
        }

        System.out.println(" = " + quersumme);
    }
}
