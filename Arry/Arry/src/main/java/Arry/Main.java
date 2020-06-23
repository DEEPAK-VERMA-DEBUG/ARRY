/*
 ZAVALA CONCHA SILVIA NALLELY
 */
package Arry;

import java.util.Arrays;

/**
 *
 * @author Hogar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   
        static int[] separaParesImpares(int[] lista){
        int[] nuevo=new int[lista.length];
        int i, posicionNuevoIzq=0, posicionNuevoDer=lista.length-1;
        
      
        for (i=0;i < lista.length;i++){
            if (lista[i]%2==0){
                nuevo[posicionNuevoIzq]=lista[i];
                posicionNuevoIzq++;
            } else {
                nuevo[posicionNuevoDer]=lista[i];
                posicionNuevoDer--;
            }                
        }
        return nuevo;
    }
    
    public static void main(String[] args) {
        
         // TODO code application logic here
        int[] elementos=new int[10];
        int i;
        
        
        for (i=0;i < elementos.length;i++){
            elementos[i]=(int)(Math.random()*100+1);
        }
        System.out.println("Array  ordenar pares e impares antes : "+Arrays.toString(elementos));
      
        elementos=separaParesImpares(elementos);
        System.out.println("Array  ordenar pares e impares después : "+Arrays.toString(elementos));        
    }
}
        
        
        
        
        
        
        
    
    

