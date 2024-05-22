/* Lista y operaciones 
 */
package listaenlazada;

/**
 *
 * @author CONS SORTO
 */
public class Lista {

    Nodo nAcceso;

    Lista() {
        nAcceso = null;
    }

  
    public Nodo getnAcceso() {
        return nAcceso;
    }
    
    protected void Insertar(String strParametro) {
        Nodo nNuevo = new Nodo(strParametro);
        if (nAcceso != null) 
        {
            nNuevo.setnSiguiente(nAcceso.getnSiguiente());
            nAcceso.setnSiguiente(nNuevo);
        }
        nAcceso = nNuevo;
    }
  
    protected void MostrarLista() {
        Nodo nActual;
        nActual = nAcceso;
        
        while (nActual != null) {
            System.out.println(nActual.getStrValor());
            if (nActual.getnSiguiente() == nAcceso){
                nActual = null;
            } else {
                nActual = nActual.getnSiguiente();
            }
        } 
    }

    protected void Eliminar(String strParametro){
        Nodo nActual;
        boolean bEncontrado = false;

        nActual = nAcceso;
        while ((nActual.getnSiguiente() != nAcceso) && (!bEncontrado)) {
            bEncontrado = (nActual.getnSiguiente().getStrValor().equals(strParametro));
            if (!bEncontrado) {
                nActual = nActual.getnSiguiente();
            }
        }

        bEncontrado = (nActual.getnSiguiente().getStrValor().equals(strParametro));
 
        if (bEncontrado) {
            Nodo nEliminar;
            nEliminar = nActual.getnSiguiente(); 
            if (nAcceso == nAcceso.getnSiguiente()) 
            {
                nAcceso = null;
            } else {
                if (nEliminar == nAcceso) {
                    nAcceso = nActual; 
                }
                nActual.setnSiguiente(nEliminar.getnSiguiente());
            }            
        }
    }
            
    
    protected boolean Vacia() {
        return nAcceso == null;
    }


}

