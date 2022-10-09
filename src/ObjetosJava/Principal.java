package ObjetosJava;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Carro car = new Carro();

        System.out.println("Digite a cor do carro: ");
        car.setCor(sc.next());

        System.out.println("Digite o modelo do carro: ");
        car.setModelo(sc.next());

        System.out.println("Digite a quantidade atual de combustível no tanque do carro: ");
        car.setTanqueAtual(sc.nextDouble());

        System.out.println("Digite a capacidade máxima do tanque do carro: ");
        car.setCapacidadeTanque(sc.nextDouble());

        System.out.println("Digite o preço do combustível: ");
        car.setPrecoCombustivel(sc.nextDouble());

        System.out.println(car);

        car.EncherTanque();

        sc.close();
    }
}
