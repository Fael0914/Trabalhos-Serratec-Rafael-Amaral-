package Exercicio2;

public class CalculoInss {
    public static void main(String[] args) {
        String nome;
        double salario = 2794, salarioLiquido;
        salarioLiquido = calculaInss(salario);
        System.out.println(salarioLiquido);
    }
    public static double calculaInss(double a){
        if(a < 1518.01)
            return a ;
        else if (a < 2793.89) {
            return a -= a * 0.09;
        } else if (a < 4190.84) {
            return a -= a * 0.12;
        }    else if (a < 8157.42){
                return a -= a * 0.14;
            }else return a;

        }
    }

