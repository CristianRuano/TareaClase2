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
public class Ejercicio16 {
             public static void main (String[] args) {
                 Scanner x = new Scanner(System.in);
                 
                 System.out.println("Ingresa un numero para saber si es primo o no");
                 
                 System.out.print("-> ");
                 int n = x.nextInt();
                 
                 double r = n % 2;
                 
                 if(r == 1){
                     System.out.println("El numero que usted ingreso es primo");
                 }
                 else{
                     System.out.println("El numero que usted ingreso NO es primo");
                 }
                 System.out.println("FIN");
             }
}
