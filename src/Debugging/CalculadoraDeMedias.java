package Debugging;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String[] alunos = {"Thalys", "James", "Tyler", "Johnson"};

        float media = calculaMediaDaTurma(alunos, sc);

        System.out.printf("Média da turma: %f", media);
    }

    public static int calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        int soma = 0;

        for(String aluno : alunos) {
            System.out.printf("Nota do aluno: %s", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
