/*
 * Programación III - Ejemplo Recursión
 */
package ProgramacionIII.Practico2.ejemplos;

import ProgramacionIII.util.LineChart;
import ProgramacionIII.util.Util;

/**
 *
 * @author Mariano A. Fernandez <fernandez.mariano.a@gmail.com>
 */
public class Recursion07 extends Recursion02 {

    public static void main(String[] args) {
        // TODO code application logic here

        Recursion06 v_rec = new Recursion06();
        int v_cant_casos = 100;
        int v_valor_max1 = 1000;
        int v_valor_max2 = 10000;
        int v_cant_series = 2;
        int[][] v_resultados = new int[v_cant_series][v_cant_casos];
        // generador de casos
        for (int v_idxCaso = 0; v_idxCaso < 100; v_idxCaso++) {
            v_resultados[0][v_idxCaso] = v_rec.suma(Util.generarValor(0, v_valor_max1), Util.generarValor(0, v_valor_max1));

            v_resultados[1][v_idxCaso] = v_rec.suma(Util.generarValor(v_valor_max1, v_valor_max2), Util.generarValor(v_valor_max1, v_valor_max2));
        }

        //graficamos los resultados
        LineChart v_grafico = new LineChart("Tiempos de Ejecución", "Evolución", v_resultados);
        v_grafico.showChart();
    }

}
