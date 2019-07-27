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
public class Ejercicio5 {
        
      public static void main (String[] args) { 
    Scanner s = new Scanner(System.in);
    int l1, l2;
    System.out.println("Ingrese los lados correspondientes del rectangulo en centimetros");
    System.out.println("Ingrese el ancho del rectangulo: "); 
    l1 = s.nextInt();
    System.out.println("Ingrese la altura del rectangulo: "); 
    l2 = s.nextInt();
    int A = (l1*l2);
    System.out.println(("El area del rectangulo es: "+ A+"cm"));
    
      } 
}
