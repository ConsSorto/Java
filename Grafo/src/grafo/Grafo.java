// PROGRAMA EJEMPLO DE LA CONSTRUCCION DE GRAFOS CON LISTAS DE ADYACENSIA

package grafo;

//Autor : CONS SORTO

import java.util.*;


public class Grafo
{  static boolean[] visitados;                                                                          // Arreglo vertices visitados

   public static void main(String[] args)
   {  List v01 = new LinkedList();                                                                      // Listas de cada vertice
      List v02 = new LinkedList();                                                                      // Listas de cada vertice
      List v03 = new LinkedList();                                                                      // Listas de cada vertice
      List v04 = new LinkedList();                                                                      // Listas de cada vertice
      List v05 = new LinkedList();                                                                      // Listas de cada vertice
      List v06 = new LinkedList();                                                                      // Listas de cada vertice
      List v07 = new LinkedList();                                                                      // Listas de cada vertice
      List v08 = new LinkedList();                                                                      // Listas de cada vertice
      List v09 = new LinkedList();                                                                      // Listas de cada vertice
      List v10 = new LinkedList();                                                                      // Listas de cada vertice
      List v11 = new LinkedList();                                                                      // Listas de cada vertice
      List v12 = new LinkedList();                                                                      // Listas de cada vertice
      List v13 = new LinkedList();                                                                      // Listas de cada vertice
      List v14 = new LinkedList();                                                                      // Listas de cada vertice

      v01.add("2");  v01.add("3");                                                                      // Vertices adyacentes de cada vertice
      v02.add("1");  v02.add("4");  v02.add("5");                                                       // Vertices adyacentes de cada vertice
      v03.add("1");  v03.add("6");  v03.add("7");                                                       // Vertices adyacentes de cada vertice
      v04.add("2");  v04.add("8");                                                                      // Vertices adyacentes de cada vertice
      v05.add("2");  v05.add("8");                                                                      // Vertices adyacentes de cada vertice
      v06.add("3");  v06.add("8");                                                                      // Vertices adyacentes de cada vertice
      v07.add("3");  v07.add("8");                                                                      // Vertices adyacentes de cada vertice
      v08.add("4");  v08.add("5");  v08.add("6");  v08.add("7");                                        // Vertices adyacentes de cada vertice
      v09.add("10"); v09.add("11");                                                                     // Vertices adyacentes de cada vertice
      v10.add("9");  v10.add("12");                                                                     // Vertices adyacentes de cada vertice
      v11.add("9");  v11.add("12");                                                                     // Vertices adyacentes de cada vertice
      v12.add("10"); v12.add("11");                                                                     // Vertices adyacentes de cada vertice
      v13.add("14");                                                                                    // Vertices adyacentes de cada vertice
      v14.add("13");                                                                                    // Vertices adyacentes de cada vertice

      List[] grafo = { v01, v02, v03, v04, v05, v06, v07, v08, v09, v10, v11, v12, v13, v14 };          // Grafo representado en un arreglo

      Grafo.enumerarArcos(grafo);                                                                      // Invocacion metodo enumera arcos

      System.out.println(" ");                                                                          // Invocacion metodo Breadth First Search
      Grafo.inicializarVisitados(grafo);                                                               // Invocacion metodo Breadth First Search
      Grafo.breadthFirstSearch(grafo, 1);                                                              // Invocacion metodo Breadth First Search
      System.out.println(" ");                                                                          // Invocacion metodo Breadth First Search
      Grafo.inicializarVisitados(grafo);                                                               // Invocacion metodo Breadth First Search
      Grafo.breadthFirstSearch(grafo, 8);                                                              // Invocacion metodo Breadth First Search
      System.out.println(" ");                                                                          // Invocacion metodo Breadth First Search
      Grafo.inicializarVisitados(grafo);                                                               // Invocacion metodo Breadth First Search
      Grafo.breadthFirstSearch(grafo, 3);                                                              // Invocacion metodo Breadth First Search

      System.out.println(" ");                                                                          // Invocacion metodo Depth First Search
      Grafo.inicializarVisitados(grafo);                                                               // Invocacion metodo Depth First Search
      Grafo.depthFirstSearch(grafo, 1);                                                                // Invocacion metodo Depth First Search
      System.out.println(" ");                                                                          // Invocacion metodo Depth First Search
      Grafo.inicializarVisitados(grafo);                                                               // Invocacion metodo Depth First Search
      Grafo.depthFirstSearch(grafo, 8);                                                                // Invocacion metodo Depth First Search
      System.out.println(" ");                                                                          // Invocacion metodo Depth First Search
      Grafo.inicializarVisitados(grafo);                                                               // Invocacion metodo Depth First Search
      Grafo.depthFirstSearch(grafo, 3);                                                                // Invocacion metodo Depth First Search

      System.out.println(" ");                                                                          // Invocacion metodo Enumerar Componentes
      Grafo.inicializarVisitados(grafo);                                                               // Invocacion metodo Enumerar Componentes
      Grafo.enumerarComponentes(grafo);                                                                // Invocacion metodo Enumerar Componentes
   }

