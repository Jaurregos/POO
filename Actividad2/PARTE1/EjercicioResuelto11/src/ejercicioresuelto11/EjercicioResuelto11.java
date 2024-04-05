/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioresuelto11;

import java.util.Scanner;

public class EjercicioResuelto11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, mayor = 0;
        
        System.out.println("Ingrese primer numero");
        a = sc.nextInt();
        
        System.out.println("Ingrese segundo numero");
        b = sc.nextInt();
        while (a == b) {
            System.out.println("El numero debe ser diferente al resto. Ingresa otro numero");
            b = sc.nextInt();
            
        }
        
        System.out.println("Ingrese tercer numero");
        c = sc.nextInt();
        while (c == b || c == a) {
        
            System.out.println("El numero debe ser diferente al resto. Ingresa otro numero");
            c = sc.nextInt();
            
        }
        
        if (a > b && a > c) {
        
            mayor = a;
        
        }
        
        if (b > a && b > c) {
        
            mayor = b;
        
        }
        
        if (c > b && c > a) {
        
            mayor = c;
        
        }
        
        System.out.println("EL VALOR MAYOR ENTRE: " + a + ", " + b + " Y " + c + " ES: " + mayor);
        
    }
    
}
