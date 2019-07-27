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
public class Ejercicio24 {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = sc.nextInt();
        for(int i = 1; i <= numFilas; i++){
            
            for(int j = 1; j <= numFilas - i ; j++){
                System.out.print(" ");
            }
            for(int k = 1; k >= (1); k--){
                System.out.print((k >=10) ?+ k : " " + k);
            }
               for (int k = 2; k <=i; k++){ 
                   System.out.print((k>= 10) ?+ k : " " + k); 
               }
            
            System.out.println();
        }
    }
}
