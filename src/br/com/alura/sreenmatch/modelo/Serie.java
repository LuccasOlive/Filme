package br.com.alura.sreenmatch.modelo;

public class Serie extends Titulo{

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getMinutosPorEpsodios() {
        return minutosPorEpsodios;
    }

    public void setMinutosPorEpsodios(int minutosPorEpsodios) {
        this.minutosPorEpsodios = minutosPorEpsodios;
    }

    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporadas;
    private int minutosPorEpsodios;

    @Override //Sobreescrever
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporadas * minutosPorEpsodios;
    }
}
