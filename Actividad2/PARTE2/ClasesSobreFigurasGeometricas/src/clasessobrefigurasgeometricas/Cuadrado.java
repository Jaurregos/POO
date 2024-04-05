/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasessobrefigurasgeometricas;

public class Cuadrado {
    int Lado;
    
    public Cuadrado(int Lado){
        
        this.Lado = Lado;
        
    }
    
    double calcularArea(){
        
        return Lado * Lado;
        
    }
    
    double calcularPerimetro(){
        
        return Lado * 4;
        
    }
    
}
