/*Clase nodo que sera utilizada en la Cola utilizando una lista enlazada */
package ColaListaEnlaza;

/**
 *
 * @author CONS SORTO
 */
public class Nodo {
    private String strValor;  /// VALOR DEL NODO
    private Nodo nSiguiente;  // REFERENCIA O ENLACE
    
    Nodo(String strParametro){
      strValor = strParametro;
      nSiguiente = null;
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
