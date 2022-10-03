package RetornosJava;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n#### Calculadora Java ####");
        int areaQuadrado = Calculadora.Calculadora(8);
        System.out.println("Área do quadrado: " + areaQuadrado);

        int areaRetangulo = Calculadora.Calculadora(10, 8);
        System.out.println("Área do retângulo: " + areaRetangulo);

        int areaTrapezio = Calculadora.Calculadora(8, 12, 14);
        System.out.println("Área do trapézio: " + areaTrapezio);
        sc.close();
    }
}
