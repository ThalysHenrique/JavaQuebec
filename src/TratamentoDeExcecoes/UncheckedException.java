package TratamentoDeExcecoes;

import javax.swing.*;

// Uncheked Exception

public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try {
                float resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.printf("\nResultado: %.2f", resultado);
                continueLooping = false;
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "\nNão é possível dividir por 0 " + e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "\nEntrada inválida " + e.getMessage());
            } finally {
                System.out.println("\nChegou no finally!");
            }
        } while(continueLooping);

        System.out.println("\ncontinua...");
    }

    private static float dividir(float a, float b) {
        return a / b;
    }
}
