package polimorfismo;

public class Principal {
    public static void main(String[] args) {

        //Polimorfismo de sobrecarga

        
        int sabaoPo = 12;
        int mamao = 5;
        double arroz = 5.90;
        double carne = 26.70;
        Integer batata = 12;
        Integer cenoura = 7;
        Integer melancia = 15;

        int total = Calculadora.somar(sabaoPo,mamao);
        double totalDouble = Calculadora.somar(arroz,carne);
        Integer totalInterger = Calculadora.somar(batata,cenoura,melancia);

        System.out.println("A compra deu R$:"+ total +" Reais ");
        System.out.println("A compra deu R$:"+ totalDouble +" Reais ");
        System.out.println("A compra deu R$:" + totalInterger +" Reais ");
    }
}
