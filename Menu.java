import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("---------- Menu ----------");
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Listar Contas existentes");
            System.out.println("3 - Entrar em uma Conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            // switch (opcao) {
            //     case 1:
            //         System.out.print("Digite o nome do cliente: ");
            //         String nomeCliente = scanner.nextLine();
            //         banco.cadastrarConta(nomeCliente);
            //         break;
            //     case 2:
            //         banco.listarContas();
            //         break;
            //     case 3:
            //         System.out.print("Digite o número da conta: ");
            //         int numeroConta = scanner.nextInt();
            //         scanner.nextLine(); // Limpar o buffer do scanner

            //         Conta conta = banco.buscarConta(numeroConta);
            //         if (conta != null) {
            //             System.out.println("Cliente: " + conta.getNomeCliente());
            //             System.out.println("Saldo: R$" + conta.getSaldo());

            //             int operacao;
            //             do {
            //                 System.out.println("---------- Menu ----------");
            //                 System.out.println("1 - Realizar Saque");
            //                 System.out.println("2 - Realizar Depósito");
            //                 System.out.println("3 - Realizar Transferência");
            //                 System.out.println("0 - Voltar");
            //                 System.out.print("Escolha uma operação: ");
            //                 operacao = scanner.nextInt();
            //                 scanner.nextLine(); // Limpar o buffer do scanner

            //                 switch (operacao) {
            //                     case 1:
            //                         System.out.print("Digite o valor do saque: ");
            //                         double valorSaque = scanner.nextDouble();
            //                         conta.sacar(valorSaque);
            //                         break;
            //                     case 2:
            //                         System.out.print("Digite o valor do depósito: ");
            //                         double valorDeposito = scanner.nextDouble();
            //                         conta.deposito(valorDeposito);
            //                         break;
            //                     case 3:
            //                         System.out.println("Contas disponíveis para transferência:");
            //                         banco.listarContas();
            //                         System.out.print("Digite o número da conta de destino: ");
            //                         int numeroContaDestino = scanner.nextInt();
            //                         scanner.nextLine(); // Limpar o buffer do scanner

            //                         Conta contaDestino = banco.buscarConta(numeroContaDestino);
            //                         if (contaDestino != null) {
            //                             System.out.print("Digite o valor da transferência: ");
            //                             double valorTransferencia = scanner.nextDouble();
            //                             conta.transferir(contaDestino, valorTransferencia);
            //                         } else {
            //                             System.out.println("Conta de destino não encontrada.");
            //                         }
            //                         break;
            //                     case 0:
            //                         System.out.println("Voltando ao menu principal.");
            //                         break;
            //                     default:
            //                         System.out.println("Opção inválida.");
            //                 }
            //             } while (operacao != 0);
            //         } else {
            //             System.out.println("Conta não encontrada.");
            //         }
            //         break;
            //     case 0:
            //         System.out.println("Encerrando o programa.");
            //         break;
            //     default:
            //         System.out.println("Opção inválida.");
            // }
        } while (opcao != 0);

        scanner.close();
    }
}


    