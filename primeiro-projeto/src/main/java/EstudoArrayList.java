import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {
    public static void main(String[] args) {

        // Criando uma lista de compras
        List<String> listaDeCompras = new ArrayList<>();

        // Adicionando itens à lista
        listaDeCompras.add("Arroz");
        listaDeCompras.add("Feijão");
        listaDeCompras.add("Café");
        listaDeCompras.add("Leite");
        listaDeCompras.add("Desodorante");

        // Inserindo um item na posição 1
        listaDeCompras.add(1, "Uva");

        // Imprimindo todos os itens da lista
        System.out.println("Itens da lista:");
        for (String item : listaDeCompras) {
            System.out.println(item);
        }

        // Pegando item da posição 3
        String itemNaPosicao3 = listaDeCompras.get(3);
        System.out.println("\nNa posição 3 tenho: " + itemNaPosicao3);

        // Removendo o item "Arroz"
        listaDeCompras.remove("Arroz");

        // Imprimindo a lista novamente
        System.out.println("\nLista após remover 'Arroz':");
        for (String item : listaDeCompras) {
            System.out.println(item);
        }

        // Verificando se a lista está vazia
        boolean estaVazia = listaDeCompras.isEmpty();
        int tamanho = listaDeCompras.size();
        boolean contemArroz = listaDeCompras.contains("Arroz");

        System.out.println("\nA lista está vazia? " + estaVazia);
        System.out.println("Tamanho da lista: " + tamanho);
        System.out.println("A lista contém 'Arroz'? " + contemArroz);

        // Limpando a lista
        listaDeCompras.clear();
        System.out.println("\nApós limpar, a lista está vazia? " + listaDeCompras.isEmpty());

        listaDeCompras.forEach(produtos -> System.out.println(produtos) );
    }
}
