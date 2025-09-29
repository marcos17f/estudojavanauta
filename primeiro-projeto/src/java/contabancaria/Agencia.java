package contabancaria;

public class Agencia {
    public static void main(String[] args) {

        ContaBancaria minhaConta = new ContaBancaria("Marcos ", 500);

        minhaConta.setTitular("Marcos Felipe");
        minhaConta.setSaldo((minhaConta.getSaldo())+ 550);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println( "O titular da conta e: " +titularConta+ "  E o saldo: " +saldoFinal);

        ContaBancaria contaMinhaMae = new ContaBancaria("irislene" ,500000 );


        System.out.println("O titular da conta e: "+ contaMinhaMae.getTitular()+ " E o saldo final e: " + contaMinhaMae.getSaldo())   ;
    }
}
