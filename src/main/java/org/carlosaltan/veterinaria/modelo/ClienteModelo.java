/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.modelo;

/**
 *Clase donde se definen las variables de Cliente 
 * @author Carlos Altán
 * @version 1.0
 */
public class ClienteModelo extends PersonaModelo{
    private int noMascotas;
    private int id; 
    private String idPersonal; 
    public ClienteModelo(){}
    /**
     * Constructor con datos del cliente 
     * @param noMascotas numero de mascotas ingresadas, int
     * @param idPersonal id personal de cliente, string
     * @param nombre nombre del cliente 
     * @param telefono telefono del cliente, string 
     * @param email email de cliente
     * @param id id del cliente, se usa para mascota y cita 
     */
    public ClienteModelo(int id, String idPersonal, int noMascotas, String nombre, String telefono, String email) {
        super(nombre, telefono, email);
        this.noMascotas = noMascotas;
        this.id = id; 
        this.idPersonal = idPersonal; 
    }
    /**
     * id persolan del cliente
     * @return retorna un String 
     */
    public String getIdPersonal() {
        return idPersonal;
    }
    /**
     * recibe el id personal del cliente 
     * @param idPersonal id tipo String
     */
    public void setIdPersonal(String idPersonal) {
        this.idPersonal = idPersonal;
    }
    
    /**
     * metodo que retorna el id, segun posicion del array
     * @return retorna un int  
     */
    public int getId() {
        return id;
    }
    /**
     * recibe un int para id, segun posicion del array
     * @param id id del cliente 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * metodo que retoena el No. de mascotas 
     * @return retorna un int 
     */
    public int getNoMascotas() {
        return noMascotas;
    }
    /**
     * recibe un int para el No. de mascotas 
     * @param noMascotas recibe un int 
     */
    public void setNoMascotas(int noMascotas) {
        this.noMascotas = noMascotas;
    }
    
    
    
           
    
}
