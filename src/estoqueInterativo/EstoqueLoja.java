package estoqueInterativo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstoqueLoja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean sistema = true;
        int opcao;
        String itemLista, itemEdicao;
        List<String> estoque = new ArrayList<String>();

        while(sistema) {
        System.out.println("******** Escolha uma opção na lista abaixo ********");
        System.out.println("***************************************************");
        System.out.println("********** 1 - Adicionar um novo item   ***********");
        System.out.println("********** 2 - Remover um item da lista ***********");
        System.out.println("******* 3 - Exibir todos os itens da lista ********");
        System.out.println("********** 4 - Editar um item da lista ************");
        System.out.println("************** 0 - Sair do sistema ****************");
        System.out.println("***************************************************");

        opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("opção 1");
                    System.out.println("Digite o nome do item que deseja cadastrar: \n");
                    itemLista = entrada.next();
                    estoque.add(itemLista);
                    System.out.println("O item " + itemLista + " foi adicionado na lista");
                }
                case 2 -> {
                    System.out.println("opção 2");
                    System.out.println("Digite o nome do item que deseja apagar da lista");
                    itemLista = entrada.next();
                    estoque.remove(itemLista);
                    System.out.println("O item " + itemLista + " foi removido com sucesso");
                }
                case 3 -> {
                    System.out.println("opção 3");
                    System.out.println("Itens que estão na lista: \n" + estoque);
                }
                case 4 -> {
                    System.out.println("opção 4");
                    System.out.println("Digite o nome do item que deseja alterar");
                    itemLista = entrada.next();
                    System.out.println("Agora digite o novo nome do item");
                    itemEdicao = entrada.next();
                    estoque.set(estoque.indexOf(itemLista), itemEdicao);
                    System.out.println("O item " + itemLista + " foi modificado para " + itemEdicao + " com sucesso");
                }
                case 0 -> {
                    System.out.println("Saindo do sistema");
                    sistema = false;
                }
            }

        }
    }
}
