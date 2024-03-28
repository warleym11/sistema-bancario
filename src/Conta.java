public class Conta {
    private double saldo; // Variável para armazenar o saldo da conta
    private Cliente cliente; // Referência ao cliente associado a esta conta
    private String numero; // Número da conta
    private String agencia; // Agência da conta

    // Construtor da classe Conta
    public Conta(String numero, String agencia) {
        // Inicializa o saldo como 0.0
        this.saldo = 0.0;
        // Define o cliente como nulo (ainda não associado)
        this.cliente = null;
        // Define o número da conta
        this.numero = numero;
        // Define a agência da conta
        this.agencia = agencia;
    }

    // Método para obter o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    // Método para definir o saldo da conta
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para obter o cliente associado a esta conta
    public Cliente getCliente() {
        return cliente;
    }

    // Método para definir o cliente associado a esta conta
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Método para obter o número da conta
    public String getNumero() {
        return numero;
    }

    // Método para obter a agência da conta
    public String getAgencia() {
        return agencia;
    }
}
