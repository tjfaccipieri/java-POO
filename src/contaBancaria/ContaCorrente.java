package contaBancaria;

public class ContaCorrente extends ContaBancaria{
    private float limite;

    public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
        super(numero, agencia, tipo, titular, saldo);
        this.limite = this.getSaldo() / 4;
    }

    public ContaCorrente() {}

    public float getLimite() {
        return limite;
    }

    private void setLimite(float limite) {
        this.limite = limite;
    }


    public boolean sacar(float valorSacado) {
        if (this.getSaldo() + this.getLimite() < valorSacado) {
            System.out.println("Dá não, sem limite pra isso parceiro");
            return false;
        }

        this.setSaldo(this.getSaldo() - valorSacado);
        System.out.println("Valor de R$" + valorSacado +  " sacado com sucesso \nAgora o seu saldo é de: " + this.getSaldo());
        return true;
    }
}
