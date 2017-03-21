/*
 * Programación III - Ejemplo Recursión
 */
package ProgramacionIII.Practico2.ejemplos;

import ProgramacionIII.util.Util;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * Ejemplo: Suma dos números enteros de forma recursiva.
 * 
 * @author Mariano A. Fernandez <fernandez.mariano.a@gmail.com>
 */
public class Recursion02 {

    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:S");
    
    /**
     * Realiza la suma de dos números de forma recursiva.
     * 
     * @param a
     * @param b
     * @return a + b
     */
     public int suma(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else {
            return 1 + suma(a, b - 1);
        }
     }
     
     public void test(int a, int b) {
         Date v_start = new Date();
        System.out.println(sdf.format(v_start));
        
        System.out.println(a + " + " + b + " = " +this.suma(a, b));
        
        Date v_end = new Date();
        System.out.println(sdf.format(v_end));
        
        System.out.println("Tiempo de Ejecución: " + (v_end.getTime() - v_start.getTime()));
     }
     
    /**
     * arguments
     */
    public static void main(String[] args) {
       
        Recursion02 v_rec = new Recursion02();
        int v_valor_max = 1000;
        v_rec.test(Util.generarValor(v_valor_max), Util.generarValor(v_valor_max));
        
        v_rec.test(Util.generarValor(v_valor_max), Util.generarValor(v_valor_max));
        
        v_rec.test(Util.generarValor(v_valor_max), Util.generarValor(v_valor_max));
    }
    
}
