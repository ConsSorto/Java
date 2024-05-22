/*Clase nodo que sera utilizada en la lista */
package listaenlazada;

/**
 *
 * @author CONS SORTO
 */
public class Nodo {
    private String strValor;  /// VALOR DEL NODO
    private Nodo nSiguiente;  // REFERENCIA O ENLACE
    
    Nodo(String strParametro, Nodo nParametro){
      strValor = strParametro;
      nSiguiente = nParametro;
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
