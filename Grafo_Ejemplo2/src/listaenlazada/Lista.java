/* Lista y operaciones, 
    esta lista sera utilizada para representar los vertices y sus arcos.
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
        nInicio = null;
        nFin = null;
        strNombre = strParametro;
    }
    
    public String getStrNombre() {
        return strNombre;
    }
    
       
   /// MISMA FUNCION INSERTAR NODO AL FINAL DE UNA LISTA    
    public void InsertarArco(String strParametro) {
        Nodo nNodoNuevo = new Nodo(strParametro, null, 1);

        if (nInicio == null) {
            nFin = nNodoNuevo;
            nInicio = nFin;
        } else {
            nFin.setnSiguiente(nNodoNuevo);
            nFin = nNodoNuevo;
        }
    }

    /// MISMA FUNCION INSERTAR NODO AL FINAL DE UNA LISTA
    public void InsertarArcoPonderado(String strParametro, int iParametro) {
        Nodo nNodoNuevo = new Nodo(strParametro, null, iParametro);

        if (nInicio == null) {
            nFin = nNodoNuevo;
            nInicio = nFin;
        } else {
            nFin.setnSiguiente(nNodoNuevo);
            nFin = nNodoNuevo;
        }
    }

    public String MostrarEnlaces() {
        Nodo nActual = nInicio;
        String strNodos = "";
        
        while (nActual != null) {
            if (strNodos.equals("")){
                strNodos = "V : " + nActual.getStrValor() + " P : " + nActual.getiPeso();
            } else {
                strNodos = strNodos + ", V : " + nActual.getStrValor() + " P : "
                    + nActual.getiPeso();
            }
            
            nActual = nActual.getnSiguiente();
        }
        
        return "Vertice :" + getStrNombre() + " tiene los siguientes arcos : " + strNodos;
    }

    protected boolean Vacia() {
        return nInicio == null && nFin == null;
    }
    
    public boolean Eliminar(String strValorBuscado) {
        Nodo nAnterior, nActual;

        if (Vacia()){
            return false;
        }
        
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
    

}

