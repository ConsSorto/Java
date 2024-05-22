/*
 * Lista para el manejo de nodos doblemente enlazados
 */
package listaenlazadadoble;

/**
 *
 * @author CONS SORTO
 */
public class Lista {
    private Nodo nInicio;
    private Nodo nFin;
    
    Lista(){
      nInicio = null;
      nFin = null;
    }
    
    public Nodo getnInicio() {
        return nInicio;
    }

    public Nodo getnFin() {
        return nFin;
    }
    
    protected void InsertarInicio(String strParametro){
        if(nInicio == null){
            nInicio = new Nodo(strParametro, null, null);
            nFin = nInicio;
        }else{
            Nodo nNuevoNodo = new Nodo(strParametro, null, nInicio);
            nInicio.setnAnterior(nNuevoNodo);
            nInicio = nNuevoNodo;
        }
    }

    protected void InsertarFin(String strParametro){
        if(nInicio == null){
            nFin = new Nodo(strParametro, null, null);
            nInicio = nFin;
        }else{
            Nodo nNuevoNodo = new Nodo(strParametro, nFin, null);
            nFin.setnSiguiente(nNuevoNodo);
            nFin = nNuevoNodo;
        }
    }    
    
    protected String SacarInicio(){
        String strValorNodo = nInicio.getStrValor();
        nInicio = nInicio.getnSiguiente();
        if (nInicio != null){
            nInicio.setnAnterior(null);
        }else{
            nFin = null;
        }
        
        return strValorNodo;
    }
    
    protected String SacarFin(){
        String strValorNodo = nFin.getStrValor();
        nFin = nFin.getnAnterior();
        if (nFin != null){
            nFin.setnSiguiente(null);
        }else{
            nInicio = null;
        }
        
        return strValorNodo;
    } 
    
    protected void MostrarInicioFin(){
        Nodo nActual;
        nActual = nInicio;
        
        while(nActual != null){
            System.out.println(nActual.getStrValor());
            nActual = nActual.getnSiguiente();
        }
    }
    
    protected void MostrarFinInicio(){
        Nodo nActual;
        nActual = nFin;
        
        while(nActual != null){
            System.out.println(nActual.getStrValor());
            nActual = nActual.getnAnterior();
        }
    }    
    
    protected boolean BuscarNodo(String strParametro){
        Nodo nActual;
        nActual = nFin;
        
        while(nActual != null){
            if ((nActual.getStrValor().equals(strParametro))){
                return true;
            }
            nActual = nActual.getnAnterior();
        }
        
        return false;
    }     
}
