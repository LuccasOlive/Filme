import br.com.alura.sreenmatch.modelo.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Cães de Guerra");
        meuFilme.setAnoDeLancamento(2017);
        meuFilme.setDuracaoEmMinutos(193);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(4);
        meuFilme.avalia(2);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        //System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println("Total de avaliações" + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


    }
}
