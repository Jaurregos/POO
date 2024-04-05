/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioresuelto13;

import java.util.Scanner;

public class EjercicioResuelto13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double ValorCompra, ValorPagar, Descuento;
        String Color;
        
        System.out.println("Ingrese valor de compra");
        ValorCompra = sc.nextDouble();
        
        System.out.println("Ingrese color de bola");
        Color = sc.next();
        
        Color = Color.toUpperCase();
        
        if ("BLANCO".equals(Color.toUpperCase())) {
        
            Descuento = 0;
        
        } else {
        
            if ("VERDE".equals(Color.toUpperCase())) {
        
            Descuento = 10;
        
            } else {
        
                if ("AMARILLO".equals(Color.toUpperCase())) {
        
                    Descuento = 25;
        
                } else {
                    
                    if ("AZUL".equals(Color.toUpperCase())) {
        
                        Descuento = 50;
        
                    } else {
                        
                        Descuento = 100;
                        
                    }
   
                    }
                    
                }
                
        }
        
        ValorPagar = ValorCompra - Descuento * ValorCompra / 100;
        
        System.out.println("El cliente debe pagar: $" +  ValorPagar);
        
    }
    
}
