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
public class Ejercicio15 {
     public static void main (String[] args) {
         Scanner x = new Scanner(System.in);
         
         System.out.println("Ingrese numeros enteros para calcular potencias");
         try{
         System.out.print("Base -> ");
         int base = x.nextInt();
         int n=1;
         
         System.out.print("Exponente -> ");
         int exponent = x.nextInt();

         for(int i = 1; i <= exponent;i++){
            n = n * base;//n se multiplica por el valor de la base y se incrementa por si mismo en cada ciclo
            System.out.println("El resultado de "+base+" elevado a "+i+" es :"+n);
         }
         
         }catch(Exception e){
             System.out.println("Debe ingresar un numero entero");
         }   
}
}
