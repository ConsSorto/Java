/*
Nodo de arbol binario de busqueda.
 */
package arbolbb;

/**
 *
 * @author CONS SORTO
 */
public class NodoArbol {
    private int iValor;
    private NodoArbol nIzquierdo;
    private NodoArbol nDerecho;

    public NodoArbol(int iDato) {
        iValor = iDato;
        nIzquierdo = null;
        nDerecho = null;
    }
    
    protected int getiValor() {
        return iValor;
    }

    protected void setiValor(int iValor) {
        this.iValor = iValor;
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
