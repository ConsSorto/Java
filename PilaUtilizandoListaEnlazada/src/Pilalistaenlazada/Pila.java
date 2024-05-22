/*
 * Lista para el manejo de nodos doblemente enlazados
 */
package Pilalistaenlazada;

/**
 *
 * @author CONS SORTO
 */
public class Pila {

    private Nodo nCima;

    Pila() {
        nCima = null;
    }

    protected Nodo getnCima() {
        return nCima;
    }

    protected boolean Vacia() {
        return nCima == null;
    }

    protected void InsertarPush(String strValor) {
        Nodo nNuevo = new Nodo(strValor, nCima);
        nCima = nNuevo;
    }

    protected void EliminarPop() {
        nCima = nCima.getnAbajo();
    }

    protected Nodo ExtraerCima() {
        Nodo nCimaTemp;
        nCimaTemp = nCima;
        nCima = nCima.getnAbajo();
        return nCimaTemp;
    }

    protected void MostrarPila() {
        Nodo nActual;
        nActual = nCima;

        while (nActual != null) {
            System.out.println(nActual.getStrValor());
            nActual = nActual.getnAbajo();
        }
    }
}
