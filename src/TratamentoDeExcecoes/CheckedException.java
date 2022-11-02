package TratamentoDeExcecoes;

import javax.swing.*;
import java.io.*;

// Imprimir Arquivo no Console

public class CheckedException {
    public static void main(String[] args) throws IOException {

        try {
            String nomeDoArquivo = "bootcamp.txt";
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "\nRevise o nome do arquivo que você deseja imprimir!" + e.getCause());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "\nOcorreu um erro inesperado! Entre em contato com o suporte!" + e.getCause());
        } finally {
            System.out.println("\nChegou no finally!");
        }

        System.out.println("\nIndependente da EXCEPTION ou não, o programa continua...");

    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException { //throws IOException
        File file = new File(nomeDoArquivo);


        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        bw.close();
    }
}

