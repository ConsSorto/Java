/* Manejo de una Cola utilizando una Lista enlazada */
package ColaListaEnlaza;

/**
 *
 * @author CONS SORTO
 */
public class ColaListaEnlazada {

    public static void main(String[] args) {
        Cola cNumeros = new Cola();

        System.out.println("------------------------------------------------");
        if (cNumeros.Vacia()){
          System.out.println("La Cola esta vacia");
        }else{
          System.out.println("La Cola contiene elementos");
        }
        System.out.println("------------------------------------------------");
        System.out.println("Cola Inicial");
        cNumeros.Insertar("1");
        cNumeros.Insertar("2");
        cNumeros.Insertar("3");
        cNumeros.Insertar("4");
        cNumeros.Insertar("5");
        cNumeros.Insertar("6");
        cNumeros.MostrarCola();
        System.out.println("------------------------------------------------");
        System.out.println("Frente :" + cNumeros.ValorFrente());
        System.out.println("Fin :" + cNumeros.ValorFin());
        System.out.println("------------------------------------------------");
        System.out.println("Insertando un nuevo elemento `0` ");
        System.out.println("------------------------------------------------");
        cNumeros.Insertar("0");
        cNumeros.MostrarCola();
        System.out.println("------------------------------------------------");
        System.out.println("Frente :" + cNumeros.ValorFrente());
        System.out.println("Fin :" + cNumeros.ValorFin());
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("Sacando elementos de la cola");
        System.out.println("Sacando Elemento : " + cNumeros.ExtraerElemento());
        System.out.println("Sacando Elemento : " + cNumeros.ExtraerElemento());
        System.out.println("Sacando Elemento : " + cNumeros.ExtraerElemento());
        System.out.println("Sacando Elemento : " + cNumeros.ExtraerElemento());
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        cNumeros.MostrarCola();
        System.out.println("------------------------------------------------");
        System.out.println("Frente :" + cNumeros.ValorFrente());
        System.out.println("Fin :" + cNumeros.ValorFin());
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("Cola eliminando un Elemento");
        System.out.println("Eliminando Elemento");
        cNumeros.Eliminar();
        cNumeros.MostrarCola();
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("Frente :" + cNumeros.ValorFrente());
        System.out.println("Fin :" + cNumeros.ValorFin());
        System.out.println("------------------------------------------------");
        System.out.println("Eliminando Elemento");
        cNumeros.Eliminar2();
        cNumeros.MostrarCola();
        System.out.println("------------------------------------------------");
        System.out.println("Frente :" + cNumeros.ValorFrente());
        System.out.println("Fin :" + cNumeros.ValorFin());
        System.out.println("------------------------------------------------");
        System.out.println("Eliminando Elemento");
        cNumeros.Eliminar2();
        cNumeros.MostrarCola();
        System.out.println("------------------------------------------------");
        System.out.println("Frente :" + cNumeros.ValorFrente());
        System.out.println("Fin :" + cNumeros.ValorFin());
        System.out.println("------------------------------------------------");
        System.out.println("Eliminando Elemento");
        cNumeros.Eliminar2();
        cNumeros.MostrarCola();
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("Frente :" + cNumeros.ValorFrente());
        System.out.println("Fin :" + cNumeros.ValorFin());
        System.out.println("------------------------------------------------");
    }

}
