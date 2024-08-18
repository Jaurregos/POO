package ejercicio.pkg4.pkg2;

public class Inmueble {
    
    protected int identificadorInmobilario;
    protected int area;
    protected String direccion;
    protected double precioVenta;
    
    Inmueble(int identificadorInmobilario, int area, String direccion) {
        
        this.identificadorInmobilario = identificadorInmobilario;
        this.area = area;
        this.direccion = direccion;
        
    }
    
    double calcularPrecioVenta(double valorArea) {
        
        precioVenta = area * valorArea;
        return precioVenta;
        
    }
    
    void imprimir() {
        
        System.out.println("Identificador inmobilario = " + identificadorInmobilario);
        System.out.println("Area = " + area);
        System.out.println("Direccion = " + direccion);
        System.out.println("Precio de venta = $" + precioVenta);
        
    }
    
}
