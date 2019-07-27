/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea3;

/**
 *
 * @author dell
 */
public class Ejercicio2 {
 public static void main (String[] args) {
         int x=1,y;
         while(x<=100)
         {
          y = x%5;   
             if (y %5==0){
                System.out.println("El numero "+y+" es multiplo de 5");  
             }
         }
    }   
}
