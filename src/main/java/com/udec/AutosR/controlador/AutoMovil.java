/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.AutosR.controlador;

import com.udec.AutosR.modelo.Logica;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;

/**
 *
 * @author JUAN DAVID REYES
 * @author ALEJANDRO TORRES
 */
@Named(value = "autoMovil")
@ViewScoped
public class AutoMovil implements Serializable{
   /**
    * atributo con el nombre de la persona
    */
    private String nombre;
    /**
     * atributo con la marca de el atomovil
     */
    private String marca;
    /**
     * atributo con el modelo de el automovil
     */
    private String modelo;
    /**
     * lista con las marcas de los autos en el combox
     */   
    private List<Logica> filtros;
     /**
     * lista con la cual se filtran cada uno de los atributos
     */
    private List<String> marcas;
    /**
     * lista con el  modelo de el autoen el combox
     */
    private List<String> modeloo;
    /**
     * lista con todos los datos a ingresar
     */
    private List<Logica> datos;
   
    /**
     * lista datos con los datos de los autos
     * lista marcas que estar en el combos
     * lista modelo con los modelos a escojer de los autos
     * constructor de la clase que inicializa los modelos y marcas de autos y al añadir a las
     * listas
     */
     @PostConstruct
    public void añadir(){
        datos=new ArrayList<>();
        marcas=new ArrayList<>();
        modeloo= new ArrayList<>();
        modeloo.add("2000");
        modeloo.add("2001");
        modeloo.add("2002");
        modeloo.add("2003");
        modeloo.add("2004");
        modeloo.add("2005");
        modeloo.add("2006");
        modeloo.add("2007");
        modeloo.add("2008");
        modeloo.add("2009");
        modeloo.add("2010");
        modeloo.add("2011");
        modeloo.add("2012");
        modeloo.add("2013");
        modeloo.add("2014");
        modeloo.add("2015");
        modeloo.add("2016");
        modeloo.add("2017");
        modeloo.add("2018");
        modeloo.add("2019");
        marcas.add("Mazda");
        marcas.add("Chevrolet");
        marcas.add("Ford");
        marcas.add("Renault");
    }
    /**
     * Metodo que retorna el nombre del auto
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo con el parametro de el nombre 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo que retorna la marca 
     * @return 
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Metodo con el parametro marca 
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * metodo que retorna la lista de  las masrcar
     * @return 
     */
    public List<String> getMarcas() {
        return marcas;
    }
    /**
     * metodo con el parametro de la lista
     * @param marcas 
     */
    public void setMarcas(List<String> marcas) {
        this.marcas = marcas;
    }
    /**
     * metodo que retorna el modelo de el auto
     * @return 
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * metodo con el parametro de el modelo de el auto
     * @param modelo 
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * metodo que retorna los datos de el auto
     * @return 
     */
    public List<Logica> getDatos() {
        return datos;
    }
    /**
     * metodo con el parametro datos con la lista de los autos
     * @param datos 
     */
    public void setDatos(List<Logica> datos) {
        this.datos = datos;
    }
    /**
     * metodo que retorna los filtros de los autos
     * @return 
     */
    public List<Logica> getFiltros() {
        return filtros;
    }
    /**
     * metodo con el parametro de los filtros de los autos
     * @param filtros 
     */
    public void setFiltros(List<Logica> filtros) {
        this.filtros = filtros;
    }
    /**
     * metodo vacio que usa el boton agregar para listar sin refrescar la pagina
     */
    public void mostrarDatos(){
        datos.add(new Logica(nombre,marca,modelo));
           
    }
    /**
     * metodo que retorna la lista de modelos de autos
     * @return 
     */
    public List<String> getModeloo() {
        return modeloo;
    }
    /**
     * metodo con el parametro de la lista de los modelos de los autos
     * @param modeloo 
     */
    public void setModeloo(List<String> modeloo) {
        this.modeloo = modeloo;
    }
    
}