/*Clase nodo que sera utilizada en la lista */
package listaenlazada;

/**
 *
 * @author CONS SORTO
 */
public class Nodo {
    private int iPeso; // PESO DEL ENLACE
    private String strValor;  /// VALOR DEL NODO
    private Nodo nSiguiente;  // REFERENCIA O ENLACE
    
    Nodo(String strParametro, Nodo nParametro, int iParametro){
      strValor = strParametro;
      nSiguiente = nParametro;
      iPeso = iParametro;
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

    public int getiPeso() {
        return iPeso;
    }

    public void setiPeso(int iPeso) {
        this.iPeso = iPeso;
    }
}
