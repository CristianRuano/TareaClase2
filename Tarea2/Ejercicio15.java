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
public class Ejercicio15 {
   public static void main (String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.print("Introduzca El Carácter Que Utilizara: ");
    String Carácter = read.next();
    
    System.out.println("Elija un tipo de pirámide");
    System.out.println("1. Con el vértice hacia arriba");
    System.out.println("2. Con el vértice hacia abajo");
    System.out.println("3. Con el vértice hacia la izquierda");
    System.out.println("4. Con el vértice hacia la derecha");
    System.out.print("Opcion: ");
    int opcion = read.nextInt();

    switch(opcion) {
      case 1:
        System.out.println("  " + Carácter);
        System.out.println(" " + Carácter + Carácter + Carácter);
        System.out.println(Carácter + Carácter + Carácter + Carácter + Carácter);
        break;
      case 2:
        System.out.println(Carácter + Carácter + Carácter + Carácter + Carácter);
        System.out.println(" " + Carácter + Carácter + Carácter);
        System.out.println("  " + Carácter);
        break;
      case 3:
        System.out.println("    " + Carácter);
        System.out.println("  " + Carácter + " " + Carácter);
        System.out.println(Carácter + " " + Carácter + " " + Carácter);
        System.out.println("  " + Carácter + " " + Carácter);
        System.out.println("    " + Carácter);
        break;
      case 4:
        System.out.println(Carácter);
        System.out.println(Carácter + " " + Carácter);
        System.out.println(Carácter + " " + Carácter + " " + Carácter);
        System.out.println(Carácter + " " + Carácter);
        System.out.println(Carácter);
        break;
      default:
    }
  } 
}
