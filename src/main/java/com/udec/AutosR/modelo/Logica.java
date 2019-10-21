/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.AutosR.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author JUAN DAVID REYES
 * @author ALEANDRO TORRES
 */
public class Logica {
    
    private String nombre;
    /**
     * atributo con el nombre que usara la clase automovil
     */
    private String marca;
    /**
     * atributo marca de el auto que se envia a el controlador
     */
    private String modelo;
    /**
     * atributo modelo que se usa en la clse controlador
     */
    
    /**
     * constructor de la clase con sus atributos
     * @param nombre
     * @param marca
     * @param modelo 
     */
    public Logica(String nombre, String marca, String modelo) {
        this.nombre = nombre;
        this.marca = marca;      
        this.modelo = modelo;
    }
    /**
     * metodo que retorna el nombre de el propietario de el auto
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * metodo con el parametro nombre de el auto
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo que retorna la marca de el auto
     * @return 
     */
    public String getMarca() {
        return marca;
    }
    /**
     * metodo con el paramatro marca de el auto
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * metodo que retorna el modelo de el auto
     * @return 
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * metodo con el parametro modelo de el auto
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}

