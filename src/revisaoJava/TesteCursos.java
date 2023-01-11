package revisaoJava;

// Desafio:
// Criar uma lista para os cursos livres, e uma lista para os cursos de especialização
// Criar um menu para consulta das listas (o menu fica a critério de cada pessoa, o que constar nas opções
public class TesteCursos {
    public static void main(String[] args) {
        CursosLivres curso1 = new CursosLivres(1,
                "Java",
                25,
                650,
                "integral",
                true,
                3,
                300);

        Especializacao curso2 = new Especializacao(1,
                "Java Avançado",
                20,
                800,
                "integral",
                true,
                "Java");

        curso1.visualizar();
        System.out.println("-------------------------");
        curso2.visualizar();



    }
}
