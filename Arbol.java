
package com.mycompany.jes.arboles3;


public class Arbol {
      
    
    nodo raiz;
    public Arbol(){
        raiz = null;
    }
    
    
    public void insertar(double i, Object info){
        nodo n = new nodo(i);
        n.contenido = info;
        
        if(raiz==null) {
            raiz=n;
            
        }else{
            nodo aux = raiz;
            while(aux != null) {
                n.padre = aux;
                if(n.identificador >= aux.identificador) {
                    aux=aux.derecha;
                    
                } else{
                    aux=aux.centro;
                     
                }
            }
            
            
            if(n.identificador < n.padre.identificador){
                n.padre.izquierda = n;
                
            } else{
                n.padre.derecha = n;
            }
            
        }
    
         System.out.println("Indice " +n.identificador+" Contenido: "+n.contenido);
        
    }
    
    //public void recorrer(nodo n){
     //   if(n != null){
       //     recorrer(n.izquierda);
         //   System.out.println("indice " +n.identificador+" info "+n.contenido);
           // recorrer(n.derecha);
            
        //}
        
       
    
    
    
    public class nodo {
        
        public nodo padre;
        public nodo izquierda;
        public nodo centro;
        public nodo derecha;
        
        
        public double identificador;
        
        public Object contenido;
        
        
        
        
        public nodo(double indice) {
            identificador = indice;
            derecha  = null;
            izquierda = null;
            centro = null;
            padre = null;
            contenido = null;
        }
    }
    
    
    
}

