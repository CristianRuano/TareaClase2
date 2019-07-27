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
public class Ejercicio3 {
     public static void main (String[] args) {
        Scanner x = new Scanner(System.in);
        
        double pesetas, euro = 0.006, conver;
        System.out.print("Cantidad de Pesetas a convertir: "); 
        pesetas =  x.nextDouble();
        conver = pesetas*euro;
        System.out.println((pesetas + " Pesetas es igual a " + conver + " Euros"));
    }
}
