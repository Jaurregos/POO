/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto19;

import java.util.Scanner;

public class EjercicioPropuesto19 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double lado, perimetro, altura, area;
        
        System.out.println("Ingrese medida de lado de un triangulo equilatero");
        lado = sc.nextDouble();
        
        perimetro = lado * 3;
        
        altura = Math.sqrt(Math.pow(lado, 2) - Math.pow(( lado /2 ), 2));
        
        area = lado * altura / 2;
        
        System.out.println("Perimentro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + area);
    }
    
}
