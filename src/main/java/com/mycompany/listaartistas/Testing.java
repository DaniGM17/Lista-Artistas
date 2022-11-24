/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaartistas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author dania
 */
public class Testing {

    public static void escribirArchivo() {
        File archivo = null;
        FileWriter archivoN = null;
        FileReader fr = null;//para leer el archivo
        PrintWriter pw = null;
        BufferedReader bufer2 = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        char respuesta;
        try {
            archivo = new File("C:\\NetBeans\\artistas.txt");
            fr = new FileReader(archivo);
            pw = new PrintWriter(archivo);
            do {
                System.out.println("Escribe el artista: ");
                entrada = bufer2.readLine();
                pw.println(entrada);//Añade la información al archivp
                System.out.println("Escribe n para parar");
                entrada = bufer2.readLine();
                respuesta = entrada.charAt(0);
            } while (respuesta != 'n');
        } catch (Exception e) {
            System.out.println("Error al escribir en archivo");
            e.printStackTrace();
        } finally {
            //Cerrrar el archivo si es que se pudo abrir para escritura
            try {
                //si se logró abrir el archivo, debemos cerrarlo
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                System.out.println("Errir al cerrar el archivo");
                e2.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        BufferedReader buferTeclado = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        String fileName;
        int opcion;
        char seguir;

        System.out.println("Agregando artistas");
        escribirArchivo();
    }
}
