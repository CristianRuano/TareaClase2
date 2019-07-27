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
public class Ejercicio13 {
     public static void main (String[] args) {
     Scanner read = new Scanner(System.in);
     int n1, n2, n3;
     
        System.out.print("Ingrese El Primer Número: ");
        n1 = read.nextInt();
        
        System.out.print("Ingrese El Segundo Número: ");
        n2 = read.nextInt();
        
        System.out.print("Ingrese El Tercer Número: ");
        n3 = read.nextInt();
        if (n1 > n2) 
        {
            if (n1 > n3) 
            {
                System.out.println("El mayor es: " + n1);
            } else 
            {
                System.out.println("el mayor es: " + n3);
            }
        } 
        if (n2 > n3) 
        {
            System.out.println("el mayor es: " + n2);
        } 
        else 
        {
            System.out.println("el numero mayor es: " + n3);
        }    
    } 
}
