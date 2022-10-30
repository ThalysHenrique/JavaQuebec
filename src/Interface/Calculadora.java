package Interface;

public class Calculadora extends OperacaoMatematica{

    public void soma(double num1, double num2){
        System.out.println("Soma: " + num1 + num2);
    }

    public void subtracao(double num1, double num2){
        System.out.println("Subtração: " + (num1 - num2));
    }

    public void multiplicacao(double num1, double num2){
        System.out.println("Multiplicação: " + num1 * num2);
    }

    public void divisao(double num1, double num2){
        System.out.println("Divisão: " + num1 / num2);
    }
}
