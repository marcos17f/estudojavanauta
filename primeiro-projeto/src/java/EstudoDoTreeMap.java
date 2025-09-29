import java.util.Map;
import java.util.TreeMap;

public class EstudoDoTreeMap {
    public static void main(String[] args) {

        // Criando um TreeMap que armazena nomes de alunos (chave) e suas notas (valor)
        TreeMap<String, Double> notaAlunos = new TreeMap<>();

        // Adicionando alunos e suas respectivas notas
        notaAlunos.put("Marcos", 10.0);
        notaAlunos.put("Luana", 9.8);
        notaAlunos.put("Ana Karine", 8.0);

        // Percorrendo o TreeMap usando apenas as chaves (keySet)
        System.out.println("Usando keySet():");
        for (String nome : notaAlunos.keySet()) {
            double nota = notaAlunos.get(nome);
            System.out.println(nome + ": " + nota);
        }

        // Outra forma de percorrer o TreeMap, agora usando Map.Entry (acesso direto à chave e valor)
        System.out.println("\nUsando entrySet():");
        for (Map.Entry<String, Double> nota : notaAlunos.entrySet()) {
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + ": " + valorNota);
        }

        // Exibindo a primeira e a última chave do TreeMap (ordem alfabética)

        System.out.println("\nA primeira chave é: " + notaAlunos.firstKey());
        System.out.println("A última chave é: " + notaAlunos.lastKey());

        // Usando métodos adicionais do TreeMap
        System.out.println("\nMétodos adicionais com a chave \"Luana\":");
        System.out.println("Chave menor que 'Luana': " + notaAlunos.lowerKey("Luana"));     // menor que
        System.out.println("Chave maior que 'Luana': " + notaAlunos.higherKey("Luana"));   // maior que
        System.out.println("Chave igual ou menor que 'Luana': " + notaAlunos.floorKey("Luana")); // igual ou menor
        System.out.println("Chave igual ou maior que 'Luana': " + notaAlunos.ceilingKey("Luana")); // igual ou maior
    }
}
