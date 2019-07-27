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
public class Ejercicio22 {
    public static void main (String[] args) {
       Scanner x = new Scanner(System.in);  
       System.out.println("Numeros primos de del 2 al 100");
       
       for(int i = 1; i <100;i++){
           int cont = 0;
       for(int j = 1; j <= i; j++){
            if(i%j==0){
            cont++;}}
            if(cont==2){
            System.out.println(i);
            }}
    }
}
