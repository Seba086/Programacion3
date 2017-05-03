/*
 * Programación III - TPE
 */
package ProgramacionIII.TPE;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * Ejemplo de cómo leer un archivo CSV
 * 
 * @author Mariano A. Fernandez <fernandez.mariano.a@gmail.com>
 */
public class CSVReader {

    public static void main(String[] args) {
        String csvFile = "[PATH-AL-ARCHIVO]/dataset.csv";
        String line = "";
        String cvsSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] items = line.split(cvsSplitBy);

                // ---------------------------------------------
                // Poner el código para cargar los datos
                // ---------------------------------------------

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
