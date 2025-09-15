package Exercicio1;

public class situacaoAluno {
    public static void main(String[] args) {
        double nota1 = 10, nota2 = 10, media;
        media = calculaMedia(nota1,nota2);
        if(media == 10)
            System.out.println("Aprovado Parabéns!");
        else if (media >= 7) {
            System.out.println("Aprovado");
        }else
            System.out.println("Reprovado");
    }

    public static double calculaMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }
}
