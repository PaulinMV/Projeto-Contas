// Aluno: Paulo Moisés Gonçalves Vieira
// R.A.: 159047-23

// ------------------- ***** ------------------- ***** -------------------

// Importação da biblioteca SCANNER para recolher informações do usuário
import java.util.Scanner;

public class MenuConta {
    public static void main(String[] args) {
        // Instanciando/Inicializando o SCANNER
        Scanner scanner = new Scanner(System.in);

        int opcoesMenu; // Variável que faz a leitura do Menu Principal
        int opcoesExtrato; // Variável que faz a leitura do Menu de Extrato
        int opcoesDeposito; // Variável que faz a leitura do Menu de Depósito
        int opcoesSaque; // Variável que faz a leitura do Menu de Saque

        // Método DO-WHILE - Executa algo com um parâmetro de repetição, com o DO, definimos o que ele faz,
        // Com o WHILE, passamos o parâmetro para que ele pare
        do {
            System.out.println("Bem-vindo ao BANCO CENTRAL");
            System.out.println("Escolha sua ação:");
            System.out.println("1. Nova conta.");
            System.out.println("2. Extrato.");
            System.out.println("3. Depósito.");
            System.out.println("4. Saque.");
            System.out.println("0. Sair.");
            System.out.print("Escolha uma opção: ");

            opcoesMenu = scanner.nextInt();

            // SWITCH CASE - Usado quando se tem mais de duas "ações" a serem executadas.
            // No caso do Menu, é usado para fazer certas ações de acordo com a escolha do usuário.
            // SWITCH - O Switch seguido dos ( ) seleciona a variável que será usada para ver cada ação.
            // CASE - O case é usado para executar tal ação caso o usuário tenha digitado por exemplo case 1
            // BREAK - O Break é um método que finaliza o processo do case
            // DEFAULT - O Default é para quando o usuário não digitar nenhuma das opções presentes em algum case
            switch (opcoesMenu) {
                case 1: // Nova Conta
                    System.out.println("Você escolheu: Nova conta");
                    // Adicione a lógica para criar uma nova conta aqui
                    break;
                case 2: // Extrato
                    System.out.println("Você escolheu: Extrato");
                    do {
                        System.out.println("Escolha qual extrato de conta deseja ver:");
                        System.out.println("1. Extrato conta Paulo");
                        System.out.println("2. Extrato conta Uninga");
                        System.out.println("3. Extrato conta Lucas");
                        System.out.println("4. Extrato conta Acer");
                        System.out.println("5. Extrato conta Maria");
                        System.out.println("0. Sair");
                        System.out.println("Digite sua opção: ");

                        opcoesExtrato = scanner.nextInt();

                        switch (opcoesExtrato) {
                            case 1:
                                System.out.println("Extrato da conta de Paulo:");
                                // Adicione a lógica para mostrar o extrato da conta de Paulo
                                break;
                            case 2:
                                System.out.println("Extrato da conta de Uninga:");
                                // Adicione a lógica para mostrar o extrato da conta de Uninga
                                break;
                            case 3:
                                System.out.println("Extrato da conta de Lucas:");
                                // Adicione a lógica para mostrar o extrato da conta de Lucas
                                break;
                            case 4:
                                System.out.println("Extrato da conta de Acer:");
                                // Adicione a lógica para mostrar o extrato da conta de Acer
                                break;
                            case 5:
                                System.out.println("Extrato da conta de Maria:");
                                // Adicione a lógica para mostrar o extrato da conta de Maria
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                                break;
                        }
                    } while (opcoesExtrato != 0);
                    break;
                case 3: // Depósito
                    System.out.println("Você escolheu: Depósito");
                    do {
                        System.out.println("Escolha em qual conta deseja fazer o depósito:");
                        System.out.println("1. Depósito na conta de Paulo");
                        System.out.println("2. Depósito na conta de Uninga");
                        System.out.println("3. Depósito na conta de Lucas");
                        System.out.println("4. Depósito na conta de Acer");
                        System.out.println("5. Depósito na conta de Maria");
                        System.out.println("0. Sair");
                        System.out.print("Digite sua opção: ");

                        opcoesDeposito = scanner.nextInt();

                        switch (opcoesDeposito) {
                            case 1:
                                System.out.println("Depósito na conta de Paulo:");
                                // Adicione a lógica para fazer o depósito na conta de Paulo
                                break;
                            case 2:
                                System.out.println("Depósito na conta de Uninga:");
                                // Adicione a lógica para fazer o depósito na conta de Uninga
                                break;
                            case 3:
                                System.out.println("Depósito na conta de Lucas:");
                                // Adicione a lógica para fazer o depósito na conta de Lucas
                                break;
                            case 4:
                                System.out.println("Depósito na conta de Acer:");
                                // Adicione a lógica para fazer o depósito na conta de Acer
                                break;
                            case 5:
                                System.out.println("Depósito na conta de Maria:");
                                // Adicione a lógica para fazer o depósito na conta de Maria
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                                break;
                        }
                    } while (opcoesDeposito != 0);
                    break;
                case 4: // Saque
                    System.out.println("Você escolheu: Saque");
                    do {
                        System.out.println("Escolha em qual conta deseja fazer o saque:");
                        System.out.println("1. Saque na conta de Paulo");
                        System.out.println("2. Saque na conta de Uninga");
                        System.out.println("3. Saque na conta de Lucas");
                        System.out.println("4. Saque na conta de Acer");
                        System.out.println("5. Saque na conta de Maria");
                        System.out.println("0. Sair");
                        System.out.print("Digite sua opção: ");

                        opcoesSaque = scanner.nextInt();

                        switch (opcoesSaque) {
                            case 1:
                                System.out.println("Saque na conta de Paulo:");
                                // Adicione a lógica para fazer o saque na conta de Paulo
                                break;
                            case 2:
                                System.out.println("Saque na conta de Uninga:");
                                // Adicione a lógica para fazer o saque na conta de Uninga
                                break;
                            case 3:
                                System.out.println("Saque na conta de Lucas:");
                                // Adicione a lógica para fazer o saque na conta de Lucas
                                break;
                            case 4:
                                System.out.println("Saque na conta de Acer:");
                                // Adicione a lógica para fazer o saque na conta de Acer
                                break;
                            case 5:
                                System.out.println("Saque na conta de Maria:");
                                // Adicione a lógica para fazer o saque na conta de Maria
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                                break;
                        }
                    } while (opcoesSaque != 0);
                    break;
                case 0: // Sair
                    System.out.println("Saindo do sistema. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcoesMenu != 0);

        scanner.close();
    }
}
