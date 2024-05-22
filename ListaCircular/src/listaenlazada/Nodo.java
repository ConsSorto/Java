/*Clase nodo que sera utilizada en la lista circular */
package listaenlazada;

/**
 *
 * @author CONS SORTO
 */
public class Nodo {
    private String strValor;  
    private Nodo nSiguiente;
    
    Nodo(String strParametro){
      strValor = strParametro;
      nSiguiente = this;
    }

    protected String getStrValor() {
        return strValor;
    }

    protected void setStrValor(String strValor) {
        this.strValor = strValor;
    }

    protected Nodo getnSiguiente() {
        return nSiguiente;
    }

    protected void setnSiguiente(Nodo nSiguiente) {
        this.nSiguiente = nSiguiente;
    }
   
}
