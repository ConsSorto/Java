/* Lista y operaciones
 */
package listaenlazada;

/**
 *
 * @author CONS SORTO
 */
public class Lista {

    Nodo nInicio;
    Nodo nFin;

    Lista() {
        nInicio = null;
        nFin = null;
    }

    protected Nodo getnInicio() {
        return nInicio;
    }

    protected Nodo getnFin() {
        return nFin;
    }
   
    protected boolean Vacia() {
        return nInicio == null && nFin == null;
    }

    protected void InsertarInicio(String strParametro) {
        Nodo nNodoNuevo = new Nodo(strParametro, nInicio);

        nInicio = nNodoNuevo;

        if (nFin == null) {
            nFin = nInicio;
        }
    }
    
    protected void InsertarFinal(String strParametro) {
        Nodo nNodoNuevo = new Nodo(strParametro, null);

        if (nInicio == null) {
            nFin = nNodoNuevo;
            nInicio = nFin;
        } else {
            nFin.setnSiguiente(nNodoNuevo);
            nFin = nNodoNuevo;
        }
    }

    protected Nodo BuscarNodo(String strValorBuscado) {
        boolean bEncontrado;
        Nodo nActual = nInicio;

        bEncontrado = false;

        while (nActual != null && !bEncontrado) {
            if (nActual.getStrValor().equals(strValorBuscado)) {
                bEncontrado = true;
            } else {
                nActual = nActual.getnSiguiente();
            }
        }

        if (bEncontrado) {
            return nActual;
        } else {
            return null;
        }
    }

    protected void InsertarDespuesNodo(Nodo nAnterior, String strNuevoValor) {
        Nodo nNuevo = new Nodo(strNuevoValor, nAnterior.getnSiguiente());
        nAnterior.setnSiguiente(nNuevo);
        
        if (nNuevo.getnSiguiente() == null){
            nFin = nNuevo;
        }
    }
    
    protected void InsertarEnOrden(String strParametro) {

        if (Vacia()) {
            InsertarInicio(strParametro);
            return;
        }
        
        if (Integer.parseInt(nInicio.getStrValor()) > Integer.parseInt(strParametro)) {
            InsertarInicio(strParametro);
            return;
        }

        if (Integer.parseInt(nFin.getStrValor()) < Integer.parseInt(strParametro)) {
            InsertarFinal(strParametro);
            return;
        } 
        
        Nodo nActual, nAnterior;
               
        nAnterior = nInicio;
        nActual = nInicio.getnSiguiente();

        while (nActual != null) {
                if (Integer.parseInt(nActual.getStrValor()) > Integer.parseInt(strParametro)) {
                    InsertarDespuesNodo(nAnterior, strParametro);
                    return;
                } else {
                    nAnterior = nActual;
                    nActual = nActual.getnSiguiente();
                }
        }
    }

    protected void MostrarLista() {
        Nodo nActual = nInicio;

        while (nActual != null) {
            System.out.println(nActual.getStrValor());
            nActual = nActual.getnSiguiente();
        }
    }
}

