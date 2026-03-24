package br.gradefinder;

import java.time.LocalTime;

public class SigaaRequester {
    LocalTime ultima_request;

    SigaaRequester() {
        this.ultima_request = LocalTime.now();
    }

    Disciplina mandarRequest(String id_materia) {
        return new Disciplina();
    }
}