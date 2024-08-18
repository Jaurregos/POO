package ejercicio8.pkg1;

import java.util.*;

public class ListaPersonas {
    
    Vector listaPersonas;
    
    public ListaPersonas() {
        
        listaPersonas = new Vector();
        
    }
    
    public void añadirPersona(Persona p) {
        
        listaPersonas.add(p);
        
    }
    
    public void eliminarPersona(int i) {
        
        listaPersonas.removeElementAt(i);
        
    }
    
    public void borrarLista() {
        
        listaPersonas.removeAllElements();
        
    }
    
}
