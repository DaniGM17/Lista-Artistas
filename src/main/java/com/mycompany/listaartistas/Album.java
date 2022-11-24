/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaartistas;

import static com.mycompany.listaartistas.Acciones.escribirArchivo;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author dania
 */
public class Album {

    private String nombre;
    ArrayList<Song> songs;

    public Album(String nombre) {
        this.nombre = nombre;
        songs = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void add(Song cancion) {
        this.songs.add(cancion);
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public Song getSong(int po){
        return songs.get(po);
    }

}
