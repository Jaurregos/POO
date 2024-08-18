package ejercicio.pkg4.pkg2;

public class Casa extends InmuebleVivienda {
    
    protected int numeroPisos;
    
    public Casa(int identificadorInmobilario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        
        super(identificadorInmobilario, area, direccion, numeroHabitaciones, numeroBaños);
        this.numeroPisos = numeroPisos;
                
    }
    
    void imprimir() {
        
        super.imprimir();
        System.out.println("Numero de pisos = " + numeroPisos);
        
    }
    
}
