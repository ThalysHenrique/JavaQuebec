package TratamentoDeExcecoes;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada_1 {
    public static void main(String[] args) {

        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");
        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom EXCEPTION ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {
        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            bw.close();
            } catch (ImpossivelAberturaArquivoException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! " + ex.getMessage());
                ex.printStackTrace();
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaArquivoException {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAberturaArquivoException extends Exception {

    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAberturaArquivoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo: " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    public String toString() {
        return "Nome do arquivo: " + nomeDoArquivo +
                "Diretório: " + diretorio;
    }
}
