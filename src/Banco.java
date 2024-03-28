// Importação das classes ArrayList e List do pacote java.util
import java.util.ArrayList;
import java.util.List;

// Declaração da classe Banco
public class Banco {
    // Lista de clientes do banco
    private List<Cliente> clientes;
    // Contador de clientes (não utilizado neste código)
    private int counter;

    // Construtor da classe Banco
    public Banco() {
        // Inicializa a lista de clientes como um ArrayList vazio
        this.clientes = new ArrayList<>();
        // Inicializa o contador de clientes como 0 (não utilizado neste código)
        this.counter = 0;
    }

    // Método para obter a lista de clientes do banco
    public List<Cliente> getClientes() {
        return clientes;
    }

    // Método para adicionar um cliente à lista de clientes do banco
    public void adicionaCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Método para obter um cliente pelo CPF
    public Cliente getCliente(String cpf) {
        // Percorre a lista de clientes
        for (Cliente cliente : clientes) {
            // Verifica se o CPF do cliente atual é igual ao CPF fornecido
            if (cliente.getCPF().equals(cpf)) {
                // Se for igual, retorna o cliente
                return cliente;
            }
        }
        // Se nenhum cliente com o CPF fornecido for encontrado, retorna null
        return null;
    }

    // Método para realizar mudanças anuais em todos os clientes
    public void realizarMudancasAnuais() {
        // Percorre a lista de clientes
        for (Cliente cliente : clientes) {
            // Obtém a conta do cliente
            Conta conta = cliente.getConta();
            // Obtém o saldo atual da conta
            double saldo = conta.getSaldo();
            // Aqui você pode adicionar lógica para realizar as mudanças necessárias
            // Neste exemplo simples, apenas incrementamos o saldo em 100 a cada ano
            conta.setSaldo(saldo + 100);
        }
    }

    // Método para retornar o nome do banco
    public String getNomeBanco() {
        return "banco@warleymarques";
    }
}
