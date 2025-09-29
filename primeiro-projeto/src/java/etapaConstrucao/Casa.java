package etapaConstrucao;

import etapaConstrucao.PlantaCasa;

public class Casa {
    // Método principal que será executado ao rodar o programa
    public static void main(String[] args) {
        // Criação de um objeto do tipo PlantaCasa
        PlantaCasa casa = new PlantaCasa();

        // Inicialização dos atributos do objeto casa
        casa.metragem = 70;               // Define metragem como 70 m²
        casa.numeroQuartos = 3;           // Define 3 quartos
        casa.numeroBanheiros = 2;         // Define 2 banheiros
        casa.material = "Tijolo";         // Define o material como Tijolo
        casa.cor = "verde água";          // Define a cor da casa

        // Chama o método construir para exibir as características da casa
        casa.construir();

        // Chama o método pintar para exibir a cor da casa
        casa.pintar();
    }
}