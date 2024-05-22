/*
 *Nodo de una Pila utilizando una lista enlazada
 */
package Pilalistaenlazada;

/**
 *
 * @author CONS SORTO
 */
public class Nodo {
    private String strValor;
    private Nodo nAbajo;
    
   Nodo(String strValorParametro, Nodo nAbajoParametro){
       strValor = strValorParametro;
       nAbajo = nAbajoParametro;
   }

    /**
     * @return the strValor
     */
    protected String getStrValor() {
        return strValor;
    }

    /**
     * @param strValor the strValor to set
     */
    protected void setStrValor(String strValor) {
        this.strValor = strValor;
    }

    /**
     * @return the nAbajo
     */
    protected Nodo getnAbajo() {
        return nAbajo;
    }

    /**
     * @param nAbajo the nAbajo to set
     */
    protected void setnAbajo(Nodo nAbajo) {
        this.nAbajo = nAbajo;
    }


}
