package revisaoJava;

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
