/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package full.arbolesejemplo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
public class NodoArbol {
    private int data;
    List<NodoArbol> hijos;

    public NodoArbol(int data) {
        this.data = data;
        this.hijos = new ArrayList<NodoArbol>();
    }

    public void addHijo(NodoArbol hijo) {
        hijos.add(hijo);
    }
    
    public void dropHijo(NodoArbol hijo, NodoArbol padre){
        for(NodoArbol nieto:hijo.getHijos()) {
            padre.addHijo(nieto);
        }
        hijos.remove(hijo);
    }

    public int getData() {
        return data;
    }

    public List<NodoArbol> getHijos() {
        return hijos;
    }
    
}
