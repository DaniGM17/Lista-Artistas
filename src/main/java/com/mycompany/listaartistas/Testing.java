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
        String album;
        String cancion;
        int op;
        char re;
        Acciones acciones = new Acciones();

        System.out.println("BIENVENIDO A TU A BIBILIOTECA DE CANCIONES");
        System.out.println("¿Qué deseas hacer hoy?");
        do {
            System.out.println("1.- Agregar a un nuevo artista");
            System.out.println("2.-Eliminar a un artista");
            System.out.println("3.-Agregar un nuevo albúm");
            System.out.println("4.-Agregar una nueva canción");
            System.out.println("5.-Ver la lista de artistas");
            System.out.println("6.- Ver la lista de albúmes por artista");
            System.out.println("7.-Ver la lista de canciones por albúmes");
            System.out.println("8.-Ver la lista de artistas agregados recientemente");
            entrada = bufer.readLine();
            op = Integer.parseInt(entrada);

            switch (op) {
                case 1:
                    System.out.println("Escribe el artista: ");
                    entrada = bufer.readLine();
                    nombre = entrada;
                    Artista unArtista = new Artista(nombre);
                    acciones.add(unArtista);
                    break;
                case 2:
                    System.out.println("Escribe el artista: ");
                    entrada = bufer.readLine();
                    nombre = entrada;
                    Artista unArtistaR = new Artista(nombre);
                    acciones.remove(unArtistaR);
                    break;
                case 3:
                    System.out.println("Tus artistas:");
                    acciones.leerArchivos("artistas");
                    System.out.println("Escribe el artista: ");
                    entrada = bufer.readLine();
                    nombre = entrada;
                    System.out.println("Escribe el albúm: ");
                    entrada = bufer.readLine();
                    album = entrada;
                   Album unAlbum = new Album(album);
                    acciones.add(unAlbum, nombre);
                    break;
                case 4:
                    System.out.println("Tus artistas:");
                    acciones.leerArchivos("artistas");
                    System.out.println("Escribe el artista: ");
                    entrada = bufer.readLine();
                    nombre = entrada;
                    acciones.leerArchivos(nombre);
                    System.out.println("Escribe el albúm: ");
                    entrada = bufer.readLine();
                    album = entrada;
                    acciones.leerArchivos(album);
                    System.out.println("Escribe el nombre de la canción");
                    entrada = bufer.readLine();
                    cancion = entrada;
                    Song unaCancion = new Song(cancion);
                    acciones.add(unaCancion, album);
                    break;
                case 5:
                    acciones.leerArchivos("artistas");
                    break;
                case 6:
                    System.out.println("Escribe el artista: ");
                    entrada = bufer.readLine();
                    nombre = entrada;
                    acciones.leerArchivos(nombre);
                    break;
                case 7:
                    System.out.println("Escribe el album: ");
                    entrada = bufer.readLine();
                    nombre = entrada;
                    acciones.leerArchivos(nombre);
                    break;
                case 8:
                    acciones.imprimir();
                    break;
            }
            System.out.println("¿Quieres realizar otra acción?");
            entrada = bufer.readLine();
            re = entrada.charAt(0);
        } while (re == 'Y' || re == 'y');
    }
}
