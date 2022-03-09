import java.util.*;

import Clases.Estudiantes;
import Clases.Materias;
import Clases.Profesores;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int opcion;
        
        Estudiantes student = new Estudiantes();
        Profesores teacher =  new Profesores();
        Materias subject = new Materias();

        do{

            System.out.println("-----------------------------------------------");
            System.out.println("BIENVENIDO AL SISTEMA DE REGISTRO UNIVERSITARIO");
            System.out.println("-----------------------------------------------");
            System.out.println("---------¿QUÉ DESEA HACER EL DIA DE HOY?-------");
            System.out.println("-----------------------------------------------");
            System.out.println("       ___  _____________________________      ");
            System.out.println("       1   | Registrar Un Estudiante     |     ");
            System.out.println("       2   | Registrar Un Docente        |     ");
            System.out.println("       3   | Registrar Una Materia       |     ");
            System.out.println("       0   | Cerrar programa             |     ");
            System.out.println("       ___  _____________________________      ");
            System.out.println("-----------------------------------------------");
            opcion = scan.nextInt();

            switch(opcion){
                case 0: 
                    System.out.println("------------------------------------");
                    System.out.println("Se cerro el programa correctamente");
                    System.out.println("------------------------------------");
                    opcion=0;
                    scan.close();
                 break;
                case 1: 
                    student.solicitarDatos();
                 break;
                case 2: 
                    teacher.solicitarDatos();
                 break;
                case 3: 
                   subject.RegistroMaterias(student.EstudiantesRegistrados, teacher.docentesGuardados);    
                 break;
            }

        }while(opcion != 0);
    }
}
