/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jes.arboles3;

/**
 *
 * @author gatos
 */
public class ARBOLES3 {

    public static void main(String[] args) {
        
        Arbol arbol = new Arbol();
        
        arbol.insertar(20,"contenido");
        arbol.insertar(20.1, null);
        arbol.insertar(20.2,"nodo 19");
        arbol.insertar(20.3,"nodo 23");
        
        arbol.insertar(19,"contenido");
        arbol.insertar(19.1,"nodo 67");
        arbol.insertar(19.2,null);
        arbol.insertar(19.3,null);
        
        arbol.insertar(23,"contenido");
        arbol.insertar(23.1,null);
        arbol.insertar(23.2,"nodo 57");
        arbol.insertar(23.3,null);
        
        
        arbol.insertar(67,"contenido");
        arbol.insertar(67.2,"nodo 99");
        
       
        
        
        
    }
}
