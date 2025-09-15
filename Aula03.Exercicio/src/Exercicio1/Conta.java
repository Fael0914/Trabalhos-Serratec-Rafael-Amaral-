package Exercicio1;

public class Conta {
    private String nome;
    private double saldo;
    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }
    public void deposito(double valor){
        if(valor < 0){
            System.out.println("Valor inválido para deposito");
        }else{
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente!");
        }else {
            saldo -= valor;
            System.out.println("Saque efetuado!");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }
}
