package br.gradefinder.Turmas;

import br.gradefinder.Sigaa.SigaaRequester;
import br.gradefinder.Turmas.MateriaException.ExceptionType;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Database {
    Repositorio<Disciplina> repositorio;
    HashMap<String, Disciplina> disciplinaPorID;
    HashMap<String, Disciplina> disciplinaPorNome;
    SigaaRequester requester;

    public Database(String arquivo_salvo_json) {
        repositorio = new Repositorio<>();
        disciplinaPorID = new HashMap<>();
        disciplinaPorNome = new HashMap<>();

        carregarArquivoJson(arquivo_salvo_json);

        requester = new SigaaRequester();
    }

    public Disciplina pegarMateriaPorID(String id) throws MateriaException {
        Disciplina disciplina = disciplinaPorID.get(id);

        if (disciplina == null) {
            // TODO melhorar essa forma de esperar
            while(true) {
                if (requester.podeFazerRequest()) break;
            }

            try {
                disciplina = requester.mandarRequestID(id);
                adicionarDisciplina(disciplina);
            } catch (Exception e) {
                // TODO checar tipo de exceção e converter pra MateriaException coerente
                throw new MateriaException("SIGAA caiu", ExceptionType.NETWORK_ERROR);
                // throw new MateriaException("SIGAA não achou a matéria", ExceptionType.NOT_FOUND);
            }
        }

        return disciplina;
    }

    public Disciplina pegarMateriaPorNome(String nome) throws MateriaException {
        Disciplina disciplina = disciplinaPorNome.get(nome);

        if (disciplina == null) {
            // TODO melhorar essa forma de esperar
            while(!requester.podeFazerRequest()) {}

            try {
                disciplina = requester.mandarRequestNome(nome);
                adicionarDisciplina(disciplina);
            } catch (Exception e) {
                // TODO checar tipo de exceção e converter pra MateriaException
                throw new MateriaException("SIGAA caiu", ExceptionType.NETWORK_ERROR);
                // throw new MateriaException("SIGAA não achou a matéria", ExceptionType.NOT_FOUND);
            }
        }

        return disciplina;
    }

    public ArrayList<Disciplina> acharDesbloqueios(Disciplina disciplina) {
        return repositorio.filtrar(d -> d.pegarDependencias().contains(disciplina));
    }

    private void carregarArquivoJson(String arquivo_salvo_json) {
        // TODO rodar o parser de json

        try {
            String conteudo_json = Files.readString(Path.of(arquivo_salvo_json));
            // TODO processar json...
        } catch (NoSuchFileException e) {
            // arquivo não existe
        } catch (AccessDeniedException e) {
            // usuário sem permissão de leitura
        } catch (IOException e) {
            // qualquer outro erro de IO
        }
        // TODO informar o usuário de qualquer erro desses acima
    }

    private void adicionarDisciplina(/* TODO adicionar parâmetros */) {
        String id = ""; // STUB
        String nome = ""; // STUB

        Disciplina nova = new Disciplina(nome, id); // TODO adicionar dependências

        adicionarDisciplina(nova);
    }

    private void adicionarDisciplina(Disciplina disciplina) {
        repositorio.adicionar(disciplina);
        disciplinaPorID.put(disciplina.getID(), disciplina);
        disciplinaPorNome.put(disciplina.getNome(), disciplina);
    }
}
