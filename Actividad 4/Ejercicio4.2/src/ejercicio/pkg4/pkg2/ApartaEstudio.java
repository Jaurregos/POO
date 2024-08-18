package ejercicio.pkg4.pkg2;

public class ApartaEstudio extends Apartamento {
    
    protected static double valorArea = 1500000;
    
    public ApartaEstudio(int identificadorInmobilario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        
        super(identificadorInmobilario, area, direccion, numeroHabitaciones, numeroBaños);
        
    }
    
    void imprimir() {
        
        super.imprimir();
        System.out.println();
        
    }
    
}
