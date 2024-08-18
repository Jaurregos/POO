package ejercicio.pkg4.pkg2;

public class Oficina extends Local {
    
    protected static double valorArea = 3500000;
    
    protected boolean esGobierno;
    
    public Oficina(int identificadorInmobilario, int area, String direccion, tipo tipoLocal, boolean esGobierno) {
        
        super(identificadorInmobilario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
        
    }
    
    void imprimir() {
        
        super.imprimir();
        System.out.println("Es oficina gubernamental = " + esGobierno);
        System.out.println();
        
    }
    
}
