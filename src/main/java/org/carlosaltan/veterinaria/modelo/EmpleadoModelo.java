/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.modelo;

/**
 *Clase donde se definene las variables de Empleado
 * @author Carlos Altán
 * @version 1.0
 */
public class EmpleadoModelo extends PersonaModelo {
    
    
    private int id; 
    private String direccion;
    private String carne; 
    private String area; 
    private String tipo; 
    public EmpleadoModelo(){}
    /**
     * Constructor lleno del Empleado 
     * @param carne carne del empleado 
     * @param id id del empleado 
     * @param direccion direccion del empleado
     * @param area area del empleado 
     * @param tipo especialida del empleado 
     * @param nombre nombre dl empleado 
     * @param telefono telefono del empleado
     * @param email email del empleado x
     */
    public EmpleadoModelo(String carne, int id, String direccion, String area, String tipo, String nombre, String telefono, String email) {
        super(nombre, telefono, email);
        this.id = id;
        this.direccion = direccion;
        this.area = area;
        this.tipo = tipo;
        this.carne = carne; 
    }
    /**
     * Retorna carne del empleado 
     * @return carne String
     */
    public String getCarne() {
        return carne;
    }
    /**
     * recibe el carne del empleado 
     * @param carne carne de tipo String
     */
    public void setCarne(String carne) {
        this.carne = carne;
    }
    
    /**
     * retorna el id del empleado 
     * @return id tipo int 
     */
    public int getId() {
        return id;
    }
    /**
     * recibe el id del empleado 
     * @param id id tipo int 
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * retorna la direccion del empleado 
     * @return direccion tipo String
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * recibe la direaccion del empleado 
     * @param direccion direccion tipo String
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * retorna la area del empleado 
     * @return area tipo String 
     */
    public String getArea() {
        return area;
    }
    /**
     * recibe el area del empleado 
     * @param area area tipo String 
     */
    public void setArea(String area) {
        this.area = area;
    }
    /**
     * retorna el tipo de empleado 
     * @return tipo String 
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * recibe el tipo del empleado 
     * @param tipo  tipo String 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
