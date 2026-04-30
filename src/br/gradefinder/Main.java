package br.gradefinder;

import br.gradefinder.Turmas.Database;
import br.gradefinder.Turmas.Disciplina;

import java.lang.annotation.AnnotationTypeMismatchException;

@EhMain(version = 2)
public class Main {
    public static void main(String[] args) {
        if (!Main.class.isAnnotationPresent(EhMain.class)) {
            System.err.println("Não possui annotation 'EhMain'");
            System.exit(1);
        }

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
