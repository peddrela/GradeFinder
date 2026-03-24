package br.gradefinder;

import br.gradefinder.Disciplina;
import br.gradefinder.SigaaRequester;

import java.util.ArrayList;

public class Database {
    ArrayList<Disciplina> disciplinas;
    SigaaRequester requester;

    Database(String arquivo_salvo_json) {}

    Disciplina pegarMateriaPorID(String id) {
        return new Disciplina(); // stub
    }
    Disciplina pegarMateriaPorNome(String id) {
        return new Disciplina(); // stub
    }

    void loadArtificialData(String file_name) {

    }
}