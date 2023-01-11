package revisaoJava;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Desafio:
// Criar uma lista para os cursos livres, e uma lista para os cursos de especialização
// Criar um menu para consulta das listas (o menu fica a critério de cada pessoa, o que constar nas opções)
public class TesteCursos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean sistema = true;
        int opcao;
        List<CursosLivres> cursosLivres = new ArrayList<CursosLivres>();
        List<Especializacao> especializacoes = new ArrayList<Especializacao>();
        CursosLivres curso1 = new CursosLivres(
                1,
                "Java base",
                25,
                650,
                "integral",
                false,
                3,
                300
        );

        Especializacao curso2 = new Especializacao(
                1,
                "Java Avançado",
                20,
                800,
                "integral",
                true,
                "Java"
        );

        cursosLivres.add(curso1);
        especializacoes.add(curso2);

        while(sistema) {
            System.out.println("***************************************************");
            System.out.println("******** Escolha uma opção na lista abaixo ********");
            System.out.println("***************************************************");
            System.out.println("********** 1 - Listar Especializações   ***********");
            System.out.println("************ 2 - Listar Cursos Livres *************");
            System.out.println("********** 3 - Criar nova Especialização **********");
            System.out.println("********** 4 - Criar novo Curso Livre *************");
            System.out.println("********** 5 - Excluir Especialização *************");
            System.out.println("*********** 6 - Excluir Curso Livre ***************");
            System.out.println("************** 0 - Sair do sistema ****************");
            System.out.println("***************************************************");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1 -> {
                    // Repetição da lista por meio de um for, para gerar uma saida no console para cada objeto dentro
                    // da lista
                    for(Especializacao lista: especializacoes) {
                        lista.visualizar();
                        System.out.println("----------------------------");
                    }
                }

                case 2 -> {
                    // Repetição da lista por meio de um for, para gerar uma saida no console para cada objeto dentro
                    // da lista
                    for(CursosLivres lista: cursosLivres) {
                        lista.visualizar();
                        System.out.println("----------------------------");
                    }
                }

                case 3 -> {
                    // Gerando uma nova instancia de objeto para um curso de especialização, para depois solicitar os
                    // dados pelo console
                    Especializacao cursoEspecializacao = new Especializacao();
//                    System.out.println("Digite o código do curso: ");
//                    cursoEspecializacao.setCodigoCurso(entrada.nextInt());
//                    gerar código do curso automaticamente de acordo com tamanho da lista
                    cursoEspecializacao.setCodigoCurso(especializacoes.size() + 1);
                    //preenchendo cada um dos dados dentro do objeto utilizando scanner e os metodos SET criados nas
                    // classes
                    System.out.println("Qual o nome do curso? ");
                    cursoEspecializacao.setNome(entrada.next());
                    System.out.println("Quantas vagas o curso terá? ");
                    cursoEspecializacao.setVagas(entrada.nextInt());
                    System.out.println("Qual o valor do curso?");
                    cursoEspecializacao.setValor(entrada.nextDouble());
                    System.out.println("Qual o periodo de aulas?");
                    cursoEspecializacao.setPeriodo(entrada.next());
                    System.out.println("Qual o pré-requisito para o curso?");
                    cursoEspecializacao.setRequisito(entrada.next());
                    cursoEspecializacao.setMatricula(true);

                    // após pegar todos os dados, adicionar o objeto instanciado dentro da lista
                    especializacoes.add(cursoEspecializacao);

                    System.out.println("Curso de especialização criado com sucesso");
                }

                case 4 -> {
                    CursosLivres cursoLivre = new CursosLivres();
                    cursoLivre.setCodigoCurso(cursosLivres.size() + 1);
                    System.out.println("Qual o nome do curso? ");
                    cursoLivre.setNome(entrada.next());
                    System.out.println("Quantas vagas o curso terá? ");
                    cursoLivre.setVagas(entrada.nextInt());
                    System.out.println("Qual o valor do curso?");
                    cursoLivre.setValor(entrada.nextDouble());
                    System.out.println("Qual o periodo de aulas?");
                    cursoLivre.setPeriodo(entrada.next());
                    System.out.println("Quantos módulos o curso tem?");
                    cursoLivre.setModulos(entrada.nextInt());
                    System.out.println("Qual a carga horária do curso?");
                    cursoLivre.setCargaHoraria(entrada.nextDouble());
                    cursoLivre.setMatricula(true);

                    cursosLivres.add(cursoLivre);

                    System.out.println("Curso Livre criado com sucesso");
                }

                case 5 -> {
                    System.out.println("Digite o código de curso para excluir:");

                    // tentar remover o index com base no numero digitado pelo usuário, e em caso de erro, dar a
                    // mensagem de que o curso não existe
                    try{
                        especializacoes.remove(entrada.nextInt() - 1);
                        System.out.println("Especialização excluida com sucesso");
                    } catch(Exception error) {
                        System.out.println("O curso escolhido não existe");
                    }
                }

                case 6 -> {
                    System.out.println("Digite o código de curso para excluir:");
                    try{
                        cursosLivres.remove(entrada.nextInt() - 1);
                        System.out.println("Curso livre excluido com sucesso");
                    } catch(Exception error) {
                        System.out.println("O curso escolhido não existe");
                    }
                }

                case 0 -> {
                    System.out.println("Saindo do sistema, obrigado pelo uso");
                    sistema = false;
                }
                default -> System.out.println("Opção inválida");
            }

        }



    }
}
