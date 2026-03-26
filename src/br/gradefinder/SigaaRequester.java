package br.gradefinder;

import java.time.LocalTime;
import br.gradefinder.Turmas.Disciplina;

public class SigaaRequester implements API {
    LocalTime ultima_request;

    SigaaRequester() {
        this.ultima_request = LocalTime.now();
    }

    @Override
    public Disciplina mandarRequest(String id_materia) {
        return new Disciplina(); // TODO
    }
}
