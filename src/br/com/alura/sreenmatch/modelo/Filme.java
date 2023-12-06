package br.com.alura.sreenmatch.modelo;

import br.com.alura.sreenmatch.calculos.Classificado;

public class Filme extends Titulo implements Classificado {
    private String diretor;

    public String getDiretor () {
        return diretor;
    }

    @Override
    public int getClassicacao() {
        return (int) pegaMedia() / 2;
    }
}
