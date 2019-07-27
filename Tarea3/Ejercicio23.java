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
public class Ejercicio23 {
        public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa una serie indeterminada de numeros");
        int n, limit=0, suma=0, media;
        do{
            System.out.print("-> "); n=read.nextInt();
            limit = limit + n; 
            suma = suma + 1;
            media = limit / suma;
        }while(limit<=10000);
        System.out.println("El total acumulado fue de: "+limit+" depues de llegar a 10000");  
        System.out.println("Ingresaste "+suma+" numeros");  
        System.out.println("La media de los numeros ingresados es de: "+media);
        }
}
