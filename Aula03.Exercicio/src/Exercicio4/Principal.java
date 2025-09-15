package Exercicio4;

public class Principal {
    public static void main(String[] args) {
        int fatorial, result;
        for(fatorial = 1; fatorial < 11; fatorial++){
            result = fatorial(fatorial);
            System.out.printf("O fatorial de %d é: %d\n", fatorial, result);
        }
    }

    public static int fatorial(int n){
        int aux = 1;
        for(int i = n; i > 0; i--){
            aux *= i;
        }
        return aux;
    }
}
