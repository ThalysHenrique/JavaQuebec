package Collections;

import java.util.*;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class ExerciseList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        List<String> resposts = new ArrayList<>();

        System.out.println("--- Answers ---");
        System.out.println("\nDid you call the victim? ");
        String respost = sc.next();
        resposts.add(respost.toLowerCase());
        System.out.println("Were you at the crime scene? ");
        respost = sc.next();
        resposts.add(respost.toLowerCase());
        System.out.println("Do you live close to the victim? ");
        respost = sc.next();
        resposts.add(respost.toLowerCase());
        System.out.println("Owed to victim? ");
        respost = sc.next();
        resposts.add(respost.toLowerCase());
        System.out.println("Did you work with the victim? ");
        respost = sc.next();
        resposts.add(respost.toLowerCase());

        System.out.println(resposts);

        int count = 0;
        Iterator<String> counts = resposts.iterator();
        while (counts.hasNext()){
            String resp = counts.next();
            if (resp.contains("yes")) {
                count++;
            }
        }

        switch (count) {
            case 2:
                System.out.println("-- Suspect -- "); break;
            case 3:
            case 4:
                System.out.println("-- Accomplice --"); break;
            case 5:
                System.out.println("-- Matador --"); break;
            default:
                System.out.println("-- Innocent --");
        }

        sc.close();
    }
}
