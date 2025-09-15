package Exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Dados>p = new ArrayList<>();
        cadastrar(p);
        cadastrar(p);
        cadastrar(p);
        cadastrar(p);

        String maiorAltura = maiorAltura(p);
        System.out.println(maiorAltura);

        String maiorPeso = maiorPeso(p);
        System.out.println(maiorPeso);

        double media1 = mediaAltura(p);
        System.out.print("A media das alturas é de: " + media1);

        double media2 = mediaPeso(p);
        System.out.print("\nA media dos pesos é de: " + media2);

    }

    public static void cadastrar(ArrayList<Dados>p){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();
        Dados d = new Dados(nome, peso, altura);
        p.add(d);
    }

    public static String maiorPeso(ArrayList<Dados>p){
        Dados maior = p.get(0);
        for(Dados d : p){
            if(d.getPeso() > maior.getPeso()){
                maior = d;
            }
        }
        return "O maior peso é de " + maior.getNome() + " (" + maior.getPeso() + " kg)";
    }

    public static String maiorAltura(ArrayList<Dados>p){
        Dados maior = p.get(0);
        for(Dados d : p){
            if(d.getAltura() > maior.getAltura()){
                maior = d;
            }
        }
        return "A maior altura é de " + maior.getNome() + " (" + maior.getAltura() + " cm)";
    }

    public static double mediaPeso(ArrayList<Dados>p){
        double media = 0;
        for(Dados dados : p){
            media += dados.getPeso();
        }
        return media / 4;
    }

    public static double mediaAltura(ArrayList<Dados>p){
        double media = 0;
        for(Dados dados : p){
            media += dados.getAltura();
        }
        return media / 4;
    }

}
