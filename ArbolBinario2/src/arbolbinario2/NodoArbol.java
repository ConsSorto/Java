/*
Clase del nodoarbol, es la estructura inicial de un  arbol
 */
package arbolbinario2;

/**
 *
 * @author CONS SORTO
 */
public class NodoArbol {
    private String strValor;
    private NodoArbol nHijoIzquierdo;
    private NodoArbol nHijoDerecho;
    
    NodoArbol(String strParametro){
        strValor = strParametro;
        nHijoIzquierdo = null;
        nHijoDerecho = null;
    }

    protected String getStrValor() {
        return strValor;
    }

    protected void setStrValor(String strValor) {
        this.strValor = strValor;
    }

    protected NodoArbol getnHijoIzquierdo() {
        return nHijoIzquierdo;
    }

    protected void setnHijoIzquierdo(NodoArbol nHijoIzquierdo) {
        this.nHijoIzquierdo = nHijoIzquierdo;
    }

    protected NodoArbol getnHijoDerecho() {
        return nHijoDerecho;
    }

    protected void setnHijoDerecho(NodoArbol nHijoDerecho) {
        this.nHijoDerecho = nHijoDerecho;
    }
}
