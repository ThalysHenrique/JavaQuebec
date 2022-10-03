package MetodosJava;

public class Mensagem {
    public static void msg(int msg){
        if(msg >= 1 && msg <= 11){
            System.out.println("Bom dia");
        } else if (msg >= 12 && msg <= 17){
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }
}