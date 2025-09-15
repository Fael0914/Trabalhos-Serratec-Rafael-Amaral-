package Exercicios.whiles;

public class NumerosMult {
    public static void main(String[] args) {
        int num = 22, cont;
        cont = mult2(num);
        System.out.print("A quantidade de multiplos de 2 é de: " + cont);
    }

    public static int mult2(int a){
        int cont = 0;
        for(int i = a; i > 0; i--){
            if(i % 2 == 0){
                System.out.println("Java");
                cont++;
            }
        }
        return cont;
    }
}
