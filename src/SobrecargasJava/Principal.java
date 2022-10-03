// Aplicação que calcula a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio
// Usar sobrecarga

package SobrecargasJava;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Quadrado

        System.out.println("\n#### Calculadora Java ####");
        Calculadora.Calculadora(8);

        // Retângulo

        Calculadora.Calculadora(8, 10);

        // Trapézio

        Calculadora.Calculadora(12, 6, 10);

        sc.close();
    }
}
