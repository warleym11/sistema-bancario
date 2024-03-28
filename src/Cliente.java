// Declaração da classe Cliente
public class Cliente {
    // Atributos da classe Cliente
    private Conta conta; // Conta associada ao cliente
    private String nome; // Nome do cliente
    private String cpf; // CPF do cliente
    private Banco banco; // Banco ao qual o cliente está associado

    // Construtor da classe Cliente
    public Cliente(String nome, String cpf, Banco banco) {
        this.conta = null; // Inicializa a conta como nula (será atribuída posteriormente)
        this.nome = nome; // Atribui o nome fornecido ao atributo nome
        this.cpf = cpf; // Atribui o CPF fornecido ao atributo cpf
        this.banco = banco; // Atribui o banco fornecido ao atributo banco
    }

    // Método para obter a conta do cliente
    public Conta getConta() {
        return conta; // Retorna a conta associada ao cliente
    }

    // Método para definir a conta do cliente
    public void setConta(Conta conta) {
        this.conta = conta; // Define a conta do cliente com a conta fornecida
    }

    // Método para obter o nome do cliente
    public String getNome() {
        return nome; // Retorna o nome do cliente
    }

    // Método para obter o CPF do cliente
    public String getCPF() {
        return cpf; // Retorna o CPF do cliente
    }

    // Método para obter o nome do banco associado ao cliente
    public String getBanco() {
        return banco.getNomeBanco(); // Retorna o nome do banco associado ao cliente usando o método getNomeBanco() do objeto banco
    }

    // Método para definir o banco associado ao cliente
    public void setBanco(Banco banco) {
        this.banco = banco; // Define o banco associado ao cliente com o banco fornecido
    }
}
