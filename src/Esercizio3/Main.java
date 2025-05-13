package Esercizio3;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();

        rubrica.aggiungiContatto("Steiner", "3331234567");
        rubrica.aggiungiContatto("Quina", "3339876543");

        rubrica.stampaContatti();

        System.out.println("Numero di Steiner: " + rubrica.trovaNumeroDaNome("Steiner"));
        System.out.println("Nome con numero 3339876543: " + rubrica.trovaNomeDaNumero("3339876543"));

        rubrica.rimuoviContatto("Quina");
        System.out.println("\nDopo rimozione di Quina:");
        rubrica.stampaContatti();
    }
}
