package FerroVelho.Dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RepositorioArquivos {
    public static Object ler(String nomeArquivo) {
        Object instancia = null;

        File arquivoEntrada = new File(nomeArquivo);
        if (!arquivoEntrada.exists()) {
            System.out.println("Não foi possível encontrar o arquivo com o nome '" + nomeArquivo + "'. Um novo arquivo será criado.");
            return instancia;
        }

        try (FileInputStream fis = new FileInputStream(arquivoEntrada);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            instancia = ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return instancia;
    }

    public static void salvar(Object instancia, String nomeArquivo) {
        if (instancia == null) {
            return;
        }
    }
}
