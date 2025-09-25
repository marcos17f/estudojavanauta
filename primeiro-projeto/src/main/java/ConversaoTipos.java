public class ConversaoTipos {
    public static void main(String[] args) {

        // Conversão implícita (int → double)
        int numero = 40;
        double d = numero;

        // Conversão explícita (double → int), perde a parte decimal
        double d2 = 10.5;
        int num2 = (int) d2;

        // Integer → String
        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();

        // String → Integer
        String numeroString2 = "1234";
        Integer numeroConvertido = Integer.parseInt(numeroString2);

        // Exibindo os resultados
        System.out.println("double d (de int 40): " + d);
        System.out.println("int num2 (de double 10.5): " + num2);
        System.out.println("Integer e String: " + numeroInteger + " / " + numeroString);
        System.out.println("String \"1234\" convertida para Integer: " + numeroConvertido);
    }
}
