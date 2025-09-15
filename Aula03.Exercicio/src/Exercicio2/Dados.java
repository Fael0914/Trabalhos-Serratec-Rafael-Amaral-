package Exercicio2;

public class Dados {
    private String nome;
    private double peso;
    private double altura;

    public Dados(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
