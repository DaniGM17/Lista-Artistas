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
    LinkedList<Album> albunes;

    public Artista(String name){
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Album> getAlbunes() {
        return albunes;
    }

    public void setAlbunes(LinkedList<Album> albunes) {
        this.albunes = albunes;
    }

    

}
