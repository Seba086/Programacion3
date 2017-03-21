/*
 * Programación III - Ejeplo de Gráfico de Linea
 */
package ProgramacionIII.ejemplos.graficos;

import ProgramacionIII.util.LineChart;

/**
 *
 * @author Mariano A. Fernandez <fernandez.mariano.a@gmail.com>
 */
public class Grafico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] p_tiempos = new int[50];
        for(int v_idx=0; v_idx<p_tiempos.length; v_idx++) {
            p_tiempos[v_idx] = (int)Math.round(Math.random()*1000);
        }
        
        LineChart demo = new LineChart("Tiempos de Ejecución", "Evolución", p_tiempos);
        demo.showChart();
    }

}
