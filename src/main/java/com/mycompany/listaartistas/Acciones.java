/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaartistas;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

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
                fw.write("\n"+entrada);//Añade la información al archivo
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
}
