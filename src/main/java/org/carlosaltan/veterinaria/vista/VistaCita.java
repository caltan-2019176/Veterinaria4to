/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.vista;
import org.carlosaltan.veterinaria.controlador.ControladorCita; 
import org.carlosaltan.veterinaria.modelo.CitasModelo; 

/**
 *vista de la cita 
 * @author Carlos Altán
 * @version 1.0
 */
public class VistaCita {
   public ControladorCita controlador = ControladorCita.getInstancia(); 
    public VistaCita(){} 
    
    /**
     * Metodo para agregar una cita
     * @param idPersona id de la persona 
     * @param nombrePersona nombre de la persona 
     * @param fecha fecha de la cita 
     * @param hora hora de la cita 
     * @param razon razon de la cita
     * @param cantidadDemascotas cantiadad de mascotas 
     */
    public void agregarCita(String idPersona, String nombrePersona, String fecha, String hora, String razon, String cantidadDemascotas){
        CitasModelo cita = new CitasModelo(); 
        cita.setNombrePersona(nombrePersona);
        cita.setIdPersona(idPersona);
        cita.setFecha(fecha);
        cita.setHora(hora);
        cita.setRazon(razon);
        cita.setCantidadDemascotas(cantidadDemascotas);
        cita.setId(controlador.cantiadadDeCitas()+1);
        controlador.agregarCita(cita);
    }
    /**
     * Metodo para eliminar la cita 
     * @param idPersona id de la persona para eliminarla 
     */
    public void eliminarCita(String idPersona){
        controlador.eliminarCita(idPersona);
       
    }
    /**
     * Metodo para actulizar cita
     * @param idAnt id antiguo de la persona 
     * @param idPersona id de la persona 
     * @param nombrePersona nombre de la persona 
     * @param fecha fecha de la cita 
     * @param hora hora de la cita 
     * @param razon razon de la cita
     * @param cantidadDemascotas  cantiadad de mascotas 
     */
    public void actualizarCita(String idAnt,String idPersona, String nombrePersona, String fecha, String hora, String razon, String cantidadDemascotas){
        CitasModelo cliente = new CitasModelo(); 
        cliente.setNombrePersona(nombrePersona);
        cliente.setIdPersona(idPersona);
        cliente.setFecha(fecha);
        cliente.setHora(hora);
        cliente.setRazon(razon);
        cliente.setCantidadDemascotas(cantidadDemascotas);
        controlador.actualizarCita(idAnt, cliente);

    }
    /**
     * metoda para buscar una cita 
     * @param idPersona id de la persona con la que esta la cita 
     */
    public void mostrarCitasId(String idPersona){
        CitasModelo cita = new CitasModelo(); 
        cita = controlador.verCitaId(idPersona); 
        System.out.println("Nombre: "+ cita.getNombrePersona());
        System.out.println("DPI: "+ cita.getIdPersona());
       System.out.println("fecha: "+ cita.getFecha());
       System.out.println("hora: "+ cita.getHora());
       System.out.println("razon: "+ cita.getRazon());
       System.out.println("cantiadad de mascotas: "+ cita.getCantidadDemascotas()); 
    }
    


}
