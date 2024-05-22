/*
Ejemplo de la construccion de un grafo y sus recorridos
 */
package grafo_ejemplo2;

import java.util.Scanner;

/**
 * @author CONS SORTO
 */
public class Grafo_Ejemplo2 {

    public static void main(String[] args) {
        Scanner scEntrada = new Scanner(System.in);
        Grafo gGrafo;
        String strValor;
        boolean bSalir;
        int iSeleccion, iVertices, iOrigen, iDestino, iPeso;

        System.out.println("Ingrese cantidad de vertices del grafo");
        System.out.println("Vertices : ");
        iVertices = scEntrada.nextInt();

        gGrafo = new Grafo(iVertices);

        bSalir = false;

        while (!bSalir) {
            System.out.println("--------------------Menu--------------------");
            System.out.println("1. Comprobar si hay vertices vacios");
            System.out.println("2. Insertar Vertice");
            System.out.println("3. Eliminar Vertice");
            System.out.println("4. Insertar Arco");
            System.out.println("5. Insertar Arco Ponderado");
            System.out.println("6. Eliminar Arco");
            System.out.println("7. Mostrar Grafo");
            System.out.println("8. Salir ");
            System.out.println("Ingrese opcion : ");
            iSeleccion = scEntrada.nextInt();
            System.out.println("------------------------------------------");
            switch (iSeleccion) {
                case 1:
                    if (gGrafo.VerticesVacios() == 0) {
                        System.out.println("No hay vertices vacios ");
                    } else {
                        System.out.println("Vertices vacios : " + gGrafo.VerticesVacios());
                    }
                    break;
                case 2:
                    System.out.println("Ingrese nombre del Vertice : ");
                    strValor = scEntrada.next();
                    System.out.println(gGrafo.InsertarVertice(strValor));                   
                    break;   
                case 3:
                    System.out.println("Ingrese nombre del Vertice : ");
                    strValor = scEntrada.next();
                    if (gGrafo.BuscarVertice(strValor) == -1){       
                        System.out.println("Vertice no encontrado");
                    } else {
                      gGrafo.BorrarVertice(gGrafo.BuscarVertice(strValor));
                      System.out.println("Vertice Eliminado");
                    }    
                    break;     
                case 4:
                    System.out.println("Ingrese nombre del Vertice Origen: ");
                    strValor = scEntrada.next();
                    iOrigen = gGrafo.BuscarVertice(strValor);
                    if (iOrigen == -1) {
                        System.out.println("Vertice no encontrado");
                        break;
                    } else {
                        System.out.println("Ingrese nombre del Vertice Destino: ");
                        strValor = scEntrada.next();
                        iDestino = gGrafo.BuscarVertice(strValor);
                        if (iDestino == -1) {
                            System.out.println("Vertice no encontrado");
                            break;
                        } else {
                            gGrafo.InsertarArco(iOrigen, iDestino);
                            System.out.println("Arco Insertado");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ingrese nombre del Vertice Origen: ");
                    strValor = scEntrada.next();
                    iOrigen = gGrafo.BuscarVertice(strValor);
                    if (iOrigen == -1) {
                        System.out.println("Vertice no encontrado");
                        break;
                    } else {
                        System.out.println("Ingrese nombre del Vertice Destino: ");
                        strValor = scEntrada.next();
                        iDestino = gGrafo.BuscarVertice(strValor);
                        if (iDestino == -1) {
                            System.out.println("Vertice no encontrado");
                            break;
                        } else {
                            System.out.println("Ingrese Peso: ");
                            iPeso= scEntrada.nextInt();
                            gGrafo.InsertarArcoPonderado(iOrigen, iDestino, iPeso);
                            System.out.println("Arco Insertado");
                        }
                    }
                    break;                     
                case 6:
                    System.out.println("Ingrese nombre del Vertice Origen: ");
                    strValor = scEntrada.next();
                    iOrigen = gGrafo.BuscarVertice(strValor);
                    if (iOrigen == -1) {
                        System.out.println("Vertice no encontrado");
                        break;
                    } else {
                        System.out.println("Ingrese nombre del Vertice Destino: ");
                        strValor = scEntrada.next();
                        iDestino = gGrafo.BuscarVertice(strValor);
                        if (iDestino == -1) {
                            System.out.println("Vertice no encontrado");
                            break;
                        } else {
                            gGrafo.EliminarArco(iOrigen, strValor);
                            System.out.println("Arco Eliminado");
                        }
                    }
                    break;                     
                case 7:
                    gGrafo.MostrarGrafo();
                    break;
                case 8:
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
