/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.vista;
import org.carlosaltan.veterinaria.modelo.MascotaModelo; 
import org.carlosaltan.veterinaria.controlador.ControladorMascota; 
/**
 *Vista mascota 
 * @author Carlos Altán
 * @version 1.0
 */
public class VistaMascota {
    public ControladorMascota controlador = ControladorMascota.getInstancia(); 
    public VistaMascota(){}
    /**
     * Metodo para agregar cliente 
     * @param nombre recibe el nombre 
     * @param dueno recibe el dueño
     * @param idDueno recibe el id dueño
     * @param tipo recibe el tipo
     * @param raza recibe la raza 
     * @param edad recibe la edad 
     * @param razonDeCita recibe la razon 
     */
    public void agregarMascota(String nombre, String dueno, String idDueno, String tipo, String raza, int edad, String razonDeCita){
        MascotaModelo mascota = new MascotaModelo(); 
        mascota.setDueno(dueno);
        mascota.setNombre(nombre);
        mascota.setIdDueno(idDueno);
        mascota.setTipo(tipo);
        mascota.setRaza(raza);
        mascota.setEdad(edad);
        mascota.setRazonDeCita(razonDeCita);
        mascota.setId(controlador.cantiadadDeMascotas()+1);
        controlador.agregarMascota(mascota);
    }
    /**
     * Metodo para eliminar 
     * @param idDueno id del dueño 
     */
    public void eliminarMascota(String idDueno){
        controlador.eliminarMascota(idDueno);
    }
    /**
     * Metodo para actualizar 
     * @param idDuenoAnt recibe el id antiguo 
     * @param nombre recibe el nombre nuevo 
     * @param dueno recibe el dueño nuevo 
     * @param idDueno recibe el id del dueño nuevo 
     * @param tipo recibe la tipo nuevo 
     * @param raza recibe la raza nueva 
     * @param edad recibe la edad nueva
     * @param razonDeCita recibe la razon de cita 
     */
    public void actualizarMascota(String idDuenoAnt,String nombre, String dueno, String idDueno, String tipo, String raza, int edad, String razonDeCita ){
        MascotaModelo mascota = new MascotaModelo();
        mascota.setDueno(dueno);
        mascota.setNombre(nombre);
        mascota.setIdDueno(idDueno);
        mascota.setTipo(tipo);
        mascota.setRaza(raza);
        mascota.setEdad(edad);
        mascota.setRazonDeCita(razonDeCita); 
        controlador.actualizarMascota(idDuenoAnt, mascota);
    }
    /**
     * Metodo para buscar mascota 
     * @param idDueno recibe el id del dueño 
     */
    public void mostrarMascotaId(String idDueno){
        MascotaModelo mascota = new MascotaModelo(); 
        mascota = controlador.verMascotaId(idDueno); 
        System.out.println("Nombre: "+ mascota.getNombre());
        System.out.println("Dueño: "+ mascota.getDueno());
       System.out.println("DPI: "+ mascota.getIdDueno());
       System.out.println("tipo: "+ mascota.getTipo());
       System.out.println("Raza: "+ mascota.getRaza());
       System.out.println("Edad: "+ mascota.getEdad());
       System.out.println("Razon: "+ mascota.getRazonDeCita());
    }
   

    
    
    
    
    
}
