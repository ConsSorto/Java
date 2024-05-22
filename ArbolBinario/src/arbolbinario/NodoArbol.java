/*
Nodo de un Arbol binario
 */
package arbolbinario;

/**
 *
 * @author Cons Sorto
 */
public class NodoArbol {
    private String strValor;
    private NodoArbol nIzquierdo;
    private NodoArbol nDerecho;

    public NodoArbol(String strParametro) {
      strValor = strParametro;
      nIzquierdo = null;
      nDerecho = null;
    }
    
    protected String getStrValor() {
        return strValor;
    }

    protected void setStrValor(String strValor) {
        this.strValor = strValor;
    }

    protected NodoArbol getnIzquierdo() {
        return nIzquierdo;
    }

    protected void setnIzquierdo(NodoArbol nIzquierdo) {
        this.nIzquierdo = nIzquierdo;
    }

    protected NodoArbol getnDerecho() {
        return nDerecho;
    }

    protected void setnDerecho(NodoArbol nDerecho) {
        this.nDerecho = nDerecho;
    }
    
}
