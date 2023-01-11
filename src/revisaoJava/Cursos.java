package revisaoJava;

public abstract class Cursos {

    private int codigoCurso;
    private String nome;
    private int vagas;
    private double valor;
    private String periodo;

    private boolean matricula;

    public Cursos(int codigoCurso, String nome, int vagas, double valor, String periodo, boolean matricula) {
        this.codigoCurso = codigoCurso;
        this.nome = nome;
        this.vagas = vagas;
        this.valor = valor;
        this.periodo = periodo;
        this.matricula = matricula;
    }

    public Cursos(){}

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public void visualizar() {
        System.out.println("Código do curso: " + getCodigoCurso() +
                " \nNome do curso: " + getNome() +
                " \nQuantidade de vagas: " + getVagas() +
                " \nPeriodo do curso: " + getPeriodo() +
                " \nValor: " + getValor());
        if(isMatricula()) {
            System.out.println("Está com matriculas abertas");
        } else {
            System.out.println("Matriculas temporariamente fechadas");
        }

    }
}
