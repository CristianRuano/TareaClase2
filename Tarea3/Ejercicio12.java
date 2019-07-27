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

public class Ejercicio12 {
    public static void main (String[] args) {
        Scanner x = new Scanner(System.in); 
        System.out.println("Numeros en serie de fibonacci\n");
        
        System.out.println("Ingresa el total de terminos que desea ver: ");
        int rango = x.nextInt();
            int n, n1 = 1,n2 = 0;
        for (int i = 0; i <= rango; i++) {
            n = n2;
            n2 = n1 + n2;
            n1 = n;
            System.out.println(n1);
        }
        System.out.println("FIN");
        
    }
}

