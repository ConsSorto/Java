/*
Manejo de un arbol binario, ejemplo basico de insertado y recorrido
 */
package arbolbinario;

/**
 *
 * @author Cons Sorto
 */
public class ArbolBinario {

    public static void main(String[] args) {
        NodoArbol nRaiz;
        NodoArbol nNodo1 = new NodoArbol("A");
        NodoArbol nNodo2 = new NodoArbol("B");
        NodoArbol nNodo3 = new NodoArbol("C");
        NodoArbol nNodo4 = new NodoArbol("D");
        NodoArbol nNodo5 = new NodoArbol("E");
        NodoArbol nNodo6 = new NodoArbol("F");
        NodoArbol nNodo7 = new NodoArbol("G");
        
        nRaiz = nNodo1;
        
        nRaiz.setnIzquierdo(nNodo2);
        nRaiz.setnDerecho(nNodo3);
        
        nNodo2.setnIzquierdo(nNodo4);
        nNodo2.setnDerecho(nNodo5);
        
        nNodo3.setnIzquierdo(nNodo6);
        nNodo3.setnDerecho(nNodo7);
        
        /*NodoArbol nNodo1 = new NodoArbol("F");
        NodoArbol nNodo2 = new NodoArbol("A");
        NodoArbol nNodo3 = new NodoArbol("G");
        NodoArbol nNodo4 = new NodoArbol("B");
        NodoArbol nNodo5 = new NodoArbol("D");
        NodoArbol nNodo6 = new NodoArbol("C");
        NodoArbol nNodo7 = new NodoArbol("E");
        NodoArbol nNodo8 = new NodoArbol("I");
        NodoArbol nNodo9 = new NodoArbol("H");

        nRaiz = nNodo1;

        nRaiz.setnIzquierdo(nNodo2);
        nRaiz.setnDerecho(nNodo3);

        nNodo2.setnIzquierdo(nNodo4);
        nNodo2.setnDerecho(nNodo5);

        nNodo5.setnIzquierdo(nNodo6);
        nNodo5.setnDerecho(nNodo7);

        nNodo3.setnDerecho(nNodo8);
        nNodo8.setnIzquierdo(nNodo9);*/

        System.out.println("RECORRIDO EN PREORDEN RAIZ-IZQUIERDA-DERECHA");
        RecorridoPreOrden(nRaiz);
        System.out.println(NumeroNodos(nRaiz));
        System.out.println("RECORRIDO EN ENORDEN DERECHA-RAIZ-IZQUIERDA");
        RecorridoEnOrden(nRaiz);
        System.out.println(NumeroNodos(nRaiz));
        System.out.println("RECORRIDO EN ENORDEN IZQUIERDA-DERECHA-RAIZ");
        RecorridoPostOrden(nRaiz);
        System.out.println(NumeroNodos(nRaiz));
    }

    private static void RecorridoPreOrden(NodoArbol nRaizTemp) {
        if (nRaizTemp != null) {
            System.out.println(nRaizTemp.getStrValor());
            RecorridoPreOrden(nRaizTemp.getnIzquierdo());
            RecorridoPreOrden(nRaizTemp.getnDerecho());
        }
    }

    private static void RecorridoEnOrden(NodoArbol nRaizTemp) {
        if (nRaizTemp != null) {
            RecorridoEnOrden(nRaizTemp.getnIzquierdo());
            System.out.println(nRaizTemp.getStrValor());
            RecorridoEnOrden(nRaizTemp.getnDerecho());
        }
    }

    private static void RecorridoPostOrden(NodoArbol nRaizTemp) {
        if (nRaizTemp != null) {
            RecorridoPostOrden(nRaizTemp.getnIzquierdo());
            RecorridoPostOrden(nRaizTemp.getnDerecho());
            System.out.println(nRaizTemp.getStrValor());
        }
    }

    private static int NumeroNodos(NodoArbol nRaizTemp) {
        if (nRaizTemp == null) {
            return 0;
        } else {
            return 1 + (NumeroNodos(nRaizTemp.getnIzquierdo())
                    + NumeroNodos(nRaizTemp.getnDerecho()));
        }
    }

}
