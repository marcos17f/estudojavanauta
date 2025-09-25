import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int numero = 1;

//        while (numero <= 10 ){
//            System.out.println(" Numero: " + numero);
//            numero --;

//        do {
//            System.out.println("Numero do While " + numero);
//            numero++;
//        } while (numero <= 10) ;

//        for(int numero = 1;numero <=10;numero++){
//            System.out.println("Numero: " + numero);


            System.out.println("Digite o numero para ver a tabuada");
            int numero = scanner.nextInt();

        System.out.println("\nTabuada do " + numero + " e :\n ");

            for (int i = 1;i <= 10;i++){
                int resultado = numero *i;

                System.out.println(numero + " x " + i + " = " + resultado);

        }
        scanner.close();
    }
}


