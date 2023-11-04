/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package full.arbolesejemplo;

/**
 *
 * @author Sebastian
 */
public class ArbolesEjemplo {

    public static void main(String[] args) {
        Arbol arbolito = new Arbol(5);
        arbolito.getRoot().addHijo(new NodoArbol(3));
        arbolito.getRoot().addHijo(new NodoArbol(7));
        arbolito.getRoot().addHijo(new NodoArbol(9));
        arbolito.getRoot().getHijos().get(0).addHijo(new NodoArbol(20));
        
        NodoArbol buscado = arbolito.buscarNodo(arbolito.getRoot(), 9);
        System.out.println(buscado.getData());
    }
}
