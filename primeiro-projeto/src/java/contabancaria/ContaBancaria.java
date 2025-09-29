package contabancaria;

public class ContaBancaria {
    // Atributos privados (encapsulamento)
    private String titular; // nome do dono da conta
    private double saldo;   // valor disponível na conta

    // ====== Getters e Setters ======

    // Método para obter o titular
    public String getTitular() {
        return titular;
    }

    // Método para modificar o titular
    public void setTitular(String Titular) {
        this.titular = Titular; // "this.titular" é o atributo, "Titular" é o parâmetro
    }

    // Método para obter o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para modificar o saldo
    public void setSaldo(double saldo) { // "saldo" é o parâmetro recebido
        this.saldo = saldo;              // "this.saldo" é o atributo da classe
    }

    // ====== Construtores ======

    // Construtor com 2 atributos (titular e saldo inicial)
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Construtor sem atributos (padrão)
    public ContaBancaria() {
    }

    // Construtor apenas com saldo
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    // Construtor apenas com titular (saldo inicia em 0)
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0;
    }
}
