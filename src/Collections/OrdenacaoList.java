package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>() {{
            add(new Gato("Poseidon", 12, "azul"));
            add(new Gato("Atenas", 14, "branca"));
            add(new Gato("Perseu", 8, "preto"));
            add(new Gato("Zeus", 10, "grisalho"));
            add(new Gato("Atenas", 16, "branca com laranjado"));
        }};
        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(gatos);

        System.out.println("--\tOrdem aleatória\t--");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("--\tOrdem natural (nome)\t--");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("--\tOrdem idade\t--");
        Collections.sort(gatos, new ComparatorIdade());
        // gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("--\tOrdem cor\t--");
        Collections.sort(gatos, new ComparatorCor());
        System.out.println(gatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t--");
        Collections.sort(gatos, new ComparatorNomeCorIdade());
        System.out.println(gatos);
    }
}

    class Gato implements Comparable<Gato> {

        private String nome;
        private int idade;
        private String cor;

        public Gato(String nome, int idade, String cor) {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public String getCor() {
            return cor;
        }

        public String toString() {
            return " nome: " + getNome() +
                    " idade: " + getIdade() +
                    " cor: " + getCor();
        }

        @Override
        public int compareTo(Gato gato) {
            return this.getNome().compareToIgnoreCase(gato.getNome());
        }
    }

class ComparatorIdade implements Comparator<Gato> {
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}