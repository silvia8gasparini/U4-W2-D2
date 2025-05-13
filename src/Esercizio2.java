
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;



public class Esercizio2 {

    public static List<Integer> generaLista(int n) {
        List<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            lista.add(rand.nextInt(101));
        }
        return lista;
    }

    public static List<Integer> inversoDoppio(List<Integer> lista) {
        List<Integer> nuova = new ArrayList<>(lista);
        for (int i = lista.size() - 1; i >= 0; i--) {
            nuova.add(lista.get(i));
        }
        return nuova;
    }

    public static void stampaPariDispari(List<Integer> lista, boolean pari) {
        System.out.print(pari ? "Posizioni pari: " : "Posizioni dispari: ");
        for (int i = (pari ? 0 : 1); i < lista.size(); i += 2) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci N: ");
        int n = scanner.nextInt();

        List<Integer> lista = generaLista(n);
        System.out.println("Lista generata: " + lista);

        List<Integer> listaInversa = inversoDoppio(lista);
        System.out.println("Lista con inverso: " + listaInversa);

        System.out.print("Stampare posizioni pari? (true/false): ");
        boolean scelta = scanner.nextBoolean();

        stampaPariDispari(listaInversa, scelta);
        scanner.close();
    }
}