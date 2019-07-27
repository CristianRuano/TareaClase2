/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea1;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio1 {
   public static void main (String[] args) {
    Scanner x = new Scanner(System.in);
    
    int n1 = 0, n2 = 0, R = 0;
    System.out.println("Ingresa dos numeros para multiplicarlos");
    System.out.print("-> ");
    n1 = x.nextInt();
    System.out.print("-> "); 
    n2 = x.nextInt();
    
    System.out.println(n1 + " X " + n2 + " = " + (R = n1*n2));
    
    }
}
