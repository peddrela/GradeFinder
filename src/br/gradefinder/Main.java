package br.gradefinder;

import br.gradefinder.Database;
import br.gradefinder.Turmas.Disciplina;

public class Main {
    public static void main(String[] args) {
        Database db = new Database("db.json");

        try {
            Disciplina salva = db.pegarMateriaPorNome("Estruturas de Dados Básicas");
            Disciplina nao_salva = db.pegarMateriaPorID("Matemática para Computação 2");

            System.out.println(salva.toString());
            System.out.println(nao_salva.toString());
        } catch (Exception e) {
            // TODO
        }

    }
}
