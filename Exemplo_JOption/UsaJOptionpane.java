package Exemplo_JOption;

import javax.swing.*;

public class UsaJOptionpane {
    public static void main(String[] args) {
        // Entrada de login
        String s = JOptionPane.showInputDialog(
                null,
                "Digite seu login",
                "Login no sistema",
                JOptionPane.QUESTION_MESSAGE
        );

        if (s == null) return;

        // Confirmação de login
        if (JOptionPane.showConfirmDialog(
                null,
                "Confirma login?",
                "Caixa de confirmação",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
        ) == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(
                    null,
                    s,
                    "Login confirmado",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    s,
                    "Login NÃO CONFIRMADO",
                    JOptionPane.WARNING_MESSAGE
            );
        }

        // Escolha de login padrão
        String[] nomes = {"Joao", "Maria", "Pedro", "Janaina"};
        int resp = JOptionPane.showOptionDialog(
                null,
                "Escolha um login padrão",
                "Login no sistema",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                nomes,
                nomes[1]
        );

        if (resp == 1) {
            JOptionPane.showMessageDialog(
                    null,
                    "Login " + s + " inválido !!!",
                    "Login confirmado",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}