package HerancaJava;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Carro c1 = new Carro();

        System.out.println("Digite a cor do carro: ");
        c1.setCor(sc.nextLine());

        System.out.println("Digite o modelo do carro: ");
        c1.setModelo(sc.nextLine());

        System.out.println("Digite a quantidade de portas: ");
        c1.setQtdPortas(sc.nextLine());

        System.out.println("Digite a potencia do motor do carro: ");
        c1.setPotenciaMotor(sc.nextLine());

        Moto m1 = new Moto();

        System.out.println("Digite a cor da moto: ");
        m1.setCor(sc.nextLine());

        System.out.println("Digite o modelo da moto: ");
        m1.setModelo(sc.nextLine());

        System.out.println("Digite a potencia do motor da moto: ");
        m1.setPotenciaMotor(sc.nextLine());

        Caminhao cm1 = new Caminhao();

        System.out.println("Digite a cor do caminhão: ");
        cm1.setCor(sc.nextLine());

        System.out.println("Digite o modelo do caminhão: ");
        cm1.setModelo(sc.nextLine());

        System.out.println("Digite a potencia do motor do caminhão: ");
        cm1.setPotenciaMotor(sc.nextLine());

        System.out.println(c1);
        System.out.println(m1);
        System.out.println(cm1);

        c1.abrirPortaMalas();

        m1.Empinar();

        cm1.abrirCacamba();

        sc.close();
    }
}
