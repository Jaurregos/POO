/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasessobrefigurasgeometricas;

public class Rectangulo {
    
    int Base;
    int Altura;
    
    Rectangulo(int Base, int Altura){
        
        this.Base = Base;
        this.Altura = Altura;
        
    }
    
    double calcularArea(){
    
        return Base * Altura;
    
    }
    
    double calcularPerimetro(){
        
        return (2 * Base) + (2 * Altura);
        
    }
    
}
