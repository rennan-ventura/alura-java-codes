import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Rennan Ventura";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;

        String mensagemInicial = """
                **************************************************
                Dados do cliente:
                
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: %.2f
                **************************************************
                """.formatted(nome, tipoConta, saldo);
        String mensagemMenu = """
                    Operações:
                **Digite a sua opção**
                1-Consultar saldo
                2-Transferir valor
                3-Receber valor
                4-Sair
                """;

        System.out.println(mensagemInicial);

        while(opcao != 4){
            System.out.println(mensagemMenu);
            opcao = leitura.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Seu saldo atual é: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor da transferencia: ");
                    double transf = leitura.nextDouble();
                    if(transf > saldo){ System.out.println("Não é possivel realizar a transferencia com o saldo atual!!!"); }
                    else {
                        saldo -= transf;
                        System.out.println("O valor do saldo agora é: " + saldo);
                    }
                    break;
                case 3 :
                    System.out.println("Digite o valor que irá receber: ");
                    double recebe = leitura.nextDouble();
                    saldo += recebe;
                    System.out.println("O valor do saldo agora é: " + saldo);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida, insira um número da tabela por favor!!!");
                    break;
            }
        }

    }
}