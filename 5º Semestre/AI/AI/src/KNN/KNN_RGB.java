/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KNN;

import static com.sun.javafx.iio.ImageStorage.ImageType.RGB;
import static com.sun.javafx.iio.ios.IosImageLoader.RGB;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Administrador
 */
public class KNN_RGB {

    static class Calc {

        double resultado;
        int saida;

        public Calc(double resultado, int saida) {
            this.resultado = resultado;
            this.saida = saida;
        }

        public double getResultado() {
            return resultado;
        }

        public void setResultado(double resultado) {
            this.resultado = resultado;
        }

        public int getSaida() {
            return saida;
        }

        public void setSaida(int saida) {
            this.saida = saida;
        }

    }

    public static void main(String[] args) {
        int[][] treinamento = {
            {1, 10, 200, 1},
            {2, 20, 230, 1},
            {6, 25, 150, 1},
            {7, 45, 100, 1},
            {10, 50, 125, 1},
            {3, 24, 111, 1},
            {100, 4, 10, 2},
            {250, 7, 50, 2},
            {243, 5, 68, 2},
            {210, 2, 90, 2},
            {200, 1, 95, 2},
            {215, 0, 68, 2},
            {56, 200, 1, 3},
            {79, 234, 3, 3},
            {80, 210, 8, 3},
            {95, 200, 10, 3},
            {80, 210, 4, 3},
            {49, 207, 1, 3}};
        int[][] teste = {
            {1, 2, 100, 0},//1
            {10, 20, 30, 0},//1
            {8, 5, 20, 1},//1
            {237, 45, 100, 0},//2
            {1, 50, 101, 0},//1
            {67, 121, 12, 0}//3
        };
        List<Calc> calArray = new ArrayList<>();
        List<Integer> saidasType = new ArrayList<>();
        int K = 3;
        int tamanhoT = teste.length;
        int tamanhoTR = treinamento.length;
        double soma = 0;
        for (int linhaT = 0; linhaT < tamanhoT; linhaT++) {
            for (int linhaTR = 0; linhaTR < tamanhoTR; linhaTR++) {
                for (int colunaTR = 0; colunaTR < 3; colunaTR++) {
                    soma += Math.pow(teste[linhaT][colunaTR] - treinamento[linhaTR][colunaTR], 2);
                }
                Calc calc = new Calc(Math.sqrt((soma)), treinamento[linhaTR][3]);
//                System.out.println(Math.sqrt((soma)) + " " + treinamento[linhaTR][3]);
                calArray.add(calc);
                soma = 0;
            }

            calArray = sort(calArray);
//        for (Calc i : calArray) {
//            System.out.println(i.resultado + " " + i.saida);
//        }
            for (int i = 0; i < K; i++) {
                saidasType.add(calArray.get(i).getSaida());
            };
//        for (Integer i : saidasType) {
//            System.out.println("A: " + i);
//        }
//        System.out.println(getPopularElement(saidasType));
//            teste[linhaT][3] = getPopularElement(saidasType);
        System.out.println(getPopularElement(saidasType));
        calArray.clear();
        saidasType.clear();

        }
//        resultado.stream().forEach((in) -> {
//            System.out.println(in);

    }

    public static List<Calc> sort(List<Calc> l) {
        List<Calc> temp = new ArrayList<>(l);
        Collections.sort(temp, new Comparator<Calc>() {
            @Override
            public int compare(Calc o1, Calc o2) {
                return Double.compare(o1.getResultado(), o2.getResultado());
            }

        });

        return temp;
    }

    public static int getPopularElement(List<Integer> a) {
        HashMap<Integer, Integer> contador = new HashMap<Integer, Integer>();
        for (Integer i : a) {
            if (!contador.containsKey(i)) {
                contador.put(i, 0);
            }
        }

        for (Integer i : a) {
            Integer incrementa = contador.get(i) + 1;
            contador.put(i, incrementa);
        }

        int greater = 0;
        int clazz = 0;
        for (Integer i : contador.keySet()) {
            if (contador.get(i) > greater) {
                greater = contador.get(i);
                clazz = i;
            }
        }
        return clazz;
    }
}
