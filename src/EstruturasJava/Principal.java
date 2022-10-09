package EstruturasJava;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Combustivel c = new Combustivel(4.89, 5.00);


        sc.close();
    }
}
