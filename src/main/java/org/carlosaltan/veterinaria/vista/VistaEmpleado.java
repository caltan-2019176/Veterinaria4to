/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.vista;
import org.carlosaltan.veterinaria.modelo.EmpleadoModelo; 
import org.carlosaltan.veterinaria.controlador.ControladorEmpleado; 
/**
 * vista empleado 
 * @author Carlos Altán
 * @version 1.0
 */
public class VistaEmpleado {
    public ControladorEmpleado controlador = ControladorEmpleado.getInstancia(); 
    public VistaEmpleado(){}
    /**
     * Metodo para agregar un empleado 
     * @param nombre recibe el nombre 
     * @param telefono recibe el telefono
     * @param email recibe el email
     * @param tipo recibe el tipo 
     * @param area recibe el area 
     * @param direccion recibe la direccion
     * @param carne  recibe el carne 
     */
    public void agregarEmpleado(String nombre, String telefono, String email, String tipo, String area,String direccion, String carne){
        EmpleadoModelo empleado = new EmpleadoModelo(); 
        empleado.setNombre(nombre);
        empleado.setTelefono(telefono);
        empleado.setEmail(email);
        empleado.setTipo(tipo);
        empleado.setArea(area);
        empleado.setDireccion(direccion);
        empleado.setCarne(carne);
        empleado.setId(controlador.cantidadDeEmpleados()+1);
        controlador.agregarEmpleado(empleado);
      
    }
    /**
     * Metodo para elinar un empleado 
     * @param carne recibe el carne del empleado 
     */
    public void eliminarEmpleado(String carne){
        controlador.eliminarEmpleado(carne);
        
    }
    /**
     * Metodo para actualizar un empleado 
     * @param carneAn recibe el carne antiguo 
     * @param nombre recibe el nombre nuevo 
     * @param telefono recibe el telefono nuevo 
     * @param email recibe el email nuevo 
     * @param tipo recive el tipo nuevo 
     * @param area recibe el area nueva 
     * @param direccion recibe la direccion nueva
     * @param carne recibe el carne nuevo 
     */
    public void actualizarEmpleado(String carneAn,String nombre, String telefono, String email, String tipo, String area,String direccion, String carne ){
        EmpleadoModelo empleado = new EmpleadoModelo(); 
        empleado.setNombre(nombre);
        empleado.setTelefono(telefono);
        empleado.setEmail(email);
        empleado.setTipo(tipo);
        empleado.setArea(area);
        empleado.setDireccion(direccion);
        empleado.setCarne(carne);
        controlador.actualizarEmpleado(carneAn, empleado);

    }
    /**
     * Metodo para buscar un empleado 
     * @param carne  recibe el carne del empleado a buscar 
     */
    public void mostrarEmpleadoCarne(String carne){
        EmpleadoModelo empleado = new EmpleadoModelo(); 
        empleado = controlador.verEmpleadoPorCarne(carne); 
        System.out.println("Nombre: "+ empleado.getNombre());
        System.out.println("Telefono: "+ empleado.getTelefono());
       System.out.println("email: "+ empleado.getEmail());
       System.out.println("Especialidad: "+ empleado.getTipo());
       System.out.println("Area: "+ empleado.getArea());
       System.out.println("Direccion: "+ empleado.getDireccion());
       System.out.println("carne: "+ empleado.getCarne());
       
      
    }
     

}
