package contaBancaria;

import java.util.ArrayList;

public class TesteContaBancaria {
    public static void main(String[] args) {

        ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
//        ContaBancaria conta1 = new ContaBancaria(1, 123, 1, "Thiago", 100.0f);

//        ContaCorrente conta1 = new ContaCorrente(1,123,1,"Thiago",400.0f);
//        System.out.println("Numero da conta: " + conta1.getNumero());
//        System.out.println("Numero da agencia: " + conta1.getAgencia());
//        System.out.println("Numero do tipo da conta: " + conta1.getTipo());
//        System.out.println("Nome do titular da conta: " + conta1.getTitular());
//        System.out.println("Saldo atual: " + conta1.getSaldo());
//        System.out.println("Limite de saque da conta: " + conta1.getLimite());
//
//        ContaPoupanca conta2 = new ContaPoupanca(1,123,1,"Thiago",400.0f);

        ContaBancaria conta1 = new ContaBancaria(1,123,1,"Thiago",400f);

        contas.add(conta1);

        System.out.println("Contas cadastradas atualmente: " + contas.toArray());



    }
}
