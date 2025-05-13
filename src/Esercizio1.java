import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di parole: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> tutteLeParole = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Parola #" + (i + 1) + ": ");
            tutteLeParole.add(scanner.nextLine());
        }

        Set<String> distinte = new HashSet<>();
        Set<String> duplicati = new HashSet<>();

        for (String parola : tutteLeParole) {
            if (!distinte.add(parola)) {
                duplicati.add(parola);
            }
        }

        System.out.println("\nParole duplicate: " + duplicati);
        System.out.println("Numero parole distinte: " + distinte.size());
        System.out.println("Elenco parole distinte: " + distinte);

        scanner.close();
    }
}
