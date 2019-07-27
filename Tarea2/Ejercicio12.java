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
public class Ejercicio12 {
     public static void main (String[] args) {
     Scanner read = new Scanner(System.in);
    int puntos = 0;
    String respuesta;
    
    System.out.println("1. ¿Cuanto es 1+1?"); 
    System.out.println("a) 3\nb) 2\nc) 4"); 
    System.out.print("Respuesta: ");
    respuesta = read.next();
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("2. ¿Cuanto es 5*5?");
    System.out.println("a) 10\nb) 20\nc) 25"); 
    System.out.print("Respuesta: ");
    respuesta = read.next();
    if (respuesta.equals("c")) {
      puntos++;
    }

    System.out.println("3. ¿Cuanto es 10/2?");
    System.out.println("a) 5\nb) 12\nc) 8"); 
    System.out.print("Respuesta: ");
    respuesta = read.next();
    if (respuesta.equals("a")) {
      puntos++;
    }

    System.out.println("4. ¿Cuanto es 20-15?");
    System.out.println("a) 35\nb) 5\nc) 25"); 
    System.out.print("Respuesta: ");
    respuesta = read.next();
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("5. ¿Cuanto es 2*8?");
    System.out.println("a) 2 \nb) 1\nc) 16"); 
    System.out.print("Respuesta: ");
    respuesta = read.next();
    if (respuesta.equals("c")) {
      puntos++;
    }

    System.out.println("6. ¿Cuanto es 100*1?");
    System.out.println("a) 100 \nb) 99\nc) 101"); 
    System.out.print("Respuesta: ");
    respuesta = read.next();
    if (respuesta.equals("a")) {
      puntos++;
    }

    System.out.println("7. ¿Cuanto es 50*0?");
    System.out.println("a) 50\nb) 0\nc) 49"); 
    System.out.print("Respuesta: ");
    respuesta = read.next();
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("8. ¿Cuanto es 25+0?");
    System.out.println("a) 24\nb) 26\nc) 25"); 
    System.out.print("Respuesta: ");
    respuesta = read.next();
    if (respuesta.equals("c")) {
      puntos++;
    }

    System.out.println("9. ¿Cuanto es 30-0?");
    System.out.println("a) 30\nb) 300\nc) 20"); 
    System.out.print("Respuesta: ");
    respuesta = read.next();
    if (respuesta.equals("a")) {
      puntos++;
    }

    System.out.println("10. ¿Cuanto es 10/0?");
    System.out.println("a) 10\nb) 0\nc) 5"); 
    System.out.print("Respuesta: ");
    respuesta = read.next();
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("\nHas obtenido " + puntos + " puntos.");
  }
}
