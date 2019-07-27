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
public class Ejercicio4 {
     public static void main (String[] args) {
    Scanner x = new Scanner(System.in);
    int option; double  n1 = 0, n2 = 0, R = 0;
     System.out.println("Ingresa dos numeros para hacer operaciones distintas");
    try{
    System.out.print("-> "); 
    n1 = x.nextDouble();
    System.out.print("-> ");
    n2 = x.nextDouble();
    System.out.print("1 - Suma\n2 - resta\n3 - divicion\n4 - multiplicacion\nEscoja una opcion -> "); 
    option = x.nextInt();
    switch (option){
        case 1: R = n1 + n2;
            System.out.println((n1 + " + " + n2 + " = " + R));
            break;
        case 2: R = n1 - n2;
            System.out.println((n1 + " - " + n2 + " = " + R));
            break;
        case 3: R = n1 / n2;
            System.out.println((n1 + " / " + n2 + " = " + R));
            break;
        case 4: R = n1 * n2;
            System.out.println((n1 + " x " + n2 + " = " + R));
            break;
    }
    }catch(Exception e){
    System.out.println("Ingresa un valor numerico");
    }}
}
