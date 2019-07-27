/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio11 {
    public static void main (String[] args) {
    Scanner read = new Scanner(System.in);
    int h,m,r;
    
    System.out.print("Ingrese La Hora Actual (Solo Se Permite Ingresarla En Horario De 24 Horas): ");
    h = read.nextInt();
    
    System.out.print("Ingrese Los Minutos Actuales: ");
    m = read.nextInt();
    
    if (h >= 25)
    {
    System.out.println("La Hora Ingresa No Es Valida");   
    }
    
    if (m >= 61)
    {
    System.out.println("Los Minutos Ingresados No Son Validos");   
    }
    
    int segundosTranscurridos = (h * 3600) + (m * 60);
    r = (24 * 3600) - segundosTranscurridos;
    
    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos", h, m, r,"\n");
  } 
}
