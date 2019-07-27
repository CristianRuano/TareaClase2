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
public class Ejercicio10 {
      public static void main (String[] args) {
        Scanner x = new Scanner (System.in);
        double kb, mb;
        System.out.print("Ingrese el total de Megabytes que quiere convertir a Kilobytes: "); 
        mb = x.nextDouble();
        kb = mb*1024;
        System.out.println(mb + " Megabytes es igual a " + kb + " Kilobytes");
    }
}
