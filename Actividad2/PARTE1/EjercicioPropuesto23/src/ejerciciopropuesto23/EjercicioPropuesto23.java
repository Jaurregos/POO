/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto23;

import java.util.Scanner;

public class EjercicioPropuesto23 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, ecuacion1, ecuacion2;
        
        System.out.println("Ingrese valor de a");
        a = sc.nextDouble();
        
        System.out.println("Ingrese valor de b");
        b = sc.nextDouble();
        
        System.out.println("Ingrese valor de c");
        c = sc.nextDouble();
        
        ecuacion1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a* c)) / (2 * a);
        
        ecuacion2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a* c)) / (2 * a);
        
        System.out.println("Primera Solucion: " + ecuacion1);
        System.out.println("Segunda Solucion: " + ecuacion2);
        
    }
    
}
