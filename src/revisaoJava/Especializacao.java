package revisaoJava;

public class Especializacao extends Cursos{

    private String requisito;

    public Especializacao(int codigoCurso, String nome, int vagas, double valor, String periodo, boolean matricula, String requisito) {
        super(codigoCurso, nome, vagas, valor, periodo, matricula);
        this.requisito = requisito;
    }

    public Especializacao(){}

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println(
                "Pré-requisito para o curso: " + getRequisito()
        );
    }
}
