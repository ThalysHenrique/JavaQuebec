package Desafios_DIO.Zero;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;
        int num1 = num;

// TODO: Implemente uma condição onde seja possível reduzir o número até 0:

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
                step++;
            } else {
                num--;
                step++;
            }
        }

        if (step > 0) {
            System.out.println(step);
        } else {
            System.out.println(step);
        }
    }
}