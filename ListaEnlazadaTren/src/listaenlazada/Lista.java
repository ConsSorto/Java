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

    protected void EliminarInicio() {
        nInicio = nInicio.getnSiguiente();
    }

    protected String SacarInicio() {
        String strValor;

        strValor = nInicio.getStrValor();
        nInicio = nInicio.getnSiguiente();

        if (nInicio == null) {
            nFin = null;
        }

        return strValor;
    }
    // Recorrer Lista

    protected void MostrarLista() {
        Nodo nActual = nInicio;

        while (nActual != null) {
            System.out.println(nActual.getStrValor());
            nActual = nActual.getnSiguiente();
        }
    }

    protected boolean Vacia() {
        if (nInicio == null && nFin == null) {
            return true;
        } else {
            return false;
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

    protected boolean EliminarNodo(String strValorBuscado) {
        Nodo nAnterior, nActual;

        if (nInicio.getStrValor().equals(strValorBuscado)){
            nInicio = nInicio.getnSiguiente();
            if (nInicio == null){
              nFin = null;
            }
            return true;
        }
        
        nAnterior = nInicio;
        nActual = nInicio.getnSiguiente();
        
        while (nActual != null) {
            if (nActual.getStrValor().equals(strValorBuscado)){
              nAnterior.setnSiguiente(nActual.getnSiguiente());
              
              if (nActual.getnSiguiente() == null){
                nFin = nAnterior;
              }
            }
            nAnterior = nActual;
            nActual = nActual.getnSiguiente();
        }
        
        return false;
    }

    protected void InsertarDespuesNodo(Nodo nAnterior, String strNuevoValor) {
        Nodo nNuevo = new Nodo(strNuevoValor, nAnterior.getnSiguiente());
        nAnterior.setnSiguiente(nNuevo);
    }
}

