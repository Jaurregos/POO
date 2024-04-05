/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioresuelto10;

import java.util.Scanner;

public class EjercicioResuelto10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Estudiante estudiante = new Estudiante();
        
        System.out.println("Ingrese Numero De inscripcion");
        estudiante.NumeroInscripcion = sc.nextInt();
        
        System.out.println("Ingrese Nombre");
        estudiante.Nombre = sc.next();
        
        System.out.println("Ingrese Patrimonio");
        estudiante.Patrimonio = sc.nextDouble();
        
        System.out.println("Ingrese Estrato");
        estudiante.EstratoSocial = sc.nextInt();
        
        estudiante.PagoMatricula = 50000;
        
        if (estudiante.Patrimonio > 2000000 && estudiante.EstratoSocial > 3) {
        
            estudiante.PagoMatricula = estudiante.PagoMatricula + 0.03 * estudiante.Patrimonio;}
        
        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + estudiante.NumeroInscripcion +  " Y NOMBRE " + estudiante.Nombre + " DEBE PAGAR: $" + estudiante.PagoMatricula);
        
    }
    
}
