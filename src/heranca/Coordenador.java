package heranca;

public class Coordenador extends Funcionario {
    private String area;

    public Coordenador(String nome, int matricula, int idade, String setor, String area) {
        super(nome, matricula, idade, setor);
        this.area = area;
    }

    public Coordenador(){}

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
