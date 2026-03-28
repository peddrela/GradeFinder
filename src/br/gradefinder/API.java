package br.gradefinder;

import br.gradefinder.Turmas.Disciplina;

public interface API {
    Disciplina mandarRequest(String id_materia);

    boolean podeFazerRequest();
}
