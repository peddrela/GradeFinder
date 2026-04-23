package br.gradefinder;

import br.gradefinder.Turmas.Disciplina;

public interface API {
    Disciplina mandarRequest(String identificador, String tipo) throws Exception;

    boolean podeFazerRequest();
}
