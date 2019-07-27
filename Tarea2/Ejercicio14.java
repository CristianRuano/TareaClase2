/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio14 {
     public static void main (String[] args) {
    Scanner read = new Scanner(System.in);
        
    System.out.print("Ingrese Un Número Entero: ");
    int NumeroEntero = read.nextInt();

    if ((NumeroEntero % 2) == 0) 
    {
      System.out.print("El número Ingresado Es Par");
    } else 
    {
      System.out.print("El número Ingresado Es Impar");
    }

    if ((NumeroEntero % 5) == 0) 
    {
      System.out.println(" Y Es Divisible Entre 5.");
    } else 
    {
      System.out.println(" Y No Es Divisible Entre 5.");
    }
  }
}
