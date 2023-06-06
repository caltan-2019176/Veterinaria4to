/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.controlador;

import java.util.ArrayList;
import org.carlosaltan.veterinaria.modelo.CitasModelo;

/**
 *Clase donde se hace el arraylist de citas
 * @author Carlos Altán
 * @version 1.0
 */
public class ControladorCita {
    
    private static ControladorCita instancia; 
    private ArrayList<CitasModelo> listaCita;
    
    private ControladorCita(){
	listaCita = new ArrayList<CitasModelo>();
    }
    /**
     * Instancia del controlador 
     * @return retorna la instancia 
     */
    public static ControladorCita getInstancia(){
	if(instancia == null){
            instancia = new ControladorCita();
	}return instancia;
    }
    
    
    /**
     * Metodo con la cantidad de elementos 
     * @return la cantidad de elementos del arrayList 
     */
    public int cantiadadDeCitas(){
		return listaCita.size(); 
    }
    
    /**
     * Metodo en el que se crea una nueva cita 
     * @param nuevaCita recibe un objeto con los datos de la cita
     */
    public void agregarCita(CitasModelo nuevaCita){
        listaCita.add(nuevaCita); 
    }
    /**
     * Metodo que retorna la lista del arrylist 
     * @return retorna la lista del arraylist 
     */
    public ArrayList<CitasModelo> mostrarCita(){
        return listaCita; 
    }
    /**
     * Metodo que busca una cita por medio del id 
     * @param idPersona recibe el id de la persona a buscar
     * @return retona un objeto con los datos encontrados
     */
    public CitasModelo verCitaId(String idPersona){
		CitasModelo citaEcontrada = new CitasModelo(); 
		for (CitasModelo cita : listaCita ) {
			if (cita.getIdPersona().equals(idPersona)){
				citaEcontrada = cita; 
                                break; 
			}
			
		}
		return citaEcontrada; 
	}
    /**
     * Metodo que elimina una cita
     * @param idPersona recibe el id de la persona para buscar a cual eliminar
     */
     public void eliminarCita(String idPersona){
        CitasModelo citaEliminar = new CitasModelo(); 
        for (CitasModelo cita : listaCita) {
            if (cita.getIdPersona().equals(idPersona)) {
                citaEliminar = cita; 
                listaCita.remove(citaEliminar); 
                break;
            }
        }
    }
    
    /**
     * Metodo que actualiza una cita 
     * @param citaAntigua recibe el id de la cita a actualizar 
     * @param citaActualiza recibe un objeto con los datos para actualizar 
     */ 
    public void actualizarCita(String citaAntigua, CitasModelo citaActualiza ){ 
		for (CitasModelo cita : listaCita ) {
			if (cita.getIdPersona().equals(citaAntigua)){
				int cliAct; 
				cliAct = cita.getId(); 
				listaCita.set(cliAct-1, citaActualiza);
                                

			break; 	
			}

		}

		
	}
    
    
    
    
}
