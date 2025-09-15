package Exercicio5;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String telefone = JOptionPane.showInputDialog("Digite seu telefone:");
        String email = JOptionPane.showInputDialog("Digite seu email:");

        String salarioStr = JOptionPane.showInputDialog("Digite seu salário:");
        double salario = Double.parseDouble(salarioStr);

        double salarioComAumento = salario * 1.10;

        String mensagem = "Nome: " + nome +
                "\nTelefone: " + telefone +
                "\nEmail: " + email +
                "\nSalário (com 10% de acréscimo): R$ " + String.format("%.2f", salarioComAumento);

        JOptionPane.showMessageDialog(null, mensagem, "Dados Cadastrados", JOptionPane.INFORMATION_MESSAGE);
    }
}
