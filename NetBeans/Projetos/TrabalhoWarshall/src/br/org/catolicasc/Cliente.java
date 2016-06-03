package br.org.catolicasc;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public static final String CAMINHO_ARQUIVO_LEITURA;
    public static final String CAMINHO_ARQUIVO_ESCRITURA;
    private static final int NO_INICIAL = 0;

    static {
        Paths.get(System.getProperty("user.home"), "Warshall").toFile().mkdirs();
        Path caminho = Paths.get(System.getProperty("user.home"), "Warshall", "labirinto.txt");
        CAMINHO_ARQUIVO_LEITURA = caminho.toString();
        caminho = Paths.get(System.getProperty("user.home"), "Warshall", "resultado.txt");
        CAMINHO_ARQUIVO_ESCRITURA = caminho.toString();
    }

    public static void main(String[] args) {
        boolean ma[][] = Util.stringToMatriz(recuperaArquivo());
        boolean mf[][] = new boolean[ma.length][ma[0].length];

        Warshall.fechamento(ma, mf);
        System.out.println("MA");
        Util.imprime(ma);
        System.out.println("\r\nMF");
        Util.imprime(mf);

        final int noFinal = mf[0].length - 1;
        final String resultado = mf[NO_INICIAL][noFinal] ? "\r\nO labirinto possui um caminho entre a entrada e a saida." : "\r\nO labirinto não possui um caminho entre a entrada e a saida.";
        System.out.println(resultado);
        guardaArquivo(ma, mf, resultado);
    }

    private static void guardaArquivo(boolean ma[][], boolean mf[][], String resultado) {
        List<String> lista = montaLista(ma, mf, resultado);
        try {
            Util.escreveArquivo(CAMINHO_ARQUIVO_ESCRITURA, lista);
        } catch (IOException ex) {
            System.err.printf("Erro ao gravar arquivo %s. %s", CAMINHO_ARQUIVO_LEITURA, ex.getMessage());
        }
    }

    private static List<String> montaLista(boolean[][] ma, boolean[][] mf, String resultado) {
        List<String> lista = new ArrayList<>();
        lista.add("Matriz original");
        lista.addAll(Util.matrizToString(ma));
        lista.add("\r\nMatriz resultado");
        lista.addAll(Util.matrizToString(mf));
        lista.add(resultado);
        return lista;
    }

    private static List<String> recuperaArquivo() {
        List<String> lista = null;
        try {
            lista = Util.leArquivo(CAMINHO_ARQUIVO_LEITURA);
        } catch (IOException ex) {
            System.err.printf("Erro ao ler arquivo %s. %s", CAMINHO_ARQUIVO_LEITURA, ex.getMessage());
        }
        return lista;
    }
}
