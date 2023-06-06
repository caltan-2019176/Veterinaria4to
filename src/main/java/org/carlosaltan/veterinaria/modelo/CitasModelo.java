/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.modelo;

/**
 *Se definene las variables para las citas 
 * @author Carlos Altán
 * @version 1.0
 */
public class CitasModelo {
    private int id;
    private String nombrePersona; 
    private String idPersona; 
    private String fecha; 
    private String hora; 
    private String razon;
    private String cantidadDemascotas;
    
    public CitasModelo(){}
    /**
     * contructor con las variables de las citas
     * @param id id de la cita 
     * @param idPersona id de la parsona 
     * @param nombrePersona nombre de la persona que realiza la cita 
     * @param fecha fecha de tipo String 
     * @param hora hora de tipo String 
     * @param razon razon de tipo String 
     * @param cantidadDemascotas cantidad de mascotas de tipo String
     */
    public CitasModelo(int id, String idPersona, String nombrePersona, String fecha, String hora, String razon, String cantidadDemascotas) {
        this.fecha = fecha;
        this.hora = hora;
        this.razon = razon;
        this.cantidadDemascotas = cantidadDemascotas;
        this.nombrePersona = nombrePersona; 
        this.idPersona = idPersona; 
        this.id = id; 
    }
    /**
     * retorna el id de la cita
     * @return id de la cita, int
     */
    public int getId() {
        return id;
    }
    /**
     * recibe el id de la cita
     * @param id id de la cita, int 
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * nombre de la persona que hace la cita
     * @return retorna un String 
     */
    public String getNombrePersona() {
        return nombrePersona;
    }
    /**
     * recibe el nombre de la persona que hace la cita
     * @param nombrePersona recibe un String 
     */
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    
    /**
     * retorna la fecha
     * @return retorna un String 
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * recibe la fecha 
     * @param fecha recibe un String 
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
     * retorna la hora
     * @return retorna un String 
     */
    public String getHora() {
        return hora;
    }
    /**
     * recibe la hora
     * @param hora recibe un String 
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
    /**
     * retorna la razon
     * @return retorna un String 
     */
    public String getRazon() {
        return razon;
    }
    /**
     * recibe la razon
     * @param razon recibe un String 
     */
    public void setRazon(String razon) {
        this.razon = razon;
    }
    /**
     * retorna la cantiadad de perros 
     * @return retorna un String
     */
    public String getCantidadDemascotas() {
        return cantidadDemascotas;
    }
    /**
     * recibe la cantiadad de mascotas 
     * @param cantidadDemascotas recibe un Strign 
     */
    public void setCantidadDemascotas(String cantidadDemascotas) {
        this.cantidadDemascotas = cantidadDemascotas;
        
    }
    /**
     * retorna el id de la persona
     * @return id tipo String
     */
    public String getIdPersona() {
        return idPersona;
    }
    /**
     * recibe el Id de la persona
     * @param idPersona id tipo String
     */
    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }
    
}
