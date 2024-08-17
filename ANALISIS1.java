/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jes.analisis1;


import java.util.Arrays;

public class ANALISIS1 {

    public static void main(String[] args) {
        
        
        
    int[] arreglo = {1, 2, 3};   // ** T(n)= n
    int numCombinaciones = arreglo.length * arreglo.length; // **T(n) = 1

    System.out.println("Combinaciones:"); 
    for (int i = 0; i < arreglo.length; i++) {      // ***** n
      for (int j = 0; j < arreglo.length; j++) {    //  ***** n
                                                    // ****** } T(n)= n^2
        int[] combinacion = {arreglo[i], arreglo[j]}; // ** T(n)= 1
        System.out.println(Arrays.toString(combinacion));   
      }
    }

    //                                         ********* T(n) = 2+n^2 
     
    System.out.println("Numero de combinaciones: " + numCombinaciones);
    
  }
}
