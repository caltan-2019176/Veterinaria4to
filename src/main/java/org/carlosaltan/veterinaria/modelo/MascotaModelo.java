/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.modelo;

/**
 * Clase donde se definene las variables de la clase Mascota
 * @author Carlos Altán
 * @version 1.0
 */
public class MascotaModelo {
    private int id; 
    private String nombre; 
    private String dueno; 
    private String idDueno; //debe ser el mismo que se ingreso en cliente 
    private String tipo; 
    private String raza; 
    private int edad; 
    private String razonDeCita;
    public MascotaModelo(){}
    /**
     * Constructor con las variables de mascota
     * @param id id para la mascota 
     * @param nombre nombre de la mascota
     * @param dueno nombre del dueño
     * @param idDueno id del dueño
     * @param tipo tipo de mascota
     * @param raza raza de mascota
     * @param edad edad de la mascota
     * @param razonDeCita  razon de la consulta 
     */
    public MascotaModelo(int id, String nombre, String dueno, String idDueno, String tipo, String raza, int edad, String razonDeCita) {
        this.nombre = nombre;
        this.dueno = dueno;
        this.idDueno = idDueno;
        this.tipo = tipo;
        this.raza = raza;
        this.edad = edad;
        this.razonDeCita = razonDeCita;
        this.id = id; 
    }
    /**
     * metodo que retorna el id de la mascota
     * @return id de tipo int; 
     */
    public int getId() {
        return id;
    }
    /**
     * metodo que recibe el id de la mascota
     * @param id id de la mascota, tipo int;
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * retorna el nombre de la moscota 
     * @return retorna un String 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * recibe el nombre
     * @param nombre recibe un String 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * retorna el nombre del dueño
     * @return retorna un String 
     */
    public String getDueno() {
        return dueno;
    }
    /**
     * recibe el nombre del dueño
     * @param dueno recibe un String 
     */
    public void setDueno(String dueno) {
        this.dueno = dueno;
    }
    /**
     * retorna el id del dueño
     * @return retorna el id del dueño, Strign
     */
    public String getIdDueno() {
        return idDueno;
    }
    /**
     * recibe el nombre del dueño
     * @param idDueno recibe un String 
     */
    public void setIdDueno(String idDueno) {
        this.idDueno = idDueno;
    }
    /**
     * retorna el tipo
     * @return retorna un String 
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * recibe el tipo
     * @param tipo recibe un String 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * retorna la raza
     * @return retorna un String 
     */
    public String getRaza() {
        return raza;
    }
    /**
     * recibe la raza
     * @param raza recibe un String 
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    /**
     * retorna la edad
     * @return retorna un int
     */
    public int getEdad() {
        return edad;
    }
    /**
     * recibe la edad
     * @param edad recibe un int 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * retorna la razon de la cita
     * @return retorna un String 
     */
    public String getRazonDeCita() {
        return razonDeCita;
    }
    /**
     * recibe la razon de la cita
     * @param razonDeCita recibe un String
     */
    public void setRazonDeCita(String razonDeCita) {
        this.razonDeCita = razonDeCita;
    }
    
    
    
    
}
