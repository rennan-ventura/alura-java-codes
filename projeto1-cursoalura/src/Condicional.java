public class Condicional {

    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plu";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamnto que os clientes estão curtindo!");
        }  else {
            System.out.println("Filme retrô que vale a pena assitir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

    }

}
