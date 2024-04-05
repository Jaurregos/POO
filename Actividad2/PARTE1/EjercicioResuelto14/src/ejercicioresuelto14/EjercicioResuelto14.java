/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioresuelto14;

import java.util.Scanner;

public class EjercicioResuelto14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double VD1, VD2, VD3, VTOTAL, PORVEN, SALARIO, SALAR1, SALAR2, SALAR3;
        
        System.out.println("Ventas Departamento1:");
        VD1 = sc.nextDouble();
        
        System.out.println("Ventas Departamento2:");
        VD2 = sc.nextDouble();
        
        System.out.println("Ventas Departamento3:");
        VD3 = sc.nextDouble();
        
        System.out.println("Salario:");
        SALARIO = sc.nextDouble();
        
        VTOTAL = VD1 + VD2 + VD3;
        
        PORVEN = VTOTAL * 0.33;
        
        if (VD1 > PORVEN) {
        
            SALAR1 = SALARIO + 0.2 * SALARIO;
        
        } else {
            
            SALAR1 = SALARIO;
            
        }
        
        if (VD2 > PORVEN) {
        
            SALAR2 = SALARIO + 0.2 * SALARIO;
        
        } else {
            
            SALAR2 = SALARIO;
            
        }
        
        if (VD3 > PORVEN) {
        
            SALAR3 = SALARIO + 0.2 * SALARIO;
        
        } else {
            
            SALAR3 = SALARIO;
            
        }
        
        System.out.println("SALARIO VENDEDORES DEPTO. 1: $" + SALAR1);
        System.out.println("SALARIO VENDEDORES DEPTO. 2: $" + SALAR2);
        System.out.println("SALARIO VENDEDORES DEPTO. 3: $" + SALAR3);
        
    }
    
}
