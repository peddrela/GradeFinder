package br.gradefinder;

import java.util.ArrayList;

public class Disciplina {
    String nome;
    String id;
    ArrayList<Disciplina> dependencias;
    ArrayList<Disciplina> equivalencias;
    boolean pagou;

    Disciplina(String nome, String id) {}

    void inserirDependencia() {}
    void inserirEquivalencia() {}

    Disciplina pegarDependencias() {
        return new Disciplina();
    }
    Disciplina pegarEquivalencias() {
        return new Disciplina();
    }

    Disciplina() {

    }
}