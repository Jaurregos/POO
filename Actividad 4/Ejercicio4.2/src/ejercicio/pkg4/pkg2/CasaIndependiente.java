package ejercicio.pkg4.pkg2;

public class CasaIndependiente extends CasaUrbana {
    
    protected static double valorArea = 3000000;
    
    public CasaIndependiente(int identificadorInmobilario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        
        super(identificadorInmobilario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        
    }
    
    void imprimir() {
        
        super.imprimir();
        System.out.println();
        
    }
    
}
