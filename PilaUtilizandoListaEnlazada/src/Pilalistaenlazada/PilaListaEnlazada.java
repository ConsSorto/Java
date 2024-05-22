/*
 *manejo de una lista doblemente enlazada
 */
package Pilalistaenlazada;

/**
 *
 * @author CONS SORTO
 */
public class PilaListaEnlazada {

    public static void main(String[] args) {
        Pila pPila = new Pila();
        
        if (pPila.Vacia()){
            System.out.println("Pila vacia");
        } else {
            System.out.println("Pila tiene elementos");
        }
        System.out.println("-------------------------------------------------");
        if (pPila.getnCima() == null){
            System.out.println("No hay Cima");
        } else {
            System.out.println("Valor nodo Cima :" + pPila.getnCima().getStrValor());
        }

        pPila.InsertarPush("6");
        pPila.InsertarPush("5");
        pPila.InsertarPush("4");
        pPila.InsertarPush("3");
        pPila.InsertarPush("2");
        
        System.out.println("-------------------------------------------------");
        pPila.MostrarPila();
        System.out.println("-------------------------------------------------");
        if (pPila.getnCima() == null){
            System.out.println("No hay Cima");
        } else {
            System.out.println("Valor nodo Cima :" + pPila.getnCima().getStrValor());
        }
        System.out.println("----------------Eliminando-----------------");
        pPila.EliminarPop();
        System.out.println("-------------------------------------------------");
        pPila.MostrarPila();
        System.out.println("-------------------------------------------------");
        if (pPila.getnCima() == null){
            System.out.println("No hay Cima");
        } else {
            System.out.println("Valor nodo Cima :" + pPila.getnCima().getStrValor());
        }

        System.out.println("----------------Sacando Cima-----------------");
        
        System.out.println(pPila.ExtraerCima().getStrValor());
        
        System.out.println("-------------------------------------------------");
         System.out.println("-------------------------------------------------");
        pPila.MostrarPila();
        System.out.println("-------------------------------------------------");
        
        if (pPila.getnCima() == null){
            System.out.println("No hay Cima");
        } else {
            System.out.println("Valor nodo Cima :" + pPila.getnCima().getStrValor());
        }


    }
    
}
