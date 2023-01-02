package contaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1, 123, 1, "Thiago", 100.0f);

        System.out.println("Numero da conta: " + conta1.getNumero());
        System.out.println("Numero da agencia: " + conta1.getAgencia());
        System.out.println("Numero do tipo da conta: " + conta1.getTipo());
        System.out.println("Nome do titular da conta: " + conta1.getTitular());
        System.out.println("Saldo atual: " + conta1.getSaldo());


        conta1.sacar(80f);

    }
}
