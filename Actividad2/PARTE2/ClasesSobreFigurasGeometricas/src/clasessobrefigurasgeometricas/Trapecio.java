/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasessobrefigurasgeometricas;

public class Trapecio {
    double Lado;
    double Altura;
    double BaseMayor;
    double BaseMenor;
    
    public Trapecio(double Lado, double Altura, double BaseMayor, double BaseMenor){
        
        this.Altura = Altura;
        this.BaseMayor = BaseMayor;
        this.BaseMenor = BaseMenor;
        this.Lado = Lado;
        
    }
    
    double calcularArea(){
        
        return ((BaseMayor + BaseMenor) / 2) * Altura;
        
    }
    
    double calcularPerimetro(){
        
        return BaseMayor + BaseMenor + 2 * Lado;
        
    }
    
}
