/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioresuelto7;

import java.util.Scanner;

public class EjercicioResuelto7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a, b;
        
        System.out.println("Ingrese valor de A");
        a = sc.nextDouble();
        
        System.out.println("Ingrese valor de B");
        b = sc.nextDouble();
        
        if (a > b) {
            System.out.println("A es mayor que B");
        } else if (a == b) {
            System.out.println("A es igual a B");
        } else {
            System.out.println("A es menor que B");
        }
        
    }
    
}
