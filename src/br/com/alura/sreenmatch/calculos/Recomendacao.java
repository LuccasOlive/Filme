package br.com.alura.sreenmatch.calculos;

public class Recomendacao {
    private String recomendacao;

    public void filtra(Classificado classificado) {
        if (classificado.getClassicacao() >= 4){
            System.out.println("Esta entre os preferidos do momento");
        } else if (classificado.getClassicacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
            
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
