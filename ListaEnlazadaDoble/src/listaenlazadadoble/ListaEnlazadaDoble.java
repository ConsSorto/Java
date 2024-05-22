/*
 *manejo de una lista doblemente enlazada
 */
package listaenlazadadoble;

/**
 *
 * @author CONS SORTO
 */
public class ListaEnlazadaDoble {

    public static void main(String[] args) {
        Lista lLista = new Lista();
        
        if (lLista.getnInicio() == null){
            System.out.println("No hay Inicio");
        } else {
            System.out.println("Valor nodo inicio :" + lLista.getnInicio().getStrValor());
        }
        System.out.println("-------------------------------------------------");
        if (lLista.getnFin() == null){
            System.out.println("No hay Fin");
        } else {
            System.out.println("Valor nodo Fin :" + lLista.getnFin().getStrValor());
        }

        lLista.InsertarInicio("1");
        lLista.InsertarInicio("0");
        lLista.InsertarFin("2");
        lLista.InsertarFin("3");
        
        System.out.println("-------------------------------------------------");
        lLista.MostrarInicioFin();
        System.out.println("-------------------------------------------------");
        lLista.MostrarFinInicio();
        System.out.println("-------------------------------------------------");
        if (lLista.getnInicio() == null){
            System.out.println("No hay Inicio");
        } else {
            System.out.println("Valor nodo inicio :" + lLista.getnInicio().getStrValor());
        }
        System.out.println("-------------------------------------------------");
        if (lLista.getnFin() == null){
            System.out.println("No hay Fin");
        } else {
            System.out.println("Valor nodo Fin :" + lLista.getnFin().getStrValor());
        }

        System.out.println("----------------Sacando Inicio-----------------");
        lLista.SacarInicio();
        
        System.out.println("-------------------------------------------------");
        lLista.MostrarInicioFin();
        System.out.println("-------------------------------------------------");
        lLista.MostrarFinInicio();
        System.out.println("-------------------------------------------------");
        if (lLista.getnInicio() == null){
            System.out.println("No hay Inicio");
        } else {
            System.out.println("Valor nodo inicio :" + lLista.getnInicio().getStrValor());
        }
        System.out.println("-------------------------------------------------");
        if (lLista.getnFin() == null){
            System.out.println("No hay Fin");
        } else {
            System.out.println("Valor nodo Fin :" + lLista.getnFin().getStrValor());
        }

        System.out.println("----------------Sacando Fin-----------------");
        
        lLista.SacarFin();
        
        System.out.println("-------------------------------------------------");
        lLista.MostrarInicioFin();
        System.out.println("-------------------------------------------------");
        lLista.MostrarFinInicio();
        System.out.println("-------------------------------------------------");
        if (lLista.getnInicio() == null){
            System.out.println("No hay Inicio");
        } else {
            System.out.println("Valor nodo inicio :" + lLista.getnInicio().getStrValor());
        }
        System.out.println("-------------------------------------------------");
        if (lLista.getnFin() == null){
            System.out.println("No hay Fin");
        } else {
            System.out.println("Valor nodo Fin :" + lLista.getnFin().getStrValor());
        }        
        
        System.out.println("-------------------------------------------------");        
        System.out.println("------Buscando nodo con valor 4-----");
        if (lLista.BuscarNodo("4")){
            System.out.println("Nodo Encontrado");
        } else {
            System.out.println("No existe este nodo");
        }        
        
        System.out.println("-------------------------------------------------");
        System.out.println("------Buscando nodo con valor 1-----");
        if (lLista.BuscarNodo("1")){
            System.out.println("Nodo Encontrado");
        } else {
            System.out.println("No existe este nodo");
        }                        
        
        
    }
    
}
