/* Manejo de una Lista enlazada circular*/
package listaenlazada;

/**
 *
 * @author CONS SORTO
 */
public class ListaEnlazada {

    public static void main(String[] args) {
        Lista lNumeros = new Lista();

        System.out.println("------------------------------------------------");
        if (lNumeros.Vacia()){
          System.out.println("La lista esta vacia");
        }else{
          System.out.println("La lista contiene elementos");
        }
        System.out.println("------------------------------------------------");
        System.out.println("Lista Original");
        lNumeros.Insertar("1");
        lNumeros.Insertar("1");
        lNumeros.Insertar("2");
        lNumeros.Insertar("3");
        lNumeros.Insertar("4");
        lNumeros.Insertar("5");
        lNumeros.Insertar("6");
        lNumeros.MostrarLista();
        System.out.println("------------------------------------------------");
        System.out.println("Nodo Enlace :" + lNumeros.getnAcceso().getStrValor());
        System.out.println("---------------Eliminando Nodo 3----------------");
        lNumeros.Eliminar("3");
        lNumeros.MostrarLista();
        System.out.println("------------------------------------------------");
        System.out.println("Nodo Enlace :" + lNumeros.getnAcceso().getStrValor());
        System.out.println("---------------Eliminando Nodo 6----------------");
        lNumeros.Eliminar("6");
        lNumeros.MostrarLista();
        System.out.println("------------------------------------------------");       
        System.out.println("Nodo Enlace :" + lNumeros.getnAcceso().getStrValor());
        System.out.println("------------------------------------------------");
        lNumeros.MostrarLista();
        System.out.println("------------------------------------------------");       
        
/*        System.out.println("Lista con un valor nuevo en el inicio");
        lNumeros.InsertarInicio("0");
        lNumeros.MostrarLista();
        System.out.println("------------------------------------------------");
        System.out.println("Lista sacando el inicio");
        System.out.println("Sacando inicio : " + lNumeros.SacarInicio());
        lNumeros.MostrarLista();
        System.out.println("------------------------------------------------");
        System.out.println("Lista eliminando inicio");
        System.out.println("Eliminando inicio ");
        lNumeros.EliminarInicio();
        lNumeros.MostrarLista();
        System.out.println("------------------------------------------------");
        System.out.println("Insertando un dato despues de 2");
        lNumeros.InsertarDespuesNodo(lNumeros.BuscarNodo("2"), "2.5");
        lNumeros.MostrarLista();
        System.out.println("------------------------------------------------");
     */
    }
  
}
