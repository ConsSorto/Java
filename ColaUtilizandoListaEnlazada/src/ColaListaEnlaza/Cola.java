/* Cola y operaciones
 */
package ColaListaEnlaza;

/**
 *
 * @author CONS SORTO
 */
public class Cola {

    Nodo nFrente;
    Nodo nFin;

    Cola() {
        nFrente = null;
        nFin = null;
    }

    public String ValorFin() {
        if (!Vacia()) {
            return nFin.getStrValor();
        } else {
            return "La cola esta vacia no hay valor de Fin";
        }
    }

    public String ValorFrente() {
        if (!Vacia()) {
            return nFrente.getStrValor();
        } else {
            return "La cola esta vacia no hay valor de Frente";
        }
    }

    public Nodo getnFrente() {
        return nFrente;
    }

    protected void Insertar(String strParametro) {
        Nodo nNodoNuevo = new Nodo(strParametro);
        if (Vacia()) {
            nFrente = nNodoNuevo;
        } else {
            nFin.setnSiguiente(nNodoNuevo);
        }
        nFin = nNodoNuevo;
    }

    protected void Eliminar() {
        if (!Vacia()) {
            nFrente = nFrente.getnSiguiente();
        }
    }

    protected void Eliminar2() {
        if (!Vacia()) {
            if (nFin == nFrente) {
                nFin = nFrente = null;
            } else {
                nFrente = nFrente.getnSiguiente();
            }
        }
    }

    protected String ExtraerElemento() {
        Nodo nTemp;
        if (!Vacia()) {
            nTemp = nFrente;
            nFrente = nFrente = nFrente.getnSiguiente();
            return nTemp.getStrValor();
        } else {
            return "NO HAY ELEMETOS";
        }
    }

    // Recorrer Cola
    protected void MostrarCola() {
        Nodo nActual = nFrente;
        while (nActual != null) {
            System.out.println(nActual.getStrValor());
            nActual = nActual.getnSiguiente();
        }
    }

    protected boolean Vacia() {
        return nFrente == null;
    }

}
