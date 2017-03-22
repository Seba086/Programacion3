package ProgramacionIII.util;

/**
 *
 * @author mfernandez
 */
public class Util {
    /**
      * Genera un valor aleatorio
      * @return valor entero
      */
     public static long generarValor(long p_valor_maximo) {
         return (long)(Math.random()*p_valor_maximo);
     }
     
     public static int generarValor(int p_valor_maximo) {
         return (int)(Math.random()*p_valor_maximo);
     }
     
     public static int generarValor(int p_valor_minimo, int p_valor_maximo) {
         return p_valor_minimo + (int)(Math.random()*(p_valor_maximo - p_valor_minimo));
     }
}
