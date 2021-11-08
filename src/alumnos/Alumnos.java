/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.Gson;

/**
 *
 * @author Maycol
 */
public class Alumnos {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        ObjectOutputStream alumnosDatos = null;
        //datosAlumnos datosalumnos = null;

        //  datosAlumnos datosalumnos ;
        Scanner leer = new Scanner(System.in);
        int opcion;

        System.out.println("datos");

        System.out.println("1. ingrese datos");

        System.out.println("2. análicis de datos");

        System.out.println("3. Salir");

        System.out.println("\n Ingrese opción: ");

        opcion = leer.nextInt();
        char respuesta;
        int cantidadCursos;
        String Datos= ("");

        if (opcion == 1) {
            System.out.println("");
            
            

           /* try {
                alumnosDatos = new ObjectOutputStream(Files.newOutputStream(Paths.get("datos_estudiantes.prj")));
                
                do {
                    
                } while (true);
                
             
            } catch (IOException iOException) {
                System.err.println("Error al ecribir un archivo" + iOException.toString());
            }
           */
              String json ="";
            
            try { BufferedReader buffermi = new BufferedReader(new FileReader("ejemplo.json"));
            String linea = "";
            
          
                while ((linea = buffermi.readLine() )!= null)  {          
                    
                    json += linea;
                    
                }
                buffermi.close();
                
               
            
            
            
                
            } catch (FileNotFoundException e) {
            }
           System.out.println(json);
            
           
            System.out.println("Ingrese Datos de nuevo alumno");
            
                   
                   
          
           
        


        }
       
       
    }

    
}
