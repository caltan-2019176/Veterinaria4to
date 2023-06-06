/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.modelo;

/**
 *Clase en la que definen las varibles de la medico.
 * @author Carlos Altán
 * @version 1.0
 * 
 */
public class DoctorModelo extends PersonaModelo {
    
    private int id; 
    private String direccion; 
    private String especialidad; 
    private String colegiado; 
    private boolean estado; 
    
    public DoctorModelo() {}
    /**
     * Constructor lleno con varibles
     * @param id id del doctor tipo int.
     * @param direccion direccion del doctor tipo String.
     * @param especialidad especialidad del doctor tipo String
     * @param colegiado colegiado del doctor tipo String
     * @param estado estado  del doctor tipo boolean
     * @param nombre nombre  del doctor tipo String
     * @param telefono telefono del doctor tipo String
     * @param email email del doctor tipo String
     */
    public DoctorModelo(int id, String direccion, String especialidad, String colegiado, boolean estado, String nombre, String telefono, String email) {
        super(nombre, telefono, email);
        this.id = id;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.colegiado = colegiado;
        this.estado = estado;
    }
    /**
     *id del doctor
     * @return id tipo int
     */
    public int getId() {
        return id;
    }
    /**
     * recibe el id del doctor
     * @param id tipo int 
     */

    public void setId(int id) {
        this.id = id;
    }
    /**
     * retorna la direccion del doctor
     * @return tipo String 
     */   

    public String getDireccion() {
        return direccion;
    }
    /**
     * recibe la direccion del doctor
     * @param direccion tipo String 
     */

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * retorna la especialidad del doctor
     * @return tipo String 
     */

    public String getEspecialidad() {
        return especialidad;
    }
    /**
     * recibe la especialidad del doctor
     * @param especialidad tipo String
     */

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    /**
     * retorna el colegiado del doctor
     * @return tipo String 
     */
    public String getColegiado() {
        return colegiado;
    }
    /**
     * recibe el colegiado del doctor
     * @param colegiado tipo String 
     */

    public void setColegiado(String colegiado) {
        this.colegiado = colegiado;
    }
    /**
     * retorna el estado del doctor 
     * @return tipo boolean
     */

    public boolean isEstado() {
        return estado;
    }
    /**
     * recibe el estado del doctor
     * @param estado tipo boolean 
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
