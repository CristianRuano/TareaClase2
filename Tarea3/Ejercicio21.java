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
public class Ejercicio21 {
     public static void main (String[] args) {
         Scanner x = new Scanner(System.in);
         int n, s =0, r,imp=0,high=0,h=0;//variables utilizadas
         double med=0f;
         System.out.println("Ingresa una serie de numeros (Coloca un numero negativo para terminar)");
         do{
         System.out.print("-> ");
         n = x.nextInt();
         s = s + 1;//se suman todos lo numeros ingresados
         r = n % 2;//seca el residuo de cada numero que se ingresa en el ciclo
         if(r==1&&n>0){
            imp = imp +1; //contamos cuantos numeros impares ingresamos
            h = h + n;//se suma en cada ciclo los numeros impares ingresados
            med = h/imp;//se hace la operacion para sacar la media
         }if(r==0&&n >0){
             high = n;//encontramos el numero mayor par ingresado
         }
         }while(n>0);
          System.out.println("El total de numeros ingresados es de: "+(s-1));
          System.out.println("Se ingresaron "+imp+" numeros impares y la media es de :"+ med);
          System.out.println("El numero par mas grade ingresado es: "+high);
         System.out.println("FIN");
     }
    
}
