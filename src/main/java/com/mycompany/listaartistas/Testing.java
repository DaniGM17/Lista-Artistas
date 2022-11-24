/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaartistas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author dania
 */
public class Testing {

    public static void main(String[] args) throws IOException {
        BufferedReader buferTeclado = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        /*System.out.println("Agregando artistas");
        Acciones.escribirArchivo();*/
        System.out.println("Artista a eliminar ");
        entrada = buferTeclado.readLine();        
        Acciones.borrarLinea(entrada);

    }
}
