/*
 * Programación III - Arbol
 */
package ProgramacionIII.util.arbol;

import java.util.List;

/**
 *
 * @author Mariano A. Fernandez <fernandez.mariano.a@gmail.com>
 */
public interface IArbol {

    public void insert(String p_valor);

    public Nodo getRoot();

    public boolean hasElem(String p_valor);

    public boolean isEmpty();

    public void delete(String p_valor);

    public int getHeight();

    public void printPosOrder();

    public void printPreOrder();

    public void printInOrder();

    public List<Nodo> getLongestBranch();

    public List<Nodo> getFrontera();

    public String getMaxElem();

    public List<Nodo> getElemAtLevel(int p_nivel);
}
