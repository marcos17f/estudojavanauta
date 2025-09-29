public class Array {
    public static void main(String[] args) {
        // Declaração de Arrays
        int[] numero;  // Apenas declarado, não utilizado
        String[] frutas;

        // Inicialização do array frutas
        frutas = new String[]{"banana", "manga", "morango"}; // Corrigido "banaca" para "banana"

        // Inicialização do array salarios com 5 posições
        double[] salarios = new double[5];
        salarios[3] = 500.00;
        salarios[2] = 200.00;
        salarios[1] = 600.00;
        salarios[0] = 25.00;
        salarios[4] = 100.00;

        // Iteração com for-each para imprimir os salários
        for (double salario : salarios) {
            System.out.println("O Salário: " + salario);
        }

        // Alterando o valor do salário na posição 3
        salarios[3] = 250;

        // Imprimindo o novo valor
        System.out.println("O novo salário na posição 3 é: " + salarios[3]);
    }
}
