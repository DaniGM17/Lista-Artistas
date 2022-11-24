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
        LinkedList<Artista> lista = new LinkedList<Artista>();
        Acciones acciones = new Acciones();

        System.out.println("BIENVENIDO A TU A BIBILIOTECA DE CANCIONES");
        System.out.println("¿Qué deseas hacer hoy?");
        do {
            System.out.println("1.- Agregar a un nuevo artista");
            System.out.println("2.-Eliminar a un artista");
            System.out.println("3.-Agregar un nuevo albúm");
            System.out.println("4.-Eliminar un albúm");
            System.out.println("5.-Agregar una nueva canción");
            System.out.println("6.-Eliminar una canción");
            System.out.println("7.-Ver la lista de artistas");
            System.out.println("8.- Ver la lista de albúmes por artista");
            System.out.println("9.-Ver la lista de canciones por albúmes");
            entrada = bufer.readLine();
            op = Integer.parseInt(entrada);

            switch (op) {
                case 1: //Agregar un artista
                    System.out.println("Escribe el artista: ");
                    entrada = bufer.readLine();
                    nombre = entrada;
                    Artista unArtista = new Artista(nombre);
                    lista.add(unArtista);
                    break;
                case 2: //Eliminar un artista
                    System.out.println("Tus artistas:");
                    //debo hacer un for para imprimir todos los artistas en lista
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("" + lista.get(i).getName().toString());
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pf = Integer.parseInt(entrada);
                    lista.remove(pf);
                    break;
                case 3://Agregar un album
                    System.out.println("Tus artistas:");
                    //debo hacer un for para imprimir todos los artistas en lista
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("" + lista.get(i).getName().toString());
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pi = Integer.parseInt(entrada);
                    Artista al = lista.get(pi); //Recupere el artista
                    System.out.println("Escribe el albúm: ");
                    entrada = bufer.readLine();
                    album = entrada;
                    Album unAlbum = new Album(album);
                    //acciones.add(unAlbum, nombre);
                    al.add(unAlbum);
                    break;
                case 4://Eliminar un album
                    System.out.println("Tus artistas:");
                    //debo hacer un for para imprimir todos los artistas en lista
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("" + lista.get(i).getName().toString());
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pv = Integer.parseInt(entrada);
                    Artista av = lista.get(pv); //Recupere el artista
                    //Imprime los albunes de ese artista
                    System.out.println("Sus albúmes:");
                    for (int i = 0; i < av.albunes.size(); i++) {
                        System.out.println("" + av.albunes.get(i).getNombre().toString());
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pw = Integer.parseInt(entrada);
                    av.albunes.remove(pw);
                break;
                case 5://Agregar una cancion
                    System.out.println("Tus artistas:");
                    //debo hacer un for para imprimir todos los artistas en lista
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("" + lista.get(i).getName().toString());
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int p = Integer.parseInt(entrada);
                    Artista a = lista.get(p); //Recupere el artista
                    //Imprime los albunes de ese artista
                    System.out.println("Sus albúmes:");
                    for (int i = 0; i < a.albunes.size(); i++) {
                        System.out.println("" + a.albunes.get(i).getNombre().toString());
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    p = Integer.parseInt(entrada);
                    Album b = a.getAlbuM(p);//Recupero un album especifico de un artista
                    System.out.println("Escribe el nombre de la canción");
                    entrada = bufer.readLine();
                    cancion = entrada;
                    Song unaCancion = new Song(cancion);
                    b.add(unaCancion);
                    break;
                case 6://Eliminar cancion
                    System.out.println("Tus artistas:");
                    //debo hacer un for para imprimir todos los artistas en lista
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("" + lista.get(i).getName().toString());
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pq = Integer.parseInt(entrada);
                    Artista aq = lista.get(pq); //Recupere el artista
                    //Imprime los albunes de ese artista
                    System.out.println("Sus albúmes:");
                    for (int i = 0; i < aq.albunes.size(); i++) {
                        System.out.println("" + aq.albunes.get(i).getNombre().toString());
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    pq = Integer.parseInt(entrada);
                    Album c = aq.getAlbuM(pq);//Recupero un album especifico de un artista
                    System.out.println("Sus canciones:");
                    for (int i = 0; i < c.songs.size(); i++) {
                        System.out.println("" + c.songs.get(i).getTitulo().toString());
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pñ = Integer.parseInt(entrada);
                    c.songs.remove(pñ);
                break;
                case 7:
                    System.out.println("Tus artistas:");
                    //debo hacer un for para imprimir todos los artistas en lista
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("" + lista.get(i).getName().toString());
                    }
                    break;
                case 8:
                    System.out.println("Tus artistas:");
                    //debo hacer un for para imprimir todos los artistas en lista
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("" + lista.get(i).getName().toString());
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pu = Integer.parseInt(entrada);
                    Artista ab = lista.get(pu); //Recupere el artista
                    //Imprime los albunes de ese artista
                    System.out.println("Sus albúmes:");
                    for (int i = 0; i < ab.albunes.size(); i++) {
                        System.out.println("" + ab.albunes.get(i).getNombre().toString());
                    }
                    break;
                case 9:
                    System.out.println("Tus artistas:");
                    //debo hacer un for para imprimir todos los artistas en lista
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("" + lista.get(i).getName().toString());
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    int pl = Integer.parseInt(entrada);
                    Artista ax = lista.get(pl); //Recupere el artista
                    //Imprime los albunes de ese artista
                    System.out.println("Sus albúmes:");
                    for (int i = 0; i < ax.albunes.size(); i++) {
                        System.out.println("" + ax.albunes.get(i).getNombre().toString());
                    }
                    System.out.println("Escribe la posición ");
                    entrada = bufer.readLine();
                    pq = Integer.parseInt(entrada);
                    Album d = ax.getAlbuM(pl);//Recupero un album especifico de un artista
                    System.out.println("Sus canciones:");
                    for (int i = 0; i < d.songs.size(); i++) {
                        System.out.println("" + d.songs.get(i).getTitulo().toString());
                    }
                    break;
            }
            System.out.println("¿Quieres realizar otra acción?");
            entrada = bufer.readLine();
            re = entrada.charAt(0);
        } while (re == 'Y' || re == 'y');
    }
}
