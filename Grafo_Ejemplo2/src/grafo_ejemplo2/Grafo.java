/*
Clase para el manejo de un grafo
 */
package grafo_ejemplo2;

import listaenlazada.Lista;

/**
 *
 * @author CONS SORTO
 */
public class Grafo {
    Lista[] lGrafo;
    
    Grafo(int iTamano){
       lGrafo = new Lista[iTamano];
    }
   
    protected void MostrarGrafo() {
        for (int i = 0; i < lGrafo.length; i++) {
            if (lGrafo[i] != null) {
                System.out.println(lGrafo[i].MostrarEnlaces());
            }
        }
    }    
    
    protected int VerticesVacios() {
        int VerticesVacios;
        VerticesVacios = 0;
        
        for (Lista lVertice : lGrafo) {
            if (lVertice == null) {
                VerticesVacios++;
            }
        }
        
        return VerticesVacios;
    }    
    
    protected String InsertarVertice(String strNombreVertice) {
        if(VerticesVacios() == 0){
            return "NO HAY VERTICES VACIOS NO SE PUEDE INSERTAR";
        }
        
        Lista lVertice = new Lista(strNombreVertice);
        
        for (int i = 0; i < lGrafo.length; i++) {
            if (lGrafo[i] == null) {
                lGrafo[i] = lVertice;
                return "VERTICE INSERTADO";        
            }
        }        
        
        return "VERTICE NO INSERTADO";        
    } 
    
    protected int BuscarVertice(String strNombreVertice) {
        for (int i = 0; i < lGrafo.length; i++) {
            if (lGrafo[i] != null) {
                if (lGrafo[i].getStrNombre().equals(strNombreVertice)) {
                    return i;
                }
            }
        }
        return -1;
    }

    protected void BorrarVertice(int iIndice) {
        String strNombreVertice;
        strNombreVertice = lGrafo[iIndice].getStrNombre();
        lGrafo[iIndice] = null;
        for (Lista lVertice : lGrafo) {
            if (lVertice != null) {
                lVertice.Eliminar(strNombreVertice);
            }
        }
    }

    protected void InsertarArco(int iOrigen, int iDestino) {
        lGrafo[iOrigen].InsertarArco(lGrafo[iDestino].getStrNombre());
    } 
    
    protected void InsertarArcoPonderado(int iOrigen, int iDestino, int iPeso) {
        lGrafo[iOrigen].InsertarArcoPonderado(lGrafo[iDestino].getStrNombre(), iPeso);
    }     
    
    protected void EliminarArco(int iOrigen, String strValorBorrar) {
        lGrafo[iOrigen].Eliminar(strValorBorrar);
    }
}
