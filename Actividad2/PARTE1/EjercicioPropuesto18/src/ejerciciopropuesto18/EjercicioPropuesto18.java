/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto18;

import java.util.Scanner;

public class EjercicioPropuesto18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Empleado empleado = new Empleado();
        
        System.out.println("Ingrese id de empleado:");
        empleado.Id = sc.nextInt();
        
        System.out.println("Ingrese nombre del empleado");
        empleado.Nombre = sc.next();
        
        System.out.println("Ingrese horas trabajadas al mes por el empleado");
        empleado.HorasTrabajoMes = sc.nextDouble();
        
        System.out.println("Ingrese valor de horas");
        empleado.ValorHora = sc.nextDouble();
        
        System.out.println("Ingrese en porcentaje la retencion del empleado");
        empleado.Retencion = sc.nextDouble();
        
        empleado.SalarioBruto = empleado.HorasTrabajoMes * empleado.ValorHora;
        
        empleado.SalarioNeto = empleado.SalarioBruto - (empleado.SalarioBruto * empleado.Retencion / 100);
        
        System.out.println("EMPLEADO");
        System.out.println("Codigo: " + empleado.Id);
        System.out.println("Nombre: " + empleado.Nombre);
        System.out.println("Salario Bruto: " + empleado.SalarioBruto);
        System.out.println("Salario Neto: " + empleado.SalarioNeto);
    }
    
}
