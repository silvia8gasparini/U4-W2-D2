package Esercizio3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private Map<String, String> contatti;

    public RubricaTelefonica() {
        contatti = new HashMap<>();
    }

    public void aggiungiContatto(String nome, String numero) {
        contatti.put(nome, numero);
    }

    public void rimuoviContatto(String nome) {
        contatti.remove(nome);
    }

    public String trovaNomeDaNumero(String numero) {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            if (entry.getValue().equals(numero)) {
                return entry.getKey();
            }
        }
        return null; // non trovato
    }

    public String trovaNumeroDaNome(String nome) {
        return contatti.get(nome);
    }

    public void stampaContatti() {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Numero: " + entry.getValue());
        }
    }
}
