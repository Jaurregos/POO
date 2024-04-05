/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto41;

import java.util.Scanner;

public class EjercicioPropuesto41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double mayor, a, b;
        
        b = 0;
        mayor = b;
                
        while (b>=0) {
                    
            System.out.print("Inserte numero(Cierra ciclo con numero negativo): ");
            b = sc.nextDouble();
            
            if (b>=mayor) {
                
                mayor = b;
                
            }
            
        }
        
        System.out.println("El numero mayor es:" + mayor);
        
    }
    
}
