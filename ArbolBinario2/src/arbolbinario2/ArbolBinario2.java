/*
Clase para manejar o crear un arbol.
 */
package arbolbinario2;

/**
 *
 * @author CONS SORTO
 */
public class ArbolBinario2 {

    public static void main(String[] args) {
        NodoArbol nRaiz;

        NodoArbol nNodoA = new NodoArbol("A");

        nRaiz = nNodoA;

        NodoArbol nNodoB = new NodoArbol("B");
        NodoArbol nNodoC = new NodoArbol("C");

        nRaiz.setnHijoIzquierdo(nNodoB);
        nRaiz.setnHijoDerecho(nNodoC);

        NodoArbol nNodoD = new NodoArbol("D");
        NodoArbol nNodoE = new NodoArbol("E");

        nNodoB.setnHijoIzquierdo(nNodoD);
        nNodoB.setnHijoDerecho(nNodoE);

        NodoArbol nNodoF = new NodoArbol("F");
        NodoArbol nNodoG = new NodoArbol("G");

        nNodoC.setnHijoIzquierdo(nNodoF);
        nNodoC.setnHijoDerecho(nNodoG);

        System.out.println("Recorrido en PreOrden");
        RecorridoPreOrden(nRaiz);
        System.out.println("Recorrido en EnOrden");
        RecorridoEnOrden(nRaiz);
        System.out.println("Recorrido en PostOrden");
        RecorridoPostOrden(nRaiz);
        System.out.println("Contador Nodos");
        System.out.println("Cantidad de Nodos : " + NodosDeArbol(nRaiz));
    }

    protected static void RecorridoPreOrden(NodoArbol nRaizTemp) {
        if (nRaizTemp != null) {
            System.out.println(nRaizTemp.getStrValor());
            RecorridoPreOrden(nRaizTemp.getnHijoIzquierdo());
            RecorridoPreOrden(nRaizTemp.getnHijoDerecho());
        }
    }

    protected static void RecorridoEnOrden(NodoArbol nRaizTemp) {
        if (nRaizTemp != null) {
            RecorridoEnOrden(nRaizTemp.getnHijoIzquierdo());
            System.out.println(nRaizTemp.getStrValor());
            RecorridoEnOrden(nRaizTemp.getnHijoDerecho());
        }
    }

    protected static void RecorridoPostOrden(NodoArbol nRaizTemp) {
        if (nRaizTemp != null) {
            RecorridoPostOrden(nRaizTemp.getnHijoIzquierdo());
            RecorridoPostOrden(nRaizTemp.getnHijoDerecho());
            System.out.println(nRaizTemp.getStrValor());
        }
    }
        
    protected static int NodosDeArbol(NodoArbol nRaizTemp) {
        if (nRaizTemp == null){
            return 0;
        } else {
           return 1 + (NodosDeArbol(nRaizTemp.getnHijoIzquierdo()) 
                    + NodosDeArbol(nRaizTemp.getnHijoDerecho()));  
        }
    }
}

