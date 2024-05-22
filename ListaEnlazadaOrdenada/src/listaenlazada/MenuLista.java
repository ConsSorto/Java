/*Codigo para manipular una lista */



package listaenlazada;

import java.util.Scanner;
/**
 *
 * @author CONS SORTO
 */
public class MenuLista {

    public static void main(String[] args) {
        Scanner scEntrada  = new Scanner(System.in);
        String strValor;
        boolean bSalir;
        int iSeleccion;
        
        Lista lNumeros = new Lista();
        
        bSalir = false;
        
        while(!bSalir){
           System.out.println("--------------------Menu--------------------");
           System.out.println("1. Comprobar si la lista esta vacia");
           System.out.println("2. Insertar Valor ");
           System.out.println("3. Mostrar Lista ");
           System.out.println("4. Mostrar Inicio ");
           System.out.println("5. Mostrar Fin ");
           System.out.println("6. Salir ");
           System.out.print("Ingrese opcion : ");
           iSeleccion = scEntrada.nextInt();
           System.out.println("------------------------------------------");
           switch(iSeleccion){
               case 1:
                    if (lNumeros.Vacia()){
                        System.out.println("La lista esta vacia");                   
                    }else{
                        System.out.println("La lista tiene elementos");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese valor : ");
                    strValor = scEntrada.next();
                    lNumeros.InsertarEnOrden(strValor);
                    break;                    
                case 3:
                    lNumeros.MostrarLista();
                    break;
                case 4:
                    if (lNumeros.getnInicio() == null){
                        System.out.println("No hay Inicio");
                    }else{
                        System.out.println(lNumeros.getnInicio().getStrValor());
                    }
                    break;
                case 5:
                    if (lNumeros.getnFin()== null){
                        System.out.println("No hay Fin");
                    }else{
                        System.out.println(lNumeros.getnFin().getStrValor());
                    }
                    break;
                case 6:
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
