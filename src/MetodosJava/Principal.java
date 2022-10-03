package MetodosJava;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Classe Calculadora

        System.out.println("\n#### MetodosJava.Calculadora Java ####>");
        Calculadora.soma(7, 6);
        Calculadora.subtracao(100, 50);
        Calculadora.multiplicacao(7, 7);
        Calculadora.divisao(1000, 20);

        // Classe Mensagem

        System.out.println("\n#### Mensageiro Java ####");
        Mensagem.msg(7);
        Mensagem.msg(14);
        Mensagem.msg(21);

        // Classe Emprestimo

        System.out.println("\n#### MetodosJava.Emprestimo - Banco Java ####");

        Emprestimo.calcular(2500, 2);
        Emprestimo.calcular(8000, 3);

        sc.close();
    }
}
