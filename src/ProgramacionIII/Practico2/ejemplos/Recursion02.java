/*
 * Programación III - Ejemplo Recursión
 */
package ProgramacionIII.Practico2.ejemplos;

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
     private int suma(int a, int b) {
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
      * Genera un valor aleatorio
      * @return valor entero
      */
     public int generarValor() {
         return (int)(Math.random()*1000);
     }
     
    /**
     * arguments
     */
    public static void main(String[] args) {
       
        Recursion02 v_rec = new Recursion02();
        
        v_rec.test(v_rec.generarValor(), v_rec.generarValor());
        
        v_rec.test(v_rec.generarValor(), v_rec.generarValor());
        
        v_rec.test(v_rec.generarValor(), v_rec.generarValor());
    }
    
}
