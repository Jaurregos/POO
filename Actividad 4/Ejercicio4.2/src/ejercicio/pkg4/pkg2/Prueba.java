package ejercicio.pkg4.pkg2;

public class Prueba {

    public static void main(String[] args) {
        
        ApartamentoFamiliar apt1 = new ApartamentoFamiliar(103067, 120, "Avenida Santander 45-45", 3, 2, 200000);
        System.out.println("Datos apartamento");
        apt1.calcularPrecioVenta(apt1.valorArea);
        apt1.imprimir();
        
        ApartaEstudio aptEst1 = new ApartaEstudio(12354, 50, "Avenida Caracas 30-15", 1, 1);
        aptEst1.calcularPrecioVenta(aptEst1.valorArea);
        aptEst1.imprimir();

    }
    
}
