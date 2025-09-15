package Exercicios.whiles;

public class NumerosCont {
    public static void main(String[] args) {
        int num1 = 30, numPar, numImpar;
        numPar = contPar(num1);
        numImpar = contImpar(num1);
        System.out.printf("A quantidade de numeros pares é de %d\n ", numPar);
        System.out.printf("A quantidade de numeros impares é de %d\n ", numImpar);
    }

    public static int contImpar(int i) {
        int cont = 0;
        for(int a = i; a > 0; a--){
            if (a % 2 != 0)
                cont++;
        }
        return cont;
    }

    public static int contPar(int i) {
        int cont = 0;
        for(int a = i; a > 0; a--){
            if (a % 2 == 0)
                cont++;
        }
        return cont;
    }
}
