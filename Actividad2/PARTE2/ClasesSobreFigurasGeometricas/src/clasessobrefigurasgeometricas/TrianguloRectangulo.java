/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasessobrefigurasgeometricas;

public class TrianguloRectangulo {
    
    int Base;
    int Altura;
    
    public TrianguloRectangulo(int Base, int Altura){
        
        this.Base = Base;
        this.Altura = Altura;
        
    }
    
    double calcularArea(){
        
        return (Base * Altura) / 2;
        
    }
    
    double calcularPerimetro(){
        
        return (Base + Altura + calcularHipotenusa());
        
    }
    
    double calcularHipotenusa(){
        
        return Math.pow(Base * Base + Altura * Altura, 0.5);
        
    }
    
    void determinarTipoTriangulo(){
        
        if ((Base == Altura) && (Base == calcularHipotenusa())) {
            
            System.out.println("Es un triangulo equilatero");
            
        } else if ((Base != Altura) && (Base != calcularHipotenusa() && (Altura != calcularHipotenusa()))){
            
            System.out.println("Es un triangulo escaleno");
            
        } else {
            
            System.out.println("Es un triangulo isosceles");
            
        }
        
    }
    
}
