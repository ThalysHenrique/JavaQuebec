public class Emprestimo {
    public static int DuasParcelas(){
        return 2;
    }
    public static int TresParcelas(){
        return 3;
    }
    public static double TaxaDuasParcelas(){
        return 1.2;
    }
    public static double TaxaTresParcelas(){
        return 1.6;
    }

    public static void calcular(double valor, int parcelas){
        if (parcelas == 2){
            double valorFinal = valor + (valor * TaxaDuasParcelas());

            System.out.println("Valor final do emprestimo para 2 parcelas: R$" + valorFinal);
        } else if (parcelas == 3){
            double valorFinal = valor + (valor * TaxaTresParcelas());

            System.out.println("Valor final do emprestimo para 3 parcelas: R$" + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas inválidas.");
        }
    }
}
