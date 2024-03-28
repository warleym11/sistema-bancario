import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicializa o Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);
        // Cria uma instância do banco
        Banco banco = new Banco();

        // Variável para controlar se deve adicionar um novo cliente
        boolean adicionarCliente = true;

        // Loop para adicionar clientes enquanto o usuário desejar
        while (adicionarCliente) {
            // Pergunta ao usuário se deseja adicionar um novo cliente
            System.out.println("Deseja adicionar um novo cliente? (S/N)");
            // Lê a resposta do usuário
            String resposta = scanner.nextLine();

            // Se a resposta for "S" (sim)
            if (resposta.equalsIgnoreCase("S")) {
                // Solicita o nome do cliente
                System.out.println("Digite o nome do cliente:");
                String nomeCliente = scanner.nextLine();
                // Solicita o CPF do cliente
                System.out.println("Digite o CPF do cliente:");
                String cpfCliente = scanner.nextLine();
                // Solicita o número da conta do cliente
                System.out.println("Digite o número da conta do cliente:");
                String numeroConta = scanner.nextLine();
                // Solicita a agência da conta do cliente
                System.out.println("Digite a agência da conta do cliente:");
                String agenciaConta = scanner.nextLine();

                 // Cria uma instância de Cliente com os dados fornecidos
                Cliente cliente = new Cliente(nomeCliente, cpfCliente, banco);
                // Cria uma instância de Conta com os dados fornecidos
                Conta conta = new Conta(numeroConta, agenciaConta);
                // Define a conta do cliente
                cliente.setConta(conta);
                // Adiciona o cliente ao banco
                banco.adicionaCliente(cliente);

                // Exibe uma mensagem de sucesso
                System.out.println("Cliente adicionado com sucesso!");
            }
            // Se a resposta for "N" (não)
            else if (resposta.equalsIgnoreCase("N")) {
                // Define adicionarCliente como false para encerrar o loop
                adicionarCliente = false;
            }
            // Se a resposta não for nem "S" nem "N"
            else {
                // Exibe uma mensagem de opção inválida
                System.out.println("Opção inválida. Por favor, digite S para sim ou N para não.");
            }
        }

        // Itera sobre a lista de clientes do banco e exibe suas informações
        for (Cliente cliente : banco.getClientes()) {
            System.out.println("Nome do cliente: " + cliente.getNome());
            System.out.println("CPF do cliente: " + cliente.getCPF());
            System.out.println("Número da conta do cliente: " + cliente.getConta().getNumero());
            System.out.println("Agência da conta do cliente: " + cliente.getConta().getAgencia());
            System.out.println("Banco do cliente: " + cliente.getBanco());
            System.out.println();
        }

        // Fecha o Scanner para liberar os recursos
        scanner.close();
    }
}
