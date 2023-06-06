/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.modelo;

/**
 * clase en la que se definen las variables de la clase persona.
 * @author Carlos Altán
 * @version  1.0
 */
public class PersonaModelo {
    /**
     * variables de la clase persona 
     */
    
    
    private String nombre; 
    private String telefono; 
    private String email; 

    
    public PersonaModelo(){
        
    }
/**
 * recibe las varibles de la clase medico 
 *  
 * @param nombre nombre de la persona 
 * @param telefono telefono de la persona 
 * @param email email de la persona  
 * 
 */
    public PersonaModelo(String nombre, String telefono, String email) {   
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    
    /**
     * retorna el nombre
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**}
     * recibe el nombre
     * @param nombre nombre tipo String 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * retorna el telefono 
     * @return telefono de tipo String 
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * recibe el telefono
     * @param telefono telefono de tipo String
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * retorna el email
     * @return email de tipo String 
     */
    public String getEmail() {
        return email;
    }
    /**
     * recibe el email
     * @param email email de tipo String
     */
    public void setEmail(String email) {
        this.email = email;
    }


    
    
    
}
