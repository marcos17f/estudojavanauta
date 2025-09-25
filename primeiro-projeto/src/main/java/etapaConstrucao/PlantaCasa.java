package etapaConstrucao;

public class PlantaCasa {
   //Atributos
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String material;
    public String cor;

    public void construir(){
        System.out.println("A casa foi contruiida e as caracteristicas sao :");
        System.out.println("Metragem:" + metragem);
        System.out.println("Numero Quartos:" + numeroQuartos);
        System.out.println("Numero Banheiros:" + numeroBanheiros);
        System.out.println("Material:" + material);
    }

    public void pintar(){
        System.out.println("A cor da casa e:" + cor);


    }
    public static void main(String[] args) {
        //Criando o objeto casa
        PlantaCasa casa = new PlantaCasa();

        //Inicializando os atributos (variaveis)(caracteristicas) casa
        casa.metragem = 70;
        casa.numeroQuartos = 3;
        casa.numeroBanheiros = 2;
        casa.material= "Tijolo";
        casa.cor = "verde agua";

        //Chamada da funçao(metodo) da ordem:
        casa.construir();


        casa.pintar();
    }
}



