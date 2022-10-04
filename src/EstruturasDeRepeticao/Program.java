package EstruturasDeRepeticao;

public class Program {
    public static void main(String[] args) {
        int num = 7;
        int num2 = 3;
        String sigla = "A";

        // Condição ternária (otimizando if e else)
        String resultado = num >= 6 && num2 == 3 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}