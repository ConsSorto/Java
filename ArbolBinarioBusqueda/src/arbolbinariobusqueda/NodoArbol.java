/*
Este clase es para los nodos del arbol
 */
package arbolbinariobusqueda;

/**
 *
 * @author CONS SORTO 156431346531345132
 */
public class NodoArbol {

    int iDato;
    NodoArbol nIzquierdo;
    NodoArbol nDerecho;

    public NodoArbol(int iValorNodo) {
        iDato = iValorNodo;
        nIzquierdo = null;
        nDerecho = null;
    }

    protected int getiDato() {
        return iDato;
    }

    protected void setiDato(int iDato) {
        this.iDato = iDato;
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
