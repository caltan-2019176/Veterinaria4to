/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.vista;
import  org.carlosaltan.veterinaria.modelo.ClienteModelo; 
import org.carlosaltan.veterinaria.controlador.ControladorCliente;


/**
 * vista del cliente 
 * @author Carlos Altán
 * @version 1.0
 */
public class VistaCliente {
    public ControladorCliente controlador = ControladorCliente.getInstancia(); 
    public VistaCliente(){}
    /**
     * Metodo para agregar cliente 
     * @param nombre recibe el nombre de la persona 
     * @param telefono recibe el telefono
     * @param email recibe el email 
     * @param idPersonal recibe el id personal
     * @param noMascotas  recibe el No. de mascotas 
     */
    public void agregarCliente(String nombre, String telefono, String email, String idPersonal, int noMascotas){
        
            ClienteModelo cliente = new ClienteModelo(); 
            cliente.setNombre(nombre);
            cliente.setTelefono(telefono);
            cliente.setEmail(email);
            cliente.setIdPersonal(idPersonal);
            cliente.setNoMascotas(noMascotas);
            cliente.setId(controlador.cantidadDeClientes()+1);
            controlador.agregarCliente(cliente);
        
    }
    /**
     * Metodo ´para eliminar cliente 
     * @param idPersonal  recibe el idPersonal 
     */
    public void eliminarCliente(String idPersonal){
        controlador.eliminarCliente(idPersonal);
        
    }
    /**
     * Metodo ´para actualizar cliente
     * @param idAnt id antiguo 
     * @param nombre Recibe el nombre nuevo 
     * @param telefono Recibe el telefono nuevo 
     * @param email Recibe el email nuevo 
     * @param idPersonal Recibe el id nuevo 
     * @param noMascotas Recibe el no de mascotas  nuevo 
     */
    public void actulizarCliente(String idAnt, String nombre, String telefono, String email, String idPersonal, int noMascotas){
        ClienteModelo cliente = new ClienteModelo(); 
            cliente.setNombre(nombre);
            cliente.setTelefono(telefono);
            cliente.setEmail(email);
            cliente.setIdPersonal(idPersonal);
            cliente.setNoMascotas(noMascotas);
            controlador.actualizarEmpleado(idAnt, cliente);    
    }
    /**
     * Metodo para buscar un cliente
     * @param idPersonal recibe id personal 
     */
    public void mostrarClientePorId(String idPersonal){
       ClienteModelo cliente = new ClienteModelo(); 
       cliente = controlador.verClienteId(idPersonal); 
       System.out.println("nombre"+ cliente.getNombre());
       System.out.println("telefono"+ cliente.getTelefono());
       System.out.println("email"+ cliente.getEmail());
       System.out.println("DPI"+ cliente.getIdPersonal());
       System.out.println("No. Mascotas"+ cliente.getNoMascotas());
     
    }
   
    
}
    


