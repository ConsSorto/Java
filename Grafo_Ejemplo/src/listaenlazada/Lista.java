/* Lista y operaciones
 */
package listaenlazada;

/**
 *
 * @author CONS SORTO
 */
public class Lista {

    String strNombre;
    Nodo nInicio;
    Nodo nFin;

    public Lista(String strParametro) {
        strNombre = strParametro;
        nInicio = null;
        nFin = null;
    }
    
    public String getStrNombre() {
        return strNombre;
    }

    public void Insertar(String strParametro) {
        Nodo nNodoNuevo = new Nodo(strParametro, null);

        if (nInicio == null) {
            nFin = nNodoNuevo;
            nInicio = nFin;
        } else {
            nFin.setnSiguiente(nNodoNuevo);
            nFin = nNodoNuevo;
        }
    }

    protected String MostrarLista() {
        String strNodos;
        Nodo nActual = nInicio;
        strNodos = "";

        while (nActual != null) {

            if (strNodos.equals("")) {
                strNodos = nActual.getStrValor();
            } else {
                strNodos = strNodos + ", " + nActual.getStrValor();
            }

            nActual = nActual.getnSiguiente();
        }

        return strNodos;
    }

    public String MostratInformacionVertice () {
        return "Vertice : " + getStrNombre() + " Arcos hacia : " +  MostrarLista();
    }
}

