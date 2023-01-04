package heranca;

public class Funcionario extends Pessoa {
    private String setor;

    public Funcionario(String nome, int matricula, int idade, String setor) {
        super(nome, matricula, idade);
        this.setor = setor;
    }

    public Funcionario() {}

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
