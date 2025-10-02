package abstracao;

public class Principal {
    public static void main(String[] args) {
        Funcionarios marcos = new Funcionarios("Av Dr Raimundo santos ","Bom Jesus","1080","Piuai",
                "64900-000","Marcos Felipe","04519247821","TI");
        Cliente irislene = new Cliente("Teofilio","SP","","SP","64900000","Irislene","464611616151");


        System.out.println(marcos);
        System.out.println(irislene);
    }
}
