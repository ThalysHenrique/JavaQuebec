package TratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Tratamento de Exceções Try e Catch
        // Try -->> Analisa o bloco de código para ver se ocorre algum erro durante a execução
        // Catch -->> Define um bloco de código, caso ocorra algum erro (exemplo: informar sobre um erro ao usuário de forma que ele possa compreender)
        // InputMismatchException -->> erro de código -->> passa ao usuário -->> "Blocos idade e altura precisam ser numéricos"
        try{
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.next();

            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();

            System.out.println("Nome: " + nome + ", sobrenome: " + sobrenome + ", idade: " + idade + ", altura: " + altura);

            sc.close();
        } catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
