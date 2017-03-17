/*
 * Programación III - Ejemplo Recursión
 */
package ProgramacionIII.Practico2.ejemplos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Ejemplo: Sumar un array de enteros de forma recursiva
 * 
 * @author Mariano A. Fernandez <fernandez.mariano.a@gmail.com>
 */
public class Recursion {

    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:S");
     
    public void sumar(int[] p_valores) {
        System.out.println("Total: " + this.sumar(p_valores, 0));
    } 
    
    public long sumar(int[] p_valores, int p_idx) {
        if (p_idx < p_valores.length) {
            return p_valores[p_idx] + sumar(p_valores, p_idx+1);
        }
        return 0;
    }
    
    public void cargarValores(int[] p_valores, int p_max_valor) {
        for(int i=0; i<p_valores.length; i++) {
            p_valores[i] = (int)Math.round(Math.random() * p_max_valor);
        }
    }
    
    public void test(int p_size) {
        Date v_start = new Date();
        System.out.println(sdf.format(v_start));
        
        int[] v_valores = new int[p_size];
        this.cargarValores(v_valores, p_size);
        
        this.sumar(v_valores);
        
        Date v_end = new Date();
        System.out.println(sdf.format(v_end));
        
        System.out.println("Tiempo de Ejecución: " + (v_end.getTime() - v_start.getTime()));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Recursion v_rec = new Recursion();
        
        System.out.println("Test 1: 100");
        
        v_rec.test(100);
        
        System.out.println("Test 1: 1000");
        v_rec.test(1000);
        
        System.out.println("Test 1: 5000");
        v_rec.test(5000);
        
    }
    
}
