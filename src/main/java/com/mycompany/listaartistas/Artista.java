/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaartistas;

import java.util.LinkedList;

/**
 *
 * @author dania
 */
public class Artista {

    private String name;
    private String nacionalidad;
    LinkedList<Album> albunes;

    public Artista(String nom, String nac, Album albunes) {
        this.name = nom;
        this.nacionalidad = nac;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public LinkedList<Album> getAlbunes() {
        return albunes;
    }

    public void setAlbunes(LinkedList<Album> albunes) {
        this.albunes = albunes;
    }

}
