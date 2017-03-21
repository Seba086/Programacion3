/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionIII.Practico2.ejemplos;

import ProgramacionIII.util.LineChart;
import ProgramacionIII.util.Util;

/**
 *
 * @author mfernandez
 */
public class Recursion06 extends Recursion02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Recursion06 v_rec = new Recursion06();
        int v_valor_max = 100;
        int[] v_resultados = new int[v_valor_max];
        // generador de casos
        for(int v_idxCaso = 0; v_idxCaso < 100; v_idxCaso++) {
            v_resultados[v_idxCaso] = v_rec.suma(Util.generarValor(v_valor_max), Util.generarValor(v_valor_max));
        }
        
        //graficamos los resultados
        LineChart v_grafico = new LineChart("Tiempos de Ejecución", "Evolución", v_resultados);
        v_grafico.showChart();
    }
    
}
