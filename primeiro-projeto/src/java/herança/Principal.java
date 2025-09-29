package herança;

public class Principal {
    public static void main(String[] args) {


        Cachorro amora = new Cachorro();
        amora.latir();
        amora.comer("Raçao");
        amora.beberAgua();
        amora.dormi();


        Galinha gertrudez = new Galinha();
        gertrudez.ciscar();
        gertrudez.comer("Milho");
        gertrudez.beberAgua();
        gertrudez.dormi();

    }
}
