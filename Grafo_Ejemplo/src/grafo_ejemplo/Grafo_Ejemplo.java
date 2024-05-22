/*
EJEMPLO DE LA CREACION Y RECORRIDO DE UN GRAFO  */
package grafo_ejemplo;

import listaenlazada.Lista;

/**
 *
 * @author CONS SORTO
 */
public class Grafo_Ejemplo {

    public static void main(String[] args) {
        Lista lVertice01 = new Lista("1");
        Lista lVertice02 = new Lista("2");
        Lista lVertice03 = new Lista("3");
        Lista lVertice04 = new Lista("4");
        Lista lVertice05 = new Lista("5");
        Lista lVertice06 = new Lista("6");
        Lista lVertice07 = new Lista("7");
        Lista lVertice08 = new Lista("8");
        Lista lVertice09 = new Lista("9");
        Lista lVertice10 = new Lista("10");
        Lista lVertice11 = new Lista("11");
        Lista lVertice12 = new Lista("12");
        Lista lVertice13 = new Lista("13");
        Lista lVertice14 = new Lista("14");

        lVertice01.Insertar("2"); lVertice01.Insertar("3");
        lVertice02.Insertar("1"); lVertice02.Insertar("4"); lVertice02.Insertar("5");
        lVertice03.Insertar("1"); lVertice03.Insertar("6"); lVertice03.Insertar("7");
        lVertice04.Insertar("2"); lVertice04.Insertar("8"); 
        lVertice05.Insertar("2"); lVertice05.Insertar("8"); 
        lVertice06.Insertar("3"); lVertice06.Insertar("8");
        lVertice07.Insertar("3"); lVertice07.Insertar("8");
        lVertice08.Insertar("4"); lVertice08.Insertar("5");
        lVertice08.Insertar("6"); lVertice08.Insertar("7");
        lVertice09.Insertar("10"); lVertice09.Insertar("11");
        lVertice10.Insertar("9"); lVertice10.Insertar("12");
        lVertice11.Insertar("9"); lVertice11.Insertar("12");
        lVertice12.Insertar("10"); lVertice12.Insertar("11");
        lVertice13.Insertar("14"); 
        lVertice14.Insertar("13"); 
        
        Lista[] lGrafo = {lVertice01, lVertice02, lVertice03, lVertice04, 
            lVertice05, lVertice06, lVertice07, lVertice08, lVertice09,
            lVertice10, lVertice11, lVertice12, lVertice13, lVertice14};
               
        MostrarGrafo(lGrafo);
        
    }
    
    private static void MostrarGrafo(Lista[] lGrafo){
        for (int i = 0; i < lGrafo.length; i = i + 1) {
            System.out.println(lGrafo[i].MostratInformacionVertice());
        }
    }
    
}
