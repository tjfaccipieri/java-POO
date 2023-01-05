package estoqueLoja;

import java.util.ArrayList;
import java.util.List;

public class ControleLoja {
    public static void main(String[] args) {
        List<String> estoque = new ArrayList<String>();

        // adicionando itens na lista, pela ordem de inserção
        estoque.add("Camiseta");
        estoque.add("Vestido");
        estoque.add("Bota");

        // adicionando um item em um ponto específico da lista
        estoque.add(1, "Chapéu");

        System.out.println("Listagem de itens no estoque: " + estoque);

        // atualizando um item da lista (na verdade, nós removemos um e adiciona um novo no lugar)
        //  estoque.remove(2);   -> remoção pelo index do item
        estoque.remove("Bota"); //remoção pelo nome do item
        System.out.println("Listagem de itens no estoque ao remover um item: " + estoque);
        estoque.add("Coturno");

        //Exibindo os itens da lista
        System.out.println("Listagem de itens no estoque depois de atualizado: " + estoque);

        // editando um item da lista buscando pelo nome dele
        estoque.set(estoque.indexOf("Camiseta"), "camisa");
        System.out.println("Listagem de itens no estoque depois de atualizado: " + estoque);
    }
}
