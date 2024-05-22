/*
 CLASE PARA EL MANEJO DE UN ARBOL

 */
package arbolbinariobusqueda;

import java.util.Scanner;

/**
 *
 * @author CONS SORTO
 */
public class ArbolBinarioBusqueda {

    public static void main(String[] args) {
        Scanner scEntrada = new Scanner(System.in);

        boolean bSalir;
        int iSeleccion, iValor;

        ArbolBB abbArbol = new ArbolBB();

        bSalir = false;

        while (!bSalir) {
            System.out.println("--------------------Menu--------------------");
            System.out.println("1. Ingresar Nodo al Arbol ");
            System.out.println("2. Recorrido en PreOrden ");
            System.out.println("3. Recorrido en Orden ");
            System.out.println("4. Recorrido en PostOrden ");
            System.out.println("5. Buscar Nodo ");
            System.out.println("6. Eliminar nodo ");
            System.out.println("10. Salir ");
            System.out.println("Ingrese opcion : ");
            iSeleccion = scEntrada.nextInt();
            System.out.println("------------------------------------------");
            switch (iSeleccion) {
                case 1:
                    System.out.println("Ingrese Numero : ");
                    iValor = scEntrada.nextInt();
                    abbArbol.InsertarNodo(iValor);
                    break;
                case 2:
                    System.out.println("Recorrido en PreOrden : ");
                    abbArbol.RecorridoPreOrden(abbArbol.nRaiz);
                    break;
                case 3:
                    System.out.println("Recorrido en Orden : ");
                    abbArbol.RecorridoEnOrden(abbArbol.nRaiz);
                    break;
                case 4:
                    System.out.println("Recorrido en PostOrden : ");
                    abbArbol.RecorridoPostOrden(abbArbol.nRaiz);
                    break;
                case 5:
                    System.out.println("Ingrese Numero a Buscar : ");
                    iValor = scEntrada.nextInt();
                    if (abbArbol.BuscarNodo(iValor) == null) {
                        System.out.println("Nodo no encontrado");
                    } else {
                        System.out.println("Nodo Encontrado");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese Numero a Eliminar: ");
                    iValor = scEntrada.nextInt();
                    if (abbArbol.EliminarNodo(iValor)) {
                        System.out.println("Nodo eliminado");
                    } else {
                        System.out.println("Nodo NO eliminado");
                    }
                    break;
                case 10:
                    bSalir = true;
                    break;
                default:
                    System.out.println("Opcion no encontrada");
                    break;
            }
            System.out.println("-------------------------------------------");

        }

    }

}
