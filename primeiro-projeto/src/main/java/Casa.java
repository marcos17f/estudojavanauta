import etapaConstrucao.PlantaCasa;

public class Casa {
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
