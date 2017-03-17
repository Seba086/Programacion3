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
 * Ejemplo: calcula el factorial de un número
 *
 * @author Mariano A. Fernandez <fernandez.mariano.a@gmail.com>
 */
public class Recursion05 {

    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:S");

    public long factorial(long p_valor) {
        if (p_valor == 0) {
            return 1;
        } else {
            return p_valor * this.factorial(p_valor - 1);
        }
    }

    public void test(long p_valor) {
        Date v_start = new Date();
        System.out.println(sdf.format(v_start));

        System.out.println("Factorial de " + p_valor + "! : " + this.factorial(p_valor));

        Date v_end = new Date();
        System.out.println(sdf.format(v_end));

        System.out.println("Tiempo de Ejecución: " + (v_end.getTime() - v_start.getTime()));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Recursion05 v_rec = new Recursion05();

        long v_valor_max = 50;
        v_rec.test(Util.generarValor(v_valor_max));

        v_rec.test(Util.generarValor(v_valor_max));

        v_rec.test(Util.generarValor(v_valor_max));
    }

}
