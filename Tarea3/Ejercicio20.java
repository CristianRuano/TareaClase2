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
public class Ejercicio20 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = sc.nextInt();
        System.out.print("Introduzca el caracter con el que quiere que se dibuje la piramide: ");
        String caracter = sc.next();    

String x ="";
        for(int altura = 1; altura<=numFilas; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(caracter); 
            }
            //Asteriscos
            
            for(int dibujo=1; dibujo<=(altura*2)-1; dibujo++){ 
               System.out.print(" ");
            }
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(caracter); 
            }
            System.out.println();
        }
    }
}
