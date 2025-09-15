package Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Conta>Pessoas = new ArrayList<>();
        escolha(Pessoas);
    }
    public static int menu(){
        int opcao;
        Scanner sc = new Scanner(System.in);
            System.out.println("------------------------");
            System.out.println("1 - Cadastrar pessoa: \n" +
                               "2 - Consultar saldo: \n" +
                               "3 - Depositar: \n" +
                               "4 - Sacar: \n" +
                               "5 - Sair: \n");

            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();
        return opcao;
    }
    public static void escolha(ArrayList<Conta>p){
       int opcao;
       do{
           opcao = menu();
           switch(opcao){
               case 1:
                   cadastrarPessoa(p);
                   break;

               case 2:
                   consultaSaldo(p);
                   break;

               case 3:
                   depositar(p);
                   break;

               case 4:
                   sacar(p);
                   break;

               case 5:
                   return;
                   
               default:
                   System.out.println("Opçao invalida!");
                   break;
           }
       }while(opcao != 5);
    }
    public static void cadastrarPessoa(ArrayList<Conta>p){
        Scanner sc = new Scanner(System.in);
        String nome;
        double saldo;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite seu saldo inicial: ");
        saldo = sc.nextDouble();
        Conta pessoa = new Conta(nome,saldo);
        p.add(pessoa);
    }
    public static void consultaSaldo(ArrayList<Conta>p){
        if(p.isEmpty()){
            System.out.println("Nenhuma conta cadastrada!");
        }else {
            for (Conta c : p) {
                System.out.println(c.toString());
            }
        }
    }
    public static void depositar(ArrayList<Conta>p){
        if (p.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o indice do titular: ");
        int indice = sc.nextInt();


        if (indice >= 0 && indice < p.size()) {
            Conta c = p.get(indice);
            System.out.print("Digite o valor para depósito: ");
            double valor = sc.nextDouble();
            c.deposito(valor);
            } else
                System.out.println("Conta não encontrada.");
    }

    public static void sacar(ArrayList<Conta> p){
        if (p.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o indice do titular: ");
        int indice = sc.nextInt();

        if(indice >= 0 && indice < p.size()){
            Conta c = p.get(indice);
            System.out.print("Digite o valor para saque: ");
            double valor = sc.nextDouble();
            c.sacar(valor);
        }else{
            System.out.println("Indice invalido!");
        }
    }
}

