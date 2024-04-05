/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg29feb;

import java.util.*; 

public class No17 {

    public static void No17() {
        Scanner sc= new Scanner(System.in); 
        double radio, area, longitud;
        System.out.println("Ingrese el radio del circulo");
        radio = sc.nextDouble();
        area = Math.pow(radio, 2) * Math.PI;
        longitud = 2* Math.PI * radio;
        System.out.println("El área del ciruclo es: " + area);
        System.out.println("La longitud del ciruclo es: " + longitud);
    }
    
}
