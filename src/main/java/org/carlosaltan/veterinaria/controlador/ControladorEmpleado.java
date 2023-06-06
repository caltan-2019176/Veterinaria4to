/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.controlador;
import org.carlosaltan.veterinaria.modelo.EmpleadoModelo;
import java.util.ArrayList; 

/**
 *Clase donde se hace el arrayList de Empleado
 * @author Carlos Altán
 * @version 1.0
 */
public class ControladorEmpleado {
    private static ControladorEmpleado instancia; 
    private ArrayList<EmpleadoModelo> listaEmpleado;
    private ControladorEmpleado(){
	listaEmpleado = new ArrayList<EmpleadoModelo>();
    }
    /**
     * Metodo con la instancia de controlador 
     * @return retorna la instancia del controlador 
     */
     public static ControladorEmpleado getInstancia(){
	if(instancia == null){
            instancia = new ControladorEmpleado();
	}return instancia;
    }
    /**
     * Metodo con la cantidad de elementos 
     * @return la cantiadad de empleado 
     */
    public int cantidadDeEmpleados(){
		return listaEmpleado.size(); 
    }
    
    /**
     * Metodo para agregar un empleado 
     * @param nuevoEmpleado recibe un objeto con los datos del empleado 
     */
    public void agregarEmpleado(EmpleadoModelo nuevoEmpleado){
        listaEmpleado.add(nuevoEmpleado); 
    }
    /**
     * Metodo que retorna la lista de empleado 
     * @return retorna la lista de empleados
     */
    public ArrayList<EmpleadoModelo> mostarEmpleado(){
        return listaEmpleado; 
    }
    /**
     * Metodo para ver un empleado 
     * @param carne recibe el carne del empleado 
     * @return retorna el empleado encontrado 
     */
    public EmpleadoModelo verEmpleadoPorCarne(String carne){
		EmpleadoModelo empleadoEncontrado = new EmpleadoModelo(); 
		for (EmpleadoModelo empleado : listaEmpleado ) {
			if (empleado.getCarne().equals(carne)){
				empleadoEncontrado = empleado; 
			break; 
                        }
			
		}
		return empleadoEncontrado; 
	}
    
    /**
     * Metod para eliminar un empleado 
     * @param carne recibe el carne del empleado 
     */
     public void eliminarEmpleado(String carne){
        EmpleadoModelo empleadoEliminar = new EmpleadoModelo(); 
        for (EmpleadoModelo doc : listaEmpleado) {
            if (doc.getCarne().equals(carne)) {
                empleadoEliminar = doc; 
                listaEmpleado.remove(empleadoEliminar); 
                break;
            }
        }
    }
    
    /**
     * Metodo para actualizar un empleado 
     * @param empleAntiguo carne del empleado antiguo 
     * @param empleActualiza objeto con los datos a actualizar 
     */ 
    public void actualizarEmpleado(String empleAntiguo, EmpleadoModelo empleActualiza ){ 
		for (EmpleadoModelo doc : listaEmpleado ) {
			if (doc.getCarne().equals(empleAntiguo)){
				int emAct; 
				emAct = doc.getId(); 
				listaEmpleado.set(emAct-1, empleActualiza);
				
			break; 	
			}

		}

		
	}
    
    
}
