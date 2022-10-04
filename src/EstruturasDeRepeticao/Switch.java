package EstruturasDeRepeticao;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sigla = "A";

        // Switch Case
        switch (sigla){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default:{
                System.out.println("Indefinido");
            }
        }
        sc.close();
    }
}
