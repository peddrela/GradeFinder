package br.gradefinder;

import br.gradefinder.Turmas.Disciplina;
import br.gradefinder.SigaaRequester;

import java.util.ArrayList;

public class Database {
    ArrayList<Disciplina> disciplinas;
    SigaaRequester requester;

    public Database(String arquivo_salvo_json) {}

    public Disciplina pegarMateriaPorID(String id) {
        return new Disciplina(); // stub
    }
    public Disciplina pegarMateriaPorNome(String id) {
        return new Disciplina(); // stub
    }
}
