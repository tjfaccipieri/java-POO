package contaBancaria;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends ContaBancaria {
//    declarar a data dde aniversário como string, para receber a data já formatada
    private String dataAniversario;
//    trazer o SimpleDateFormat de dentro do java, para colocar um padrão (pattern) de exibição da data
    private SimpleDateFormat formatData = new SimpleDateFormat("dd/MMMM");
    private String data = formatData.format(new Date());
//    gerar a data automaricamente pelo sistema, com o Date (que vem do java tbm), e já aplicar a formatação criada acima


    public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo) {
        super(numero, agencia, tipo, titular, saldo);
//        contruir o objeto Conta Poupança com a data inserida automaticamente
        this.dataAniversario = this.data;

    }

    public ContaPoupanca(){
//        mesmo que seja feita a criação do objeto vazio, a data será inserida automaticamente
        this.dataAniversario = this.data;
    }

    public String getDataAniversario() {
        return dataAniversario ;
    }

    public void simularRendimento() {
        System.out.println("Com base no valor atual da sa conta, de " + this.getSaldo() + " Reais, seu rendimento em 30 dias será de: " + (this.getSaldo() * 0.05) + " Reais");
    }


}
