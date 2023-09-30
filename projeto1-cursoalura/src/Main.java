public class Main {
    public static void main(String[] args) {
         System.out.println("Esse é o Catálogo");

        String nome = "Top Gun: Maverick";
        System.out.println("Filme: " + nome);

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        String sinopse;
        sinopse = """
                |
                |
                |
                Filme: %s
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento: %d
                """.formatted(nome, anoDeLancamento);

        System.out.println(sinopse);
        double media = 8.1;
        int classificacao = (int) (media/2);
        System.out.println(classificacao);

        /*
        System.out.println("Conversor de temperatura");

        double temperatura = 25.3;
        double fahren = (temperatura * 1.8) + 32;

        String message = String.format("A temperatura de: %.1f em celcios é equivalente a %.3f em fahrenheit", temperatura, fahren);
        System.out.println(message);

        int tempInteira = (int) fahren;
        System.out.println("A temperatura em fahrenheit inteira é: " + tempInteira);
        */


    }
}
