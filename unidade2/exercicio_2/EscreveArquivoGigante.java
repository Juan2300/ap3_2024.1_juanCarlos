import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class EscreveArquivoGigante {
    public static void main(String[] args) {
        String nomeDoArquivo = "livros.csv";

        String[] titulo = { "Homem de Ferro", "Capitão América", "Homem-Aranha" };
        String[] autor = { "Almeida", "Oliveira", "Martins" };

        Random random = new Random();
        boolean append = false;

        try {
            BufferedWriter arquivoCSV = new BufferedWriter(new FileWriter(nomeDoArquivo, append));
            for (long controle = 1; controle <= 9874981981L; controle++) {
                long idlivro = controle;
                String umTitulo = titulo[random.nextInt(titulo.length)];
                String umAutor = autor[random.nextInt(autor.length)];
                double preço = 10 + (568 - 10) * random.nextDouble();

                livro livro = new livro(idlivro, umTitulo, umAutor, preço);
                arquivoCSV.write(livro.toString());
                arquivoCSV.newLine();

                if (controle % 1000 == 0) {
                    System.out.println("Progresso: " + controle + " nomes escritos.");
                }
            }
            arquivoCSV.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nAcabou!");
    }
}