/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto22;

import java.util.Scanner;

public class EjercicioPropuesto22 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Trabajador trabajador = new Trabajador();
        
        System.out.println("Ingrese nombre del trabajador");
        trabajador.Nombre = sc.next();
        
        System.out.println("Ingrese salario por hora");
        trabajador.SalarioHora = sc.nextDouble();
        
        System.out.println("Ingrese horas trabajadas al mes");
        trabajador.HorasMes = sc.nextInt();
        
        trabajador.SalarioMes = trabajador.SalarioHora * trabajador.HorasMes;
        
        if (trabajador.SalarioMes > 450000) {
            
            System.out.println("Nombre: " + trabajador.Nombre + " salario mensual: $" + trabajador.SalarioMes);
            
        } else {
            
            System.out.println("Nombre: " + trabajador.Nombre);
            
        }
        
    }
    
}
