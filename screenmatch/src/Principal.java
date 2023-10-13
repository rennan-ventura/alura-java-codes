import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("O poderoso chefão");
        filme.setAnoDeLancamento(1970);
        filme.setDuracaoEmMinutos(180);

        filme.exibeFilme();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);
        //System.out.println(filme.somaDasAvaliacoes);
        System.out.println("Total de avaliaçoes: " + filme.getTotalDeAvaliacoes());
        System.out.println(filme.media());
    }
}
