package br.gradefinder;

import java.time.LocalTime;

import br.gradefinder.Turmas.Disciplina;

public class SigaaRequester implements API {
    LocalTime ultima_request;

    public SigaaRequester() {
        this.ultima_request = LocalTime.now();
    }

    @Override
    public Disciplina mandarRequest(String id_materia) {
        if (!podeFazerRequest()) return null;

        ultima_request = LocalTime.now();

        return new Disciplina(); // TODO
    }

    @Override
    public boolean podeFazerRequest() {
        return LocalTime.now().isAfter(ultima_request.plusSeconds(1));
    }
}
