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
public class Ejercicio9 {
     public static void main (String[] args) {
         
         Scanner read=new Scanner (System. in );
         System.out.print("Dame el numero ; ");
         int a = read.nextInt();
         
         System.out.println("El número " + a + " tiene " + Integer.toString(a).length() + " dígitos");
    }
}
