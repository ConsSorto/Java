/*Codigo para manipular una lista */

package listaenlazada;

import java.util.Scanner;
/**
 *
 * @author CONS SORTO
 */
public class MenuTren {

    public static void main(String[] args) {
        Scanner scEntrada  = new Scanner(System.in);
        String strValor, strVagonAnterior;
        boolean bSalir;
        int iSeleccion;
        
        Lista lTren = new Lista();
        
        bSalir = false;
        
        while(!bSalir){
           System.out.println("--------------------Menu--------------------");
           System.out.println("1. Insertar Locomotora");
           System.out.println("2. Insertar vagon al inicio");
           System.out.println("3. Insertar vagon al final");
           System.out.println("4. Verificar Cargamento");
           System.out.println("5. Ingresar un vagon despues de :");
           System.out.println("6. Encontrar un vagon");
           System.out.println("7. Insertar carga de combustible");
           System.out.println("8. Eliminar un vagon");
           System.out.println("9. Mostrar Inicio");
           System.out.println("10. Mostrar Final");
           System.out.println("11. Salir");
           System.out.print("Ingrese opcion : ");
           iSeleccion = scEntrada.nextInt();
           scEntrada.nextLine();
           System.out.println("------------------------------------------");
           switch(iSeleccion){
                case 1:
                    System.out.print("Ingrese numero de locomotora : ");
                    strValor = scEntrada.nextLine();
                    lTren.InsertarInicio("Locomotora N: " + strValor);
                    break;
                case 2:
                    System.out.print("Ingrese carga : ");
                    strValor = scEntrada.nextLine();
                    lTren.InsertarInicio(strValor);
                    break;
                case 3:
                    System.out.print("Ingrese carga : ");
                    strValor = scEntrada.nextLine();
                    lTren.InsertarFinal(strValor);
                    break;
                case 4:
                    lTren.MostrarLista();
                    break;
                case 5:
                    System.out.print("Ingrese vagon anterior : ");
                    strVagonAnterior = scEntrada.nextLine();
                    System.out.print("Ingrese valor del nuevo vagon : ");
                    strValor = scEntrada.nextLine();
                    lTren.InsertarDespuesNodo(lTren.BuscarNodo(strVagonAnterior), strValor);
                    break;                    
                case 6:
                    System.out.print("Ingrese vagon a buscar : ");
                    strValor = scEntrada.nextLine();
                    if (lTren.BuscarNodo(strValor) == null){
                        System.out.println("Vagon encontrado");
                    }else{
                        System.out.println("Vagon no encontrado");
                    }
                    break;                    
                case 7:
                    System.out.print("Ingrese galones : ");
                    strValor = scEntrada.nextLine();
                    lTren.InsertarFinal("Carga Combustible Gl : " + strValor);
                    break;
                case 8:
                    System.out.print("Ingrese carga : ");
                    strValor = scEntrada.nextLine();
                    if (lTren.EliminarNodo(strValor)){
                        System.out.println("Carga eliminada");
                    }else{
                        System.out.println("Carga no eliminada");
                    };
                    break;
                case 9:
                    if (lTren.getnInicio() == null){
                        System.out.println("No hay Inicio");
                    }else{
                        System.out.println(lTren.getnInicio().getStrValor());
                    }
                    break;
                case 10:
                    if (lTren.getnFin()== null){
                        System.out.println("No hay Fin");
                    }else{
                        System.out.println(lTren.getnFin().getStrValor());
                    }
                    break;
                case 11:
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
