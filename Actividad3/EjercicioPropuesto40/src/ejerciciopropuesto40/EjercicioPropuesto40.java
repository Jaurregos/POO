/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto40;

import java.util.Scanner;

public class EjercicioPropuesto40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double raiz, cuadrado, cubo, a;
        
        System.out.print("Inserte numero: ");
        a = sc.nextDouble();
        
        while (a >= 0) {
        
            raiz = Math.sqrt(a);
            cuadrado = Math.pow(a, 2);
            cubo = Math.pow(a, 3);
            
            System.out.println("Numero: " + a + " Raiz: " + raiz + " Cuadrado: " + cuadrado + " Cubo: " + cubo);
            
            System.out.print("Inserte numero: ");
            a = sc.nextDouble();
        
        }
    }
    
}
