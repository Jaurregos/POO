/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg29feb;

public class No12 {

    public static void No12() {
        double horas, shora, neto, bruto, reten;
        
        horas = 48;
        shora = 5000;
        bruto = horas * shora;
        reten = 12.5/100 * bruto;
        neto = bruto - reten;
        System.out.println("El salario bruto del trabajador es: " + bruto );
        System.out.println("La retencion en la fuente es de: " + reten );
        System.out.println("El salario neto del trabajador es: " + neto );
    }
    
}
