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
public class Ejercicio11 {
    public static void main (String[] args) {
          Scanner read = new Scanner(System.in);
          int num=5;
          int b=1;
          System.out.print("Damen un numero : ");
          int a= read.nextInt();
          
          while(b<=num )
          {
              num--;
              a++;
              System.out.print("El cuadrado es ;" +Math.pow(a,2));
              System.out.println("El cubo es ; "+Math.pow(a,3));
          }
    } 
}
