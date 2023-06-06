/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.controlador;
import org.carlosaltan.veterinaria.modelo.MascotaModelo; 
import java.util.ArrayList; 

/**
 *Clase donde se hace el arraylist de Mascota 
 * @author Carlos Altán
 * @version 1.0
 */
public class ControladorMascota {
    private static ControladorMascota instancia; 
    private ArrayList<MascotaModelo> listaMascota;
    private ControladorMascota(){
	listaMascota = new ArrayList<MascotaModelo>();
    }
    /**
     * Metodo que retorna la instancia del controlador 
     * @return retorna la instancia del controlador
     */
    public static ControladorMascota getInstancia(){
	if(instancia == null){
            instancia = new ControladorMascota();
	}return instancia;
    }
    
    /**
     * Metodo que recibe la cantiadad de elementos 
     * @return retorna la cantidad de elementos 
     */
    public int cantiadadDeMascotas(){
		return listaMascota.size(); 
    }
    
    /**
     * Metodo para agregar una mascota 
     * @param nuevaMascota recibe un objeto con los datos de la mascota
     */ 
    public void agregarMascota(MascotaModelo nuevaMascota){
        listaMascota.add(nuevaMascota); 
    }
     /**
      * Metodo que retorna la lista de mascotas 
      * @return retorna la lista de mascotas
      */
    public ArrayList<MascotaModelo> mostarMascota(){
        return listaMascota; 
    }
    /**
     * Metodo para buscar una mascota
     * @param idDueno recibe el id del dueño
     * @return retorna la mascota encontrada 
     */
    public MascotaModelo verMascotaId(String idDueno){
		MascotaModelo mascotaEncontrada = new MascotaModelo(); 
		for (MascotaModelo mascota : listaMascota ) {
			if (mascota.getIdDueno().equals(idDueno)){
				mascotaEncontrada = mascota; 
			break; 
                        }
			
		}
		return mascotaEncontrada; 
	}
    /**
     * Metod para eliminar la mascota
     * @param idDueno recibe el id del dueño
     */
     public void eliminarMascota(String idDueno){
        MascotaModelo mascotaEliminar = new MascotaModelo(); 
        for (MascotaModelo mascota : listaMascota) {
            if (mascota.getIdDueno().equals(idDueno)) {
                mascotaEliminar = mascota; 
                listaMascota.remove(mascotaEliminar); 
                break;
            }
        }
    }
    
    /**
     * Metodo para actualizar una mascota
     * @param mascAntigua recibe el id del dueño
     * @param mascActualiza recibe un objeto con los datos a actualzar 
     */
    public void actualizarMascota(String mascAntigua, MascotaModelo mascActualiza ){ 
		for (MascotaModelo mascota : listaMascota ) {
			if (mascota.getIdDueno().equals(mascAntigua)){
				int cliAct; 
				cliAct = mascota.getId(); 
				listaMascota.set(cliAct-1, mascActualiza);
                                

			break; 	
			}

		}

		
	}
    

    
    
    
    
    
    
}
