/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package full.arbolesejemplo;

/**
 *
 * @author Sebastian
 */
public class Arbol {
    private NodoArbol root;

    public Arbol(int rootData) {
        root = new NodoArbol(rootData);
    }
    
    public NodoArbol buscarNodo(NodoArbol nodo, int data){
        //Se utiliza una cola para visitar los nodos nivel por nivel.
        //Se inserta el nodo raíz en la cola.
        //Mientras la cola no esté vacía:
        //Se desencola un nodo y se visita.
        //Se encolan todos los hijos del nodo
        return null;
    }

    public NodoArbol getRoot() {
        return root;
    }
}
