package com.GradeFinder.gradefinder.Sigaa;

import com.GradeFinder.gradefinder.Turmas.Disciplina;

public interface API {
    Disciplina mandarRequest(String identificador, String tipo) throws Exception;

    boolean podeFazerRequest();
}
