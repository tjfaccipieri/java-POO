package revisaoJava;

public class CursosLivres extends Cursos{
    private int modulos;
    private double cargaHoraria;

    public CursosLivres(int codigoCurso, String nome, int vagas, double valor, String periodo, boolean matricula,
                        int modulos, double cargaHoraria){
        super(codigoCurso, nome, vagas, valor, periodo, matricula);
        this.modulos = modulos;
        this.cargaHoraria = cargaHoraria;
    }

    public CursosLivres() {}

    public int getModulos() {
        return modulos;
    }

    public void setModulos(int modulos) {
        this.modulos = modulos;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public void visualizar(){
        super.visualizar();
        System.out.println(
                " \nQuantidade de módulos: " + getModulos() +
                " \nCarga Horária: " + getCargaHoraria()
        );
    }
}
