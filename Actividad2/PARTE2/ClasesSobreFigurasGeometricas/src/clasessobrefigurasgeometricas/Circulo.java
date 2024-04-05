/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasessobrefigurasgeometricas;

public class Circulo {
    
    int Radio;
    
    Circulo(int Radio){
        
        this.Radio = Radio;
        
    }
    
    double calcularArea(){
        
        return Math.PI * Math.pow(Radio, 2);
        
    }
    
    double calcularPerimetro() {
        
        return 2 * Math.PI * Radio;
        
    }
    
}
