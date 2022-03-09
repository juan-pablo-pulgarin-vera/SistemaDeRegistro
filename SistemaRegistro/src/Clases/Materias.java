package Clases;

import java.util.*;

public class Materias {
    
    static String documentoEstudiante;
    static String documentoProfesor;
    static double nota;
    
    Scanner scan = new Scanner(System.in);

    public void RegistroMaterias(List<String> estudiantes, List<String> profesores){

        
        System.out.print("Ingrese el documento del estudiante al que le va matricular la materia: ");
        documentoEstudiante = scan.next();

        if(estudiantes.contains(documentoEstudiante)){

            System.out.print("Ingrese el documento del profesor: ");
            documentoProfesor = scan.next();
    
            if(profesores.contains(documentoProfesor)){
                try{
                    System.out.println("Ingrese la nota final de la materia: ");
                    nota = scan.nextDouble();

                
                    if(nota < 0.0 || nota > 5.0){
                        System.out.println(new Errores("La nota debe ser mayor a 0.0 y menor a 5.0, de lo contrario se rechazara"));
                    }else{
                      System.out.println("Datos guardados con exito");
                    }
                }catch(Exception e){
                    System.out.println(new Errores("Atención revise:"));
                    System.out.println(new Errores("1.La nota ingresada no tenga punto si no coma para seprar decimales"));
                    System.out.println(new Errores("2.El valor ingresado si es un número"));

                }
            }else{
                System.out.println(new Errores("No hay profesores registrados con este nombre"));
            }
    
        }else{
            System.out.println(new Errores("No hay estudiantes registrados con este nombre"));
        }

       
    }


}
