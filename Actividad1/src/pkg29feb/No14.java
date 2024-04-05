/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pkg29feb;

import java.util.*;  

public class No14 {

    public static void No14() {
        Scanner sc= new Scanner(System.in); 
        double n, cuadrado, cubo;  
        System.out.println("Ingresa un número");
        n = sc.nextDouble();
        cuadrado = Math.pow(n, 2);
        cubo = Math.pow(n, 3);
        System.out.println("El caudrado del número es: " + cuadrado);
        System.out.println("El cubo del número es: " + cubo);
    }
    
}
