package br.gradefinder.Turmas;

import java.util.ArrayList;

public class Disciplina {
    String nome;
    String id;
    ArrayList<Disciplina> dependencias;
    ArrayList<Disciplina> equivalencias;
    boolean pagou;

    public Disciplina() {
        this("Disciplina Teste", "xxx0000");
    }
    public Disciplina(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public void inserirDependencia() {}
    public void inserirEquivalencia() {}

    public ArrayList<Disciplina> pegarDependencias() {
        return new ArrayList<>(dependencias);
    }
    public ArrayList<Disciplina> pegarEquivalencias() {
        return new ArrayList<>(equivalencias);
    }

    public String toString() {
      return "Nome: " + this.nome + "; ID: " + this.id;
    }

    public String getNome() {
        return this.nome;
    }
    public String getID() {
        return this.id;
    }
}
