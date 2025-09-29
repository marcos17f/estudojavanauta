// Define o pacote onde essa classe está localizada
package etapaConstrucao;

// Declara a classe PlantaCasa
public class PlantaCasa implements Construcao {

    // Atributos da casa (características)
    public int metragem;            // Tamanho da casa em metros quadrados
    public int numeroQuartos;       // Quantidade de quartos
    public int numeroBanheiros;     // Quantidade de banheiros
    public String material;         // Material de construção (ex: Tijolo, Madeira)
    public String cor;              // Cor da casa



    // Método para simular a construção da casa
    @Override
    public void construir() {
        System.out.println("A casa foi construída e as características são:");
        System.out.println("Metragem: " + metragem + " m²");                // Exibe a metragem
        System.out.println("Número de Quartos: " + numeroQuartos);         // Exibe o número de quartos
        System.out.println("Número de Banheiros: " + numeroBanheiros);     // Exibe o número de banheiros
        System.out.println("Material: " + material);                       // Exibe o material
    }

    @Override
    public void pintar(String cor) {
        System.out.println("Pintando a casa com a cor " + cor);
    }

    @Override
    public int calcularCustoConstruçao(int custoPorMetro) {
        return metragem + custoPorMetro;
    }

    public void construir2() {
        System.out.println("A casa do vizinho e as características são:");
        System.out.println("Metragem: " + metragem + " m²");                // Exibe a metragem
        System.out.println("Número de Quartos: " + numeroQuartos);         // Exibe o número de quartos
        System.out.println("Número de Banheiros: " + numeroBanheiros);     // Exibe o número de banheiros
        System.out.println("Material: " + material);                       // Exibe o material
    }

    // Método para simular a pintura da casa
    public void pintar() {

        System.out.println("A casa foi pintada:  " + cor); // Exibe a cor definida
    }

    public void  mudarCorParede(String novaCor){
        cor=novaCor;
        pintar();
    }

    public int somarMetragem(){
        return metragem * numeroBanheiros + numeroQuartos;
    }

    public void alterarCaracteristicas  (int metros,int quartos,int banheiros,String mate){

        metragem = metros ;
        numeroQuartos = quartos ;
        numeroBanheiros = banheiros ;
        material = mate;
        construir();

    }

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

        casa.mudarCorParede("Preto");

        casa.alterarCaracteristicas(100,4,2,"janela");

        int resultado = casa.somarMetragem();

        System.out.println(resultado);

        PlantaCasa casaViziho = new PlantaCasa();
        casaViziho.metragem = 120;               // Define metragem como 70 m²
        casaViziho.numeroQuartos = 4;           // Define 3 quartos
        casaViziho.numeroBanheiros = 3;         // Define 2 banheiros
        casaViziho.material = "Telhas";         // Define o material como Tijolo
        casaViziho.cor = "Marron bombom";


        casaViziho.construir2();


        casaViziho.pintar();



    }
}

