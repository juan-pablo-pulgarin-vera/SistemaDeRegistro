package Clases;

import java.util.*;

public class Profesores extends Personas{

    String tipoCotrato;
    public List <String> datosPersonales = new ArrayList<>();
    public List <String> docentesGuardados = new ArrayList<>();
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


        System.out.println("Ingrese el tipo su tipo de contrato: TiempoCompleto | Catedra");
        tipoCotrato = scan.next();
        scan.nextLine();

        guardarInformacion();
        guardarDocumentos();
    }
    
    
    @Override
    public void guardarInformacion() {
        
        datosPersonales.add("Tipo Documento: "+ getTipoDocumento() +" Numero Documento: "+ getNumeroDocumento() +
        " Nombre: "+ nombre + " Edad: "+ edad + " Tipo contrato: "+ tipoCotrato);
    }

    public void guardarDocumentos(){
            docentesGuardados.add(getNumeroDocumento());
    }

    public void MostrarRegistros(){
       datosPersonales.forEach((String profesores)-> System.out.println(profesores));
    }
}
