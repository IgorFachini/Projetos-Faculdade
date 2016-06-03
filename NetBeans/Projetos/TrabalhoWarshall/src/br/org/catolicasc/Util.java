package br.org.catolicasc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class Util {

    private Util() {
    }

    private final static String SEPARADOR = ";";

    protected static void imprime(boolean m[][]) {
        for (boolean[] m1 : m) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m1[j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("*************************************");
    }

    protected static boolean[][] stringToMatriz(List<String> linhas) {
        boolean[][] matriz = null;
        for (int i = 0; i < linhas.size(); i++) {
            String[] nos = linhas.get(i).split(SEPARADOR);
            if (matriz == null) {
                matriz = new boolean[nos.length][linhas.size()];
            }
            for (int j = 0; j < nos.length; j++) {
                matriz[j][i] = Boolean.parseBoolean(nos[j]);
            }
        }
        return matriz;
    }

    protected static List<String> matrizToString(boolean[][] matriz) {
        List<String> lista = new ArrayList<>();
        for (boolean[] array : matriz) {
            String linha = "";
            for (boolean valor : array) {
                linha = linha.concat(String.valueOf(valor))
                        .concat(SEPARADOR);
            }
            lista.add(linha);
        }
        return lista;
    }

    public static List<String> leArquivo(String fileName) throws FileNotFoundException, IOException {
        List<String> linhas = new ArrayList<>();
        try (BufferedReader leitor = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = leitor.readLine()) != null) {
                linhas.add(line);
            }
            return linhas;
        }
    }

    public static void escreveArquivo(String fileName, List<String> linhas) throws IOException {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(fileName))) {
            for (String linhaAtual : linhas) {
                out.write(linhaAtual);
                out.write("\r\n");
            }
        }
    }
}
