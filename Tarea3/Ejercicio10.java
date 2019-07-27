/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea3;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio10 {
         public static void main (String[] args) {
          Scanner read = new Scanner(System.in);
         int b=0,num=5;
         int suma=0;
         int numero=5;
          System.out.println("Para salir ingresa cero");
          while(num!=0){
              System.out.println("Ingresa un numero");
                  numero=read.nextInt();
              if ( numero>=0)
              {
               suma=suma+numero;
              b++;
              }
              else 
              {
                System.out.println("La media de los valores ingresados es ;"+suma/(b));  
              }   
          } 
     }
}
