import br.com.alura.sreenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.sreenmatch.calculos.Recomendacao;
import br.com.alura.sreenmatch.modelo.Episodios;
import br.com.alura.sreenmatch.modelo.Filme;
import br.com.alura.sreenmatch.modelo.Serie;

import java.security.spec.ECPoint;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Cães de Guerra");
        meuFilme.setAnoDeLancamento(2017);
        meuFilme.setDuracaoEmMinutos(193);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(4);
        meuFilme.avalia(2);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        //System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println("Total de avaliações" + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2001);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpsodios(50);
        System.out.println("Duração da serie " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Jonh Wick 4");
        outroFilme.setAnoDeLancamento(2022);
        outroFilme.setDuracaoEmMinutos(180);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao filtroRecomendacao = new Recomendacao();
        filtroRecomendacao.filtra(meuFilme);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie(lost);
        episodios.setNumero(300);
        filtroRecomendacao.filtra(episodios);


   }
}
