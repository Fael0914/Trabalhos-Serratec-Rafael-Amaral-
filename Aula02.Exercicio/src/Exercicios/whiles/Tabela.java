package Exercicios.whiles;

public class Tabela {
    public static void main(String[] args) {
        int numero = 2;
        tabuada(numero);
    }
    public static void tabuada(int a){
        for(int i = 1 ; i < 11; i ++){
            System.out.println(a + " X " + i + " = " + a * i);
        }
    }
}
