/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasessobrefigurasgeometricas;

public class Rombo {
    double Lado;
    double DiagonalMayor;
    double DiagonalMenor;
    
    public Rombo(double Lado, double DiagonalMayor, double DiagonalMenor){
    
        this.Lado = Lado;
        this.DiagonalMayor = DiagonalMayor;
        this.DiagonalMenor = DiagonalMenor;
    
    }
    
    double calcularArea(){
        
        return (DiagonalMayor * DiagonalMenor) / 2;
        
    }
    
    double calcularPerimetro(){
        
        return (Lado * 4);
        
    }
    
}
