/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea3;


import static Tarea3.Ejercicio18.mayor;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio18 {
    static void mayor(int a, int b){
         int high=0,menor=0;
        if(a>b){
            high = a;  menor = b;
        }else{
            high = b;  menor = a;
        }
        for(int i = menor; i <= high; i+=7){
            System.out.println(i);
        }
    }
    public static void main (String[] args) {
         Scanner x = new Scanner(System.in);
         System.out.println("Ingresa dos numeros distintos con una diferencia mayor a 7 entre ambos");
         System.out.print("1 -> "); int a = x.nextInt();
         System.out.print("2 -> ");int b = x.nextInt();
         if(a==b){
             System.out.println("Debe ingresar numeros distintos");
         }else{
             mayor(a,b);
         }
         
         System.out.println("FIN");
}}
