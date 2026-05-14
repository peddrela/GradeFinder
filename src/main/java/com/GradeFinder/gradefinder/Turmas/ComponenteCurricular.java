package com.GradeFinder.gradefinder.Turmas;

abstract class ComponenteCurricular {
    protected String nome;
    protected String id;
    
    public ComponenteCurricular(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }
    
    public abstract String exibirInformacoes();
}
