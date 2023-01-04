package sobrecargaMetodos;

public class Sobrecarga {
    public void testaMetodo() {
        System.out.printf("Salário em número inteiro: %d \n", salario(3000));
        System.out.printf("Salário em número fracionado: %f \n", salario(3.000));
    }

    public int salario(int valorInt) {
        System.out.println("Salário em número inteiro: \n" + valorInt);
        return valorInt * 2;
    }

    public double salario(double valorDouble) {
        System.out.println("Salário em número fracionado: \n" + valorDouble);
        return valorDouble * (valorDouble / 2);
    }
}
