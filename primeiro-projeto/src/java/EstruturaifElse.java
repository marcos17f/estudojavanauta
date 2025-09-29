public class EstruturaifElse {
    public static void main(String[] args) {

        int idade = 18;

        if (idade >= 18) {
            System.out.println("Voce e maior de idade");
        } else {
            System.out.println("Voce e menor de idade");
        }

        String resultado = (idade >=18)? "voce tem 18 anos e maior de idade":" e menor de idade";

        System.out.println(resultado);

        boolean temDinheiro = true;

        String mensagem = (temDinheiro) ? "pedi um ifood" : "Come o que tem em casa";



        System.out.println(mensagem);

        boolean estaChovendo = true;

        if (!estaChovendo) {
            System.out.println("Vamos sair pra passear");
        } else {
            System.out.println("Ficar em casa");




        }


    }
}

