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
public class Ejercicio13 {
     public static void main (String[] args) {
         Scanner x = new Scanner(System.in);
         
         System.out.println("Ingresa 10 numeros, pueden ser negativos y positivos");
                      int negativo=0, positivo=0;
         for(int i = 1; i <=10; i++){
             System.out.print("-> ");
             int n = x.nextInt();
             if(n<0){
             negativo = negativo + 1 ;
             }
             else{
                 positivo = positivo +1;
             }
     }
         System.out.println("El conteo de positovos fue de: "+positivo);
         System.out.println("El conteo de negativos fue de: "+negativo);
         System.out.println("FIN");
}
}
