package br.org.catolicasc;

public class Warshall {

    protected static void fechamento(boolean ma[][], boolean mf[][]) {
        //Copia matriz de MA a matriz MF
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma.length; j++) {
                mf[i][j] = ma[i][j];
            }
        }

        //Aplicacao de um algoritmo de multiplicacao de matrizes
        //Este algoritmo eh o de Warshall, qu resolta na matriz de fechamento transitivo
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma.length; j++) {
                for (int k = 0; k < ma.length; k++) {
                    mf[j][k] = mf[j][k] || (mf[j][i] && mf[i][k]);
                }
            }
        }
    }

}
