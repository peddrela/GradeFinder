package br.gradefinder.Sigaa;

import br.gradefinder.Turmas.Disciplina;

public interface API {
    Disciplina mandarRequest(String identificador, String tipo) throws Exception;

    boolean podeFazerRequest();
}
