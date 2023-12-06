package br.com.alura.sreenmatch.modelo;

import br.com.alura.sreenmatch.calculos.Classificado;

public class Episodios implements Classificado {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassicacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return  2;
        }

    }
}
