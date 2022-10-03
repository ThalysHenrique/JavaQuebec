package SobrecargasJava;

public class Calculadora {

    // Sobrecargas de métodos (Calculadora = cada método recebe parâmetros diferentes)
    public static void Calculadora(int comprimento){
        int area = comprimento * comprimento;

        System.out.println("Área do quadrado: " + area);
    }
    public static void Calculadora(int base, int altura){
        int area = base * altura;

        System.out.println("Área do retângulo: "+ area);
    }
    public static void Calculadora(int altura, int base, int Base){
        int area = (altura * (base + Base)) / 2;

        System.out.println("Área do trapézio: " + area);
    }
}
