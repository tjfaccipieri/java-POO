package heranca;

public class Contratacao {
    public static void main(String[] args) {
        Pessoa funcionario1 = new Pessoa("Thiago", 123, 36);
        Funcionario funcionario2 = new Funcionario("Jessica", 231, 18, "aulas");
        Coordenador coordenador = new Coordenador();

        coordenador.setNome("Samuel");
        coordenador.setMatricula(123123);
        coordenador.setSetor("Aulas");
        coordenador.setArea("Ensino");


        System.out.println(funcionario1.getNome());
        System.out.println(funcionario2.getSetor());
        System.out.println(coordenador.getIdade());
    }
}
