/*
 *Nodo de una lista doblemente enlazada
 */
package listaenlazadadoble;

/**
 *
 * @author CONS SORTO
 */
public class Nodo {
    private String strValor;
    private Nodo nSiguiente;
    private Nodo nAnterior; 
    
   Nodo(String strValorParametro, Nodo nAnteriorParametro, Nodo nSiguienteParametro){
       strValor = strValorParametro;
       nAnterior = nAnteriorParametro;
       nSiguiente = nSiguienteParametro;
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
     * @return the nSiguiente
     */
    protected Nodo getnSiguiente() {
        return nSiguiente;
    }

    /**
     * @param nSiguiente the nSiguiente to set
     */
    protected void setnSiguiente(Nodo nSiguiente) {
        this.nSiguiente = nSiguiente;
    }

    /**
     * @return the nAnterior
     */
    protected Nodo getnAnterior() {
        return nAnterior;
    }

    /**
     * @param nAnterior the nAnterior to set
     */
    protected void setnAnterior(Nodo nAnterior) {
        this.nAnterior = nAnterior;
    }
    
}
