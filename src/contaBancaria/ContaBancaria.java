package contaBancaria;

// nome do nosso objeto
public class ContaBancaria {
    //	atributos/caracteristicas do nosso objeto
    private int numero;
    private int agencia;
    private int tipo;
    private String titular;
    private float saldo;


    //	Criação do construtor do nosso objeto, para poder acessar a nossa classe por fora desse arquivo
    //	Cada um dos atributos descritos aqui, irão repassar os seus dados para a classe principal ContaBancaria
    // Método construtor
    public ContaBancaria(int numero, int agencia, int tipo, String titular, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Outro método construtor
    public ContaBancaria() {
        // criação da conta bancaria sem a necessidade de passar todos os dados (construtor utilizado para testes)
    }


    //Métodos acessores da classe

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    // métodos especificos da conta bancária

    // método de saque de valores
    public boolean sacar(float valorSacado) {
        if(this.getSaldo() < valorSacado) {
            System.out.println("Saldo insuficiente, você ta quebrada minha boa pessoa");
            return false;
        }
        this.setSaldo(this.getSaldo() - valorSacado);
        System.out.println("Valor de R$" + valorSacado +  " sacado com sucesso \nAgora o seu saldo é de: " + this.getSaldo());
        return true;
    }

    public void depositar(float valor){
        System.out.println("Deposito de " + valor + " feito com sucesso, seu saldo atual é de: " + (getSaldo() + valor));
        this.setSaldo(this.getSaldo() + valor);
    }
}
