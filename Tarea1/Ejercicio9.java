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
        
public class Ejercicio9 {
    static final double pi = 3.1416;
    public static void main (String[] args) {
        Scanner read = new Scanner (System.in);

        double v, r1, r2, h;
        System.out.print("Ingrese el radio del cono: "); 
        r1 = read.nextDouble();
        
        System.out.print("Ingrese la altura del cono: "); 
        h = read.nextDouble();
        r2 = r1 * r1;
        v = (pi * r2 * h)/3;
        System.out.println("El volumen del cono es: " + v + " cm. cubicos");
    }
}
