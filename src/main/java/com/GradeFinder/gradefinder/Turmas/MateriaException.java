package com.GradeFinder.gradefinder.Turmas;

public class MateriaException extends Exception {

    public enum ExceptionType {
        NONE,
        NOT_FOUND,
        NETWORK_ERROR,
        NEEDS_USER_LOGIN,
        WRONG_CREDENTIALS,
    } // TODO criar classes filhas pra cada erro

    ExceptionType type;

    public MateriaException() {
        super();
    }

    public MateriaException(String mensagem) {
        super(mensagem);
        type = ExceptionType.NONE;
    }

    public MateriaException(String mensagem, ExceptionType causa) {
        super(mensagem);
        type = causa;
    }
}
