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
 * Ejemplo: Suma los dígitos de un número
 * 
 * @author Mariano A. Fernandez <fernandez.mariano.a@gmail.com>
 */
public class Recursion03 {

    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:S");
    
    public int sumar_dig(int n) {
        if (n < 10) {         //caso base
            return n;
        } else {
            return (n % 10) + sumar_dig(n / 10);
        }
    }
    
    public void test(int p_valor) {
         Date v_start = new Date();
        System.out.println(sdf.format(v_start));
        
        System.out.println("Valor: " + p_valor);
        System.out.println("Suma de los Dígitos: " + this.sumar_dig(p_valor));
        
        Date v_end = new Date();
        System.out.println(sdf.format(v_end));
        
        System.out.println("Tiempo de Ejecución: " + (v_end.getTime() - v_start.getTime()));
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Recursion03 v_rec = new Recursion03();
        
        v_rec.test(Util.generarValor(1000000));
        
        v_rec.test(Util.generarValor(1000000));
        
        v_rec.test(Util.generarValor(1000000));
    }

}
