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
public class Ejercicio9 {
   public static void main (String[] args) {
    Scanner read = new Scanner(System.in);
    double a,b,c;
    double X0,X1;

    System.out.print("Valor a:");
    a = read.nextDouble();
    
    System.out.print("Valor b:");
    b = read.nextDouble();
    
    System.out.print("Valor c:");
    c = read.nextDouble();
        
    double numero = (b*b) - (4*a*c);
       
    if(numero > 0) 
    {
    X0 = (-b + Math.sqrt(numero)) / 2*a;
    X1 = (-b - Math.sqrt(numero)) / 2*a;
    System.out.println("La ecuacion tiene dos soluciones");
    System.out.println("X0:"  +X0);
    System.out.println("X1:"  +X1);
    }
    else 
    {
    if(numero == 0) 
    {
    X0 = (-b) / 2*a;
    System.out.println("La ecuacion tiene una solucion");  
    System.out.println("X0:"  +X0);
    } else 
    {
    System.out.println("La ecuacion no tien solución");
    }
    }
     }
   }
