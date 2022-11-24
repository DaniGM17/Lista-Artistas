/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaartistas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author dania
 */
public class Testing {

    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        String nombre;
        Acciones acciones = new Acciones();
        

        /*System.out.println("Agregando artistas");
        Acciones.escribirArchivo();*/
 /*System.out.println("Artista a eliminar ");
        entrada = buferTeclado.readLine();        
        Acciones.borrarLinea(entrada);
         */
        System.out.println("Escribe el artista: ");
        entrada = bufer.readLine();
        nombre = entrada;
        Artista unArtista = new Artista(nombre);
        acciones.add(unArtista);
        System.out.println("Escribe el artista: ");
        entrada = bufer.readLine();
        nombre = entrada;
        Artista unArtistal = new Artista(nombre);
        acciones.add(unArtistal);
        acciones.imprimir();
        System.out.println("Escribe el artista: ");
        entrada = bufer.readLine();
        nombre = entrada;
        Artista unArtistaD = new Artista(nombre);
        acciones.remove(unArtistaD);
        acciones.imprimir();
    }
}
