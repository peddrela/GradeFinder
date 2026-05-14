package com.GradeFinder.gradefinder.Sigaa;

import java.time.LocalTime;

import com.GradeFinder.gradefinder.Turmas.Disciplina;

public class SigaaRequester implements API {
    LocalTime ultima_request;

    public SigaaRequester() {
        this.ultima_request = LocalTime.now();
    }

    @Override
    public Disciplina mandarRequest(String identificador, String tipo) throws Exception {
        if (!podeFazerRequest()) return null;

        ultima_request = LocalTime.now();

        return new Disciplina(); // TODO
    }

    public Disciplina mandarRequestID(String id) throws Exception {
        return mandarRequest(id, "id");
    }

    public Disciplina mandarRequestNome(String nome) throws Exception {
        return mandarRequest(nome, "nome");
    }

    @Override
    public boolean podeFazerRequest() {
        return LocalTime.now().isAfter(ultima_request.plusSeconds(1));
    }
}
