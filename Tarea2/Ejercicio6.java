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
public class Ejercicio6 {
    final static double g = 9.81;
    public static void main (String[] args) {
    Scanner read = new Scanner(System.in);
   
    int altura;  
    System.out.print("Ingrese La Altura Desde La Que Cae El Objeto: ");
    altura = read.nextInt();

    double s = Math.sqrt(2*altura/g);

    System.out.printf("El Objeto Tardo %.2f Segundos En Caer.\n", s);
  }
}
