package com.GradeFinder.gradefinder.Turmas;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Repositorio<T> {  // <T> → classe genérica, satisfaz o requisito

    private ArrayList<T> itens = new ArrayList<>();

    public void adicionar(T item) {
        itens.add(item);
    }

    // Predicate<T> porque o tipo do filtro tem que bater com o tipo da coleção
    public ArrayList<T> filtrar(Predicate<T> pred) {
        return itens.stream()
                .filter(pred)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<T> todos() {
        return new ArrayList<>(itens);
    }
}
