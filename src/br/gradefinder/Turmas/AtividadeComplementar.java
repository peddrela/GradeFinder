package br.gradefinder.Turmas;

public class AtividadeComplementar extends ComponenteCurricular {
    private int horas;
    
    public AtividadeComplementar(String nome, String id, int horas) {
        super(nome, id);
        this.horas = horas;
    }
    
    @Override
    public String exibirInformacoes() {
        return "Atividade: " + nome + " | ID: " + id + " | Horas: " + horas;
    }
}
