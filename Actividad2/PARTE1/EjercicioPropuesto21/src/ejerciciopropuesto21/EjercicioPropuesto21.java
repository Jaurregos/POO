/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto21;

import java.util.Scanner;

public class EjercicioPropuesto21 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double lado1, lado2, lado3, perimetro,semiperimetro, area;
        
        System.out.println("Ingrese medida del lado 1");
        lado1 = sc.nextDouble();
        
        System.out.println("Ingrese medida del lado 2");
        lado2 = sc.nextDouble();
        
        System.out.println("Ingrese medida del lado 3");
        lado3 = sc.nextDouble();
        
        perimetro = lado1 + lado2 + lado3;
        
        semiperimetro = perimetro / 2;
        
        area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Semiperimetro:" + semiperimetro);
        System.out.println("Area: " + area);
    }
    
}
