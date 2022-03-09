package Clases;

public class Errores  extends Exception{
    
    public Errores(String mensaje){
        super("Atención: " + mensaje);
    }
}
