/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto24;

import java.util.Scanner;

public class EjercicioPropuesto24 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double Bola1, Bola2, Bola3;
        
        System.out.println("Ingrese peso de bola1");
        Bola1 = sc.nextDouble();
        
        System.out.println("Ingrese peso de bola2");
        Bola2 = sc.nextDouble();
        while (Bola1 == Bola2) {
        
            System.out.println("La bolad debe de ser de diferente peso");
            Bola2 = sc.nextDouble();
        
        }
        
        System.out.println("Ingrese peso de bola3");
        Bola3 = sc.nextDouble();
        
        while (Bola1 == Bola3 || Bola2 == Bola3) {
        
            System.out.println("La bolad debe de ser de diferente peso");
            Bola3 = sc.nextDouble();
        
        }
        
        if (Bola1 > Bola2 && Bola1 > Bola3) {
            
            System.out.println("La bola de mayor peso es la Bola1");
            
        } else if (Bola2 > Bola1 && Bola2 > Bola3) {
            
            System.out.println("La bola de mayor peso es la Bola2");
            
        } else {
            
            System.out.println("La bola de mayor peso es la Bola3");
            
        }
        
    }
    
}
