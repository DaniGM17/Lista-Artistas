/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaartistas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author dania
 */
public class Acciones {

    public static void escribirArchivo() throws IOException {
        String archivo = "C:\\NetBeans\\artistas.txt";
        FileWriter fw = new FileWriter(archivo, true);
        /*FileWriter (archivo de archivo, agregado booleano): construye un objeto FileWriter
        dado un objeto File. Si el segundo argumento es verdadero, los bytes se escribirán al 
        final del archivo en lugar de al principio.
         */
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        char respuesta;
        try {
            System.out.println("Escribe el artista: ");
            entrada = bufer.readLine();
            fw.write("\n" + entrada);//Añade la información al archivo
        } catch (Exception e) {
            System.out.println("Error al escribir en archivo");
            e.printStackTrace();
        } finally {
            //Cerrrar el archivo si es que se pudo abrir para escritura
            try {
                //si se logró abrir el archivo, debemos cerrarlo
                if (null != archivo) {
                    fw.close();
                }
            } catch (Exception e2) {
                System.out.println("Error al cerrar el archivo");
                e2.printStackTrace();
            }
        }
    }

 public static void borrarLinea(String borrar) {
    try {
      String path = "C:\\NetBeans\\artistas.txt";
      File archivo = new File(path);
      /*Los archivos TMP o archivos temporales son generados por los programas
      o el sistema operativo del ordenador, pero solo existen durante el tiempo que 
      sean necesarios. Una vez se ha cerrado el programa o se ha apagado el ordenador,
      en general se eliminan todos los archivos TMP utilizados. Este tipo de archivos puede reconocerse por la extensión .tmp.*/
      File archivoTemp = new File(archivo+ ".tmp");

      BufferedReader br = new BufferedReader(new FileReader(archivo));
      PrintWriter pw = new PrintWriter(new FileWriter(archivoTemp));

      String linea = null;

      //Copia el contenido del archivo, menos la linea que se indica que se va a borrar
      while ((linea = br.readLine()) != null) {
         /*String.trim() método que borra los carácteres vacíos iniciales y finales de la cadena
          Ejemplo: " Hola!" -> "Hola"
          */
        if (!linea.trim().equals(borrar)) {

          pw.println(linea);
          //flush() cuando no queremos cerrar el archivo, pero sí vacear el bufer
          pw.flush();
        }
      }
      pw.close();
      br.close();

      //Validación de eliminar el archivo orginal
      if (!archivo.delete()) {
        System.out.println("No se pudo eliminar el archivo");
        return;
      }

      //Renombrar el archivo temporal como el archivo original
      if (!archivoTemp.renameTo(archivo))
        System.out.println("No se pudo renombrar el archivo");

    }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}