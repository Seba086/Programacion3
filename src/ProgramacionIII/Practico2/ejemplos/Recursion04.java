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
 * Ejemplo: Invierte los dígitos de un número.
 * 
 * @author Mariano A. Fernandez <fernandez.mariano.a@gmail.com>
 */
public class Recursion04 {

    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:S");

    public int invertir(int n, int m) {
        if (n == 0) {
            return m;
        } else {
            return invertir(n / 10, m * 10 + n % 10);
        }
    }

    public void test(int p_valor) {
        Date v_start = new Date();
        System.out.println(sdf.format(v_start));

        System.out.println("Valor a Invertir: " + p_valor);
        System.out.println("Valor Invertido: " + this.invertir(p_valor, 0));

        Date v_end = new Date();
        System.out.println(sdf.format(v_end));

        System.out.println("Tiempo de Ejecución: " + (v_end.getTime() - v_start.getTime()));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Recursion04 v_rec = new Recursion04();

        int v_valor_max = 100000000;
        v_rec.test(Util.generarValor(v_valor_max));

        v_rec.test(Util.generarValor(v_valor_max));

        v_rec.test(Util.generarValor(v_valor_max));
    }

}
