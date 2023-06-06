/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.vista;
import org.carlosaltan.veterinaria.modelo.DoctorModelo; 
import org.carlosaltan.veterinaria.controlador.ControladorDoctor; 

/**
 * vista de Doctor 
 * @author Carlos Altán
 * @version 1.0
 */
public class VistaDoctor {
    public ControladorDoctor controlador = ControladorDoctor.getInstancia(); 
    
    public VistaDoctor(){}
    
    /**
     * Metodo para agregar un nuevo doctor 
     * @param nombre recibe el nombre 
     * @param email recibe el email
     * @param telefono recibe el telefono
     * @param direccion recibe la direccion
     * @param especialidad recibe la especialidad 
     * @param colegiado recibe el colegiado 
     * @param estado recibe el estado 
     */
    public void nuevoDoctor(String nombre, String email, String telefono, String direccion, String especialidad, String  colegiado, boolean estado){
        DoctorModelo doc = new DoctorModelo(); 
        
        doc.setNombre(nombre); 
        doc.setEmail(email);       
        doc.setTelefono(telefono);       
        doc.setDireccion(direccion);       
        doc.setEspecialidad(especialidad);            
        doc.setColegiado(colegiado);
        doc.setId(controlador.cantidadDeDoctores()+1);
        doc.setEstado(estado);
        controlador.agregarDoctor(doc);
        
    }
    
  /**
   * Metodo para buscar un doctor 
   * @param colegiado recibe el colegiado 
   */
    public void mostrarDoctorPorColegiado(String colegiado){
        DoctorModelo doctor = new DoctorModelo(); 
        
        doctor = controlador.verDoctorCole(colegiado);
            System.out.println("Nombre: "+ doctor.getNombre());
            System.out.println("Email: "+doctor.getEmail());
            System.out.println("Telefono: "+doctor.getTelefono());
            System.out.println("Direccion: "+doctor.getDireccion());
            System.out.println("Especialidad"+doctor.getEspecialidad());
            System.out.println("Colegiado: "+doctor.getColegiado());
            System.out.println("estado: "+doctor.isEstado());
            System.out.println("");  

        
    }
    /**
     * Metodo para eliminar doctor 
     * @param colegiado recibe el colegiado del doctor 
     */
    public void eliminarDoctor(String colegiado){
        
        controlador.eliminarDoctor((colegiado));
        
    }
    /**
     * Metdo para actualizar Doctor
     * @param docAntiguo colegiado antiguo del doctor 
     * @param nombre nombre nuevo 
     * @param email email nuevo 
     * @param telefono telefono nuevo 
     * @param direccion direccion nuevo 
     * @param especialidad especialidad nuevo
     * @param colegiado colegiado nuevo 
     * @param estado estado nuevo 
     */
    public void actualizarDoctor(String docAntiguo,String nombre, String email, String telefono, String direccion, String especialidad, String  colegiado, boolean estado ){
        DoctorModelo doc = new DoctorModelo(); 
        doc.setNombre(nombre);       
        doc.setEmail(email);       
        doc.setTelefono(telefono);        
        doc.setDireccion(direccion);        
        doc.setEspecialidad(especialidad);        
        doc.setColegiado(colegiado);
        doc.setEstado(estado);
        controlador.actualizarDoctor(docAntiguo, doc);
        
    }
    
    
}

