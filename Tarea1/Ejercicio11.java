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
public class Ejercicio11 {
    public static void main (String[] args) {
        Scanner read = new Scanner (System.in);
        double kb, mb;
        System.out.print("Ingresa el total de Kylobytes que quieres convertir a Megabytes: ");
        kb = read.nextDouble();
        mb = kb/1024;
        System.out.println(kb + " Kilobytes es igual a " + mb + " Megabytes");
    }
}
