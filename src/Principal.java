public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Cães de Guerra";
        meuFilme.anoDeLancamento = 2017;
        meuFilme.duracaoEmMinutos = 193;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(4);
        meuFilme.avalia(2);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());


    }
}