   static void inicializarVisitados(List[] grafo)                                                       // Metodo que inicializa visitados
   {  Grafo.visitados = new boolean[grafo.length];                                                     // Metodo que inicializa visitados
      for ( int i = 0; i < grafo.length; i = i + 1 )                                                    // Metodo que inicializa visitados
      {  Grafo.visitados[i] = false;                                                                   // Metodo que inicializa visitados
      }                                                                                                 // Metodo que inicializa visitados
   }

   static void enumerarArcos(List[] g)                                                                  // Metodo que enumerra los arcos de un grafo
   {  List visitado = null;
      ListIterator iter = null;
      for ( int i = 0; i < g.length; i = i + 1 )
      {  visitado = g[i];
         iter = visitado.listIterator(0);
         while ( iter.hasNext() )
         {  System.out.println("Arco del Vertice "+(i+1)+" al Vertice "+(String)iter.next());
         }
      }
   }

   static void breadthFirstSearch(List[] g, int inicial)                                                // Metodo que navega el grafo a lo ancho
   {  LinkedList avisitar = new LinkedList();
      List visitado = null;
      ListIterator iter = null;
      String rotulo = null;
      Integer entero = null;
      int vertice = 0;

      Grafo.visitados[inicial-1] = true;
      System.out.println("Breadth First Search - Vertice "+inicial);
      visitado = g[inicial-1];
      iter = visitado.listIterator();
      while ( iter.hasNext() )
      {  rotulo = (String)iter.next();
         entero = new Integer(rotulo);
         vertice = entero.intValue();
         avisitar.add(entero);
      }

      while ( !avisitar.isEmpty() )
      {  entero = (Integer)avisitar.removeFirst();
         vertice = entero.intValue();
         if ( visitados[vertice-1] == false )
         {  Grafo.visitados[vertice-1] = true;
            System.out.println("Breadth First Search - Vertice "+vertice);
            visitado = g[vertice-1];
            iter = visitado.listIterator();
            while ( iter.hasNext() )
            {  rotulo = (String)iter.next();
               entero = new Integer(rotulo);
               vertice = entero.intValue();
               avisitar.add(entero);
            }
         }
      }
   }

   static void depthFirstSearch(List[] grafo, int inicial)                                              // Metodo que navega el grafo en profundidad
   {  List visitado = null;
      ListIterator iter = null;
      String rotulo = null;
      Integer nodo = null;
      int indice = 0;

      if ( Grafo.visitados[inicial-1] == false )
      {  System.out.println("Depth First Search - Vertice "+inicial);
      }
      Grafo.visitados[inicial-1] = true;
      visitado = grafo[inicial-1];
      iter = visitado.listIterator(0);

      while ( iter.hasNext() )
      {  rotulo = (String)iter.next();
         nodo = new Integer(rotulo);
         indice = nodo.intValue();
         if ( Grafo.visitados[indice-1] == false )
         {  System.out.println("Depth First Search - Vertice "+rotulo);
            Grafo.visitados[indice-1] = true;
            Grafo.depthFirstSearch(grafo, indice);                                                     // Recursividad del metodo
         }
      }
   }

   static void enumerarComponentes(List[] grafo)                                                        // Metodo que enumera componentes
   {  int componente = 0;
      for ( int i = 0; i < grafo.length; i = i + 1 )
      {  componente = componente + 1;
         if ( Grafo.visitados[i] == false )
         {  Grafo.depthFirstSearch(grafo, i+1);
            System.out.println("Enumeracion de Componentes - Componente : "+componente);
         }
      }
   }
}
