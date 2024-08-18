package ejercicio.pkg4.pkg2;

public class Local extends Inmueble {
    
    enum tipo {INTERNO, CALLE};
    
    protected tipo tipoLocal;
    
    public Local(int identificadorInmobilario, int area, String direccion, tipo tipoLocal) {
        
        super(identificadorInmobilario, area, direccion);
        this.tipoLocal = tipoLocal;
        
    }
    
    void imprimir() {
        
        super.imprimir();
        System.out.println("Tipo de local = " + tipoLocal);
        
    }
    
}
