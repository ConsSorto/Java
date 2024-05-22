/*
 Clase para la creacion de una arbol binario de busqueda.
 */
package arbolbb;

/**
 *
 * @author CONS SORTO
 */
public class ArbolBinBusq {
    NodoArbol nRaiz;

    public ArbolBinBusq() {
      nRaiz = null;
    }
    
    protected void InsertarNodo(int iDato) {
        NodoArbol nNuevo = new NodoArbol(iDato);

        if (Vacio()) {
            nRaiz = nNuevo;
        } else {
            NodoArbol nTemp = nRaiz;
            NodoArbol nPadre;
            while (true) {
                nPadre = nTemp;
                if (iDato < nTemp.getiValor()) {
                    nTemp = nTemp.getnIzquierdo();
                    if (nTemp == null) {
                        nPadre.setnIzquierdo(nNuevo);
                        return;
                    }
                } else {
                    nTemp = nTemp.getnDerecho();
                    if (nTemp == null) {
                        nPadre.setnDerecho(nNuevo);
                        return;
                    }
                }
            }
        }
    }

    protected boolean Vacio(){
      return nRaiz == null;
    }
    
    protected void RecorridoPreOrden(NodoArbol nRaizTemp) {
        if (nRaizTemp != null) {
            System.out.println(nRaizTemp.getiValor());
            RecorridoPreOrden(nRaizTemp.getnIzquierdo());
            RecorridoPreOrden(nRaizTemp.getnDerecho());
        }
    }

    protected void RecorridoEnOrden(NodoArbol nRaizTemp) {
        if (nRaizTemp != null) {
            RecorridoEnOrden(nRaizTemp.getnIzquierdo());
            System.out.println(nRaizTemp.getiValor());
            RecorridoEnOrden(nRaizTemp.getnDerecho());
        }
    }

    protected void RecorridoPostOrden(NodoArbol nRaizTemp) {
        if (nRaizTemp != null) {
            RecorridoPostOrden(nRaizTemp.getnIzquierdo());
            RecorridoPostOrden(nRaizTemp.getnDerecho());
            System.out.println(nRaizTemp.getiValor());
        }
    }
    
    protected NodoArbol BuscarNodo(int iDato) {
        NodoArbol nActual = nRaiz;

        if (Vacio()) {
            return null;
        }

        while (nActual.getiValor() != iDato) {
            if (iDato < nActual.getiValor()) {
                nActual = nActual.getnIzquierdo();
            } else {
                nActual = nActual.getnDerecho();
            }

            if (nActual == null) {
                return null;
            }
        }

        return nActual;
    }

}
