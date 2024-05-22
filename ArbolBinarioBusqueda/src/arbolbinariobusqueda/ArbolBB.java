/*
Clase para un arbol binario de busqueda
 */
package arbolbinariobusqueda;

/**
 *
 * @author CONS SORTO
 */
public class ArbolBB {
    NodoArbol nRaiz;
   
    public ArbolBB() {
        nRaiz = null;
    }
    
    protected boolean Vacio(){
         return nRaiz == null;     
    }
    
    protected void InsertarNodo(int iValor) {
        NodoArbol nNuevo = new NodoArbol(iValor);

        if (Vacio()) {
            nRaiz = nNuevo;
        } else {
            NodoArbol nTemp;
            NodoArbol nPadre;

            nTemp = nRaiz;

            while (true) {
                nPadre = nTemp;

                if (iValor < nTemp.getiDato()) {
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
    
    protected void RecorridoPreOrden(NodoArbol nRaizTemp) {
        if (nRaizTemp != null) {
            System.out.println(nRaizTemp.getiDato());
            RecorridoPreOrden(nRaizTemp.getnIzquierdo());
            RecorridoPreOrden(nRaizTemp.getnDerecho());
        }
    }

    protected void RecorridoEnOrden(NodoArbol nRaizTemp) {
        if (nRaizTemp != null) {
            RecorridoEnOrden(nRaizTemp.getnIzquierdo());
            System.out.println(nRaizTemp.getiDato());
            RecorridoEnOrden(nRaizTemp.getnDerecho());
        }
    }

    protected void RecorridoPostOrden(NodoArbol nRaizTemp) {
        if (nRaizTemp != null) {
            RecorridoPostOrden(nRaizTemp.getnIzquierdo());
            RecorridoPostOrden(nRaizTemp.getnDerecho());
            System.out.println(nRaizTemp.getiDato());
        }
    }
    
    protected NodoArbol BuscarNodo(int iValorBuscado){
        NodoArbol nActual;
        
        if (Vacio()){
            return null;
        }
        
        nActual = nRaiz;
        
        while(nActual.getiDato() != iValorBuscado){
            if (iValorBuscado < nActual.getiDato()){
                nActual = nActual.getnIzquierdo();
            } else {
                nActual = nActual.getnDerecho();
            }
            
            if (nActual == null){
                return null;
            }
                
        }
        
        return nActual;
    
    }
    
    protected boolean EliminarNodo(int iValorEliminar) {
        NodoArbol nActual;
        NodoArbol nPadre;
        boolean bEsHijoIzquierdo = false;

        nActual = nPadre = nRaiz;

        // BUSCANDO EL NODO
        while (nActual.getiDato() != iValorEliminar) {
            nPadre = nActual;
            if (iValorEliminar < nActual.getiDato()) {
                bEsHijoIzquierdo = true;
                nActual = nActual.getnIzquierdo();
            } else {
                bEsHijoIzquierdo = false;
                nActual = nActual.getnDerecho();
            }

            if (nActual == null) {
                return false;
            }
        }

        //FIN DE LA BUSQUEDA
        if (nActual.getnIzquierdo() == null && nActual.getnDerecho() == null) {
            if (nActual == nRaiz) {
                nRaiz = null;
            } else if (bEsHijoIzquierdo) {
                nPadre.setnIzquierdo(null);
            } else {
                nPadre.setnDerecho(null);
            }
        } else if (nActual.getnDerecho() == null) {
            if (nActual == nRaiz) {
                nRaiz = nActual.getnIzquierdo();
            } else if (bEsHijoIzquierdo) {
                nPadre.setnIzquierdo(nActual.getnIzquierdo());
            } else {
                nPadre.setnDerecho(nActual.getnIzquierdo());
            }
        } else if (nActual.getnIzquierdo() == null) {
            if (nActual == nRaiz) {
                nRaiz = nActual.getnDerecho();
            } else if (bEsHijoIzquierdo) {
                nPadre.setnIzquierdo(nActual.getnDerecho());
            } else {
                nPadre.setnDerecho(nActual.getnDerecho());
            }
        } else {
            NodoArbol nRemplazo;
            nRemplazo = NodoRemplazo(nActual);

            if (nActual == nRaiz) {
                nRaiz = nRemplazo;
            } else if (bEsHijoIzquierdo) {
                nPadre.setnIzquierdo(nRemplazo);
            } else {
                nPadre.setnDerecho(nRemplazo);
            }
            nRemplazo.setnIzquierdo(nActual.getnIzquierdo());
        }

        return true;
    }
    
    protected NodoArbol NodoRemplazo(NodoArbol nRemplazar){
        NodoArbol nPadreRemp;
        NodoArbol nRemp;
        NodoArbol nTemp;
        
        nPadreRemp = nRemp = nRemplazar;
        
        nTemp = nRemplazar.getnDerecho();
        
        while(nTemp != null){
            nPadreRemp = nRemp;
            nRemp = nTemp;
            nTemp = nTemp.getnIzquierdo();
        }
        
        if (nRemp != nRemp.getnDerecho()){
            nPadreRemp.setnIzquierdo(nRemp.getnDerecho());
            nRemp.setnDerecho(nRemplazar.getnDerecho());
        }
        
        return nRemp;
    
    }
}    
