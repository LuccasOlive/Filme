package br.com.alura.sreenmatch.calculos;

import br.com.alura.sreenmatch.modelo.Filme;
import br.com.alura.sreenmatch.modelo.Serie;
import br.com.alura.sreenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionado duração em minutos " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
