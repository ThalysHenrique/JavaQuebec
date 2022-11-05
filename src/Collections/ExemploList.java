package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione 7 notas: ");

        List<Double> notas = new ArrayList<>();
        notas.add(1.1);
        notas.add(2.2);
        notas.add(3.3);
        notas.add(4.4);
        notas.add(5.5);
        notas.add(6.6);
        notas.add(7.7);
        System.out.println(notas.toString());

        System.out.println("Posição da nota 5: " + notas.indexOf(5.5));

        System.out.println("Adicione na lista a nota 8.0 na posição 4");
        notas.add(4, 8.0);

        System.out.println(notas);

        System.out.println("Substitua a nota 5.5 por 9.9");
        notas.set(5, 9.9);

        System.out.println(notas);

        System.out.println("A nota 5.5 está na lista? ");
        System.out.println(notas.contains(5.5));

        System.out.println("Todas as notas na ordem em que foram informadas");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Teceira nota adicionada: " + notas.get(2));
        System.out.println("Menor nota: " + Collections.min(notas));
        System.out.println("Maior nota: " + Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média das notas: " + (soma/notas.size()));
        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova os números menores que 7 e exiba a lista! ");
        Iterator<Double> iteratorRemove = notas.iterator();
        while(iteratorRemove.hasNext()) {
            Double next = iteratorRemove.next();
            if(next <= 7.7) {
                iteratorRemove.remove();
            }

            System.out.println(notas);

            System.out.println("Apagando toda a lista...");
            notas.clear();

            System.out.println(notas);

            System.out.println("Lista está vazia? " + notas.isEmpty());
        }
    }
}