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
public class Ejercicio8 {
    public static void main (String[] args) {
        Scanner x = new Scanner (System.in);
        int horas, salario, sh = 12;
        System.out.print("Numero de horas de trabajo a la semana: "); 
        horas = x.nextInt();
        salario = horas * sh;
        System.out.println("Su salario semanal es de: " + salario + " Euros");
    }
}
