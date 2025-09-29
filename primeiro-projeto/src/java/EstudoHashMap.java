// Importa as classes necessárias para usar HashMap e Map.Entry
import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {
    public static void main(String[] args) {

        // Criação de um HashMap que armazena nomes de alunos (String) e suas notas (Double)
        HashMap<String, Double> notaAlunos = new HashMap<>();

        // Adicionando pares chave-valor no HashMap
        notaAlunos.put("Marcos", 7.5);
        notaAlunos.put("Lucas", 9.5);
        notaAlunos.put("Andre", 5.5);
        notaAlunos.put("Karine", 10.0);

        // Percorrendo o HashMap usando apenas as chaves (keySet)
        // Para cada nome (chave), obtemos a nota correspondente e imprimimos
        for (String nome : notaAlunos.keySet()) {
            double nota = notaAlunos.get(nome);
            System.out.println(nome + ": " + nota);
        }

        // Outra forma de percorrer o HashMap, agora usando Map.Entry (acesso direto à chave e valor)
        for (Map.Entry<String, Double> nota : notaAlunos.entrySet()) {
            String nome = nota.getKey();          // Obtém a chave (nome)
            double valorNota = nota.getValue();   // Obtém o valor (nota)
            System.out.println(nome + ": " + valorNota);
        }

        // Acessa diretamente a nota do aluno "Marcos"
        double nota = notaAlunos.get("Marcos");
        System.out.println("A nota de Marcos é: " + nota);

        // Obtém o tamanho do HashMap (quantos elementos ele possui)
        int tamanhoHash = notaAlunos.size();

        // Remove o aluno "Andre" do HashMap
        notaAlunos.remove("Andre");

        // Imprime o tamanho do HashMap ANTES da remoção
        System.out.println(tamanhoHash);

        // OBS: Aqui o tamanho impresso é o original, pois foi salvo antes da remoção.
        // Se quiser imprimir o tamanho atualizado, use: System.out.println(notaAlunos.size());
    }
}
