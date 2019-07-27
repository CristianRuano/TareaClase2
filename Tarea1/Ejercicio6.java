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
public class Ejercicio6 {
     public static void main (String[] args) {
        Scanner x = new Scanner (System.in);
        double base, altura, area;
        System.out.print("Ingrese la base del triangulo cm -> "); 
        base = x.nextDouble();
        
        System.out.print("Ingrese la altura del triangulo cm -> "); 
        altura = x.nextDouble();
        area = (base * altura)/2;
        
        System.out.println("El area del triangulo es: " + area + " metros cuadrados");
    }
}
