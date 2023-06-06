/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.controlador;
import org.carlosaltan.veterinaria.modelo.DoctorModelo;
import java.util.ArrayList; 
/**
 *Clase donde se hace el arraylist de Doctor
 * @author Carlos Altán
 * @version 1.0
 */
public class ControladorDoctor {
    private static ControladorDoctor instancia; 
    private ArrayList<DoctorModelo> listaDoctor;
    private ControladorDoctor(){
	listaDoctor = new ArrayList<DoctorModelo>();
    }
    /**
     * metodo que retorna la instancia del controlador
     * @return instancia del controlador 
     */
    public static ControladorDoctor getInstancia(){
	if(instancia == null){
            instancia = new ControladorDoctor();
	}return instancia;
    }
    /**
     * Metodo que retorna la cantidad de elementos de doctor 
     * @return cantidad de elementos del ArrayList 
     */
    public int cantidadDeDoctores(){
		return listaDoctor.size(); 
	}
    
    /**
     * Metodo para agregar un doctor
     * @param nuevoDoctor recibe un objeto con los datos del doctor 
     */
    public void agregarDoctor(DoctorModelo nuevoDoctor){
        listaDoctor.add(nuevoDoctor); 
    }
    
    /**
     * Metodo que retorna la lista de doctor
     * @return retorna la lista de doctor 
     */
    public ArrayList<DoctorModelo> mostrarDoctor(){
        return listaDoctor; 
    }
    /**
     * Metodo que busca un doctor 
     * @param colegiado recibe el colegiado 
     * @return retorna el doctor encontrado 
     */
    public DoctorModelo verDoctorCole(String colegiado){
		DoctorModelo doctorEncontrado = new DoctorModelo(); 
                
                    
		for (int i = 0; i < listaDoctor.size(); i++  ) {
                     
                     String nn = listaDoctor.get(i).getColegiado(); 
			if (nn.equals(colegiado)){
                            
				doctorEncontrado = listaDoctor.get(i); 
                                break; 
			}
			
		}
		return doctorEncontrado; 
	}
    /**
     * Metodo para eliminar un doctor 
     * @param colegiado colegiado para eliminar el doctor
     */
    
    public void eliminarDoctor(String colegiado){
        DoctorModelo docEliminar = new DoctorModelo(); 
        for (DoctorModelo doc : listaDoctor) {
            if (doc.getColegiado().equals(colegiado)) {
                docEliminar = doc; 
                listaDoctor.remove(docEliminar); 
                break;
            }
        }
    }
    
    /**
     * Metodo para actualizar un doctor 
     * @param docAntiguo recibe el colegiado del doctor 
     * @param DocActualiza recibe un objeto con los datos para actualizar
     */
    public void actualizarDoctor(String docAntiguo, DoctorModelo DocActualiza ){ 
		for (DoctorModelo doc : listaDoctor ) {
			if (doc.getColegiado().equals(docAntiguo)){
				int docAct; 
				docAct = doc.getId(); 
				listaDoctor.set(docAct-1, DocActualiza);
				
                                 
			break; 	
			}

		}

		
	}
    
}
