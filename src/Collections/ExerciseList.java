package Collections;

import java.util.*;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExerciseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        List<Double> temperatures = new ArrayList<Double>();

        // add temperatures in list
        int count = 0;
        while (true) {
            if (count == 6) break;

            System.out.println("Enter the temperature: ");
            double temp = sc.nextDouble();
            temperatures.add(temp);
            count++;
        }

        System.out.println("########################################################");
        System.out.println("--- Average temperature of the mounths in 2022 year ---");


        // Show all the temperatures
        System.out.println("All the temperatures: ");
        temperatures.forEach(t -> System.out.println(t + " "));

        // Sum the temperatures above average
        double average = temperatures.stream()
                        .mapToDouble(Double::doubleValue)
                                .average()
                                        .orElse(0d);
        System.out.printf("\nAverage of temperatures: %.1f\n", average);

        // Show temperatures above average
        System.out.println("Temperatures above average: ");
        temperatures.stream()
                        .filter(t -> t > average)
                                .forEach(t -> System.out.printf("%.1f ", t));

        // Show the mounth of temperatures above average for extense
        System.out.println("\nMounths of temperatures above average: ");
        Iterator<Double> iterator = temperatures.iterator();

        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > average) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - January: %.1f\n", temp);
                        break;
                    case (1):
                        System.out.printf("2 - February: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - March: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - April: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - May: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - June: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Don't have temperature above average.");
                }
            }
            count++;
        }


        sc.close();
    }
}