package Clases;

public abstract class Personas{

    private String tipoDocumento;
    private String numeroDocumento;
    public String nombre;
    protected int edad;

    public Personas(){
        tipoDocumento ="CC";
        numeroDocumento= "123456789";
        nombre ="Juan Perez Zapata";
        edad = 25;
    }
  
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public abstract void solicitarDatos();
    public abstract void guardarInformacion();

}