/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioresuelto12;

import java.util.Scanner;

public class EjercicioResuelto12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int HorasExtras8;
        
        Trabajador trabajador = new Trabajador();
        
        System.out.println("Ingrese nombre del trabajador");
        trabajador.Nombre = sc.next();
        
        System.out.println("Ingrese numero de horas trabajadas");
        trabajador.HorasTrabajadas = sc.nextInt();
        
        System.out.println("Ingrese valor de hora");
        trabajador.ValorHora = sc.nextDouble();
        
        if (trabajador.HorasTrabajadas > 40) {
        
            trabajador.HorasExtras = trabajador.HorasTrabajadas - 40;
            
            if (trabajador.HorasExtras > 8) {
            
                HorasExtras8 = trabajador.HorasExtras - 8;
                trabajador.SalarioDevengado = 40 * trabajador.ValorHora + 16 * trabajador.ValorHora + HorasExtras8 * 3 * trabajador.ValorHora;
                
            } else {
            
                trabajador.SalarioDevengado = 40 * trabajador.ValorHora + trabajador.HorasExtras * 2 *trabajador.ValorHora;
                
            }
            
        } else {
        
            trabajador.SalarioDevengado = 40 * trabajador.ValorHora;
            
        }
        
        System.out.println("EL TRABAJADOR " + trabajador.Nombre + " DEVENGO: $" + trabajador.SalarioDevengado);
        
    }
    
}
