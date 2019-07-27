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
public class Ejercicio17 {
    public static void main (String[] args) {
        Scanner x = new Scanner(System.in);
        int n; 
        do{
        System.out.println("Ingresa un numero positivo");
        System.out.print("-> ");
        n = x.nextInt();
        
        if(n <= 0 ){
            System.out.println("Porfavor ingresa un numero positivo\n");
        }else{
            int s = n + 100, z;
           for(int i = n; i <=s; i++){
                z = i + n;
                System.out.println("La suma de "+n+" + "+i+" es de: "+z);
           } 
        }
        }while(n < 0);
        System.out.println("FIN");
    }
    
}
