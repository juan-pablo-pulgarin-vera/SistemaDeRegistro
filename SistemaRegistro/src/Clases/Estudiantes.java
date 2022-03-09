package Clases;

import java.util.*;

public class Estudiantes extends Personas{
  
    String semestre; 
    public List <String> datosPersonales = new ArrayList<>();
    public List <String> EstudiantesRegistrados = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
  

    @Override
    public void solicitarDatos() {
        
        System.out.println("Ingrese su tipo de documento: CC | TI");
        setTipoDocumento(scan.next());
        
      
        
        System.out.println("Ingrese el número de documento: ");
        setNumeroDocumento(scan.next());

        try{

            System.out.println("Ingrese su nombre: ");
            nombre = scan.next();
            scan.nextLine();

        }catch(Exception e){
            System.out.println(new Errores("Por favor copiar su nombre sin espacios"));
        }

        try{

            System.out.println("Ingrese su edad: ");
            edad = scan.nextInt();

        }catch(Exception e){
            System.out.println(new Errores("la edad debe ser un valor numerico"));
            scan.nextLine();
        }


        System.out.println("Ingrese el semestre que esta cursando: ");
        semestre = scan.next();

        guardarInformacion();
        guardarDocumentos();
    }
    
    @Override
    public void guardarInformacion() {
        
        datosPersonales.add("Tipo Documento: "+ getTipoDocumento() +" Numero Documento: "+ getNumeroDocumento() +
        " Nombre: "+ nombre + " Edad: "+ edad + " Semestre: "+ semestre);
    }

    public void guardarDocumentos(){
        EstudiantesRegistrados.add(getNumeroDocumento());
    }

    public void MostrarRegistros(){
       datosPersonales.forEach((String estudiantes)-> System.out.println(estudiantes));
    }
}
