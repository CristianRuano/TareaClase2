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
public class Ejercicio2 {
    public static void main (String[] args) {
        Scanner x = new Scanner(System.in);
        
        float pesetas = 166.39f, euro, R;
        System.out.print("Cantidad de Euros: ");
        euro = x.nextFloat();
        R = euro * pesetas;
        System.out.println((euro + " Euros es igual a " + R + " Pesetas"));   
}
}
