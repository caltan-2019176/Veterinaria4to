/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.carlosaltan.veterinaria.controlador;
import org.carlosaltan.veterinaria.modelo.ClienteModelo;
import java.util.ArrayList; 
/**
 *Clase en la que hacemos el arrylist de cliente
 * @author Carlos Altán
 * @version 1.0
 */
public class ControladorCliente {
    private static ControladorCliente instancia; 
    private ArrayList<ClienteModelo> listaCliente;
    private ControladorCliente(){
	listaCliente = new ArrayList<ClienteModelo>();
    }
    /**
     * Metodo con la instancia del controlador 
     * @return retorna la instancia 
     */
    public static ControladorCliente getInstancia(){
	if(instancia == null){
            instancia = new ControladorCliente();
	}return instancia;
    }
    /**
     * Metodo con la cantidad de elementos del arrayList
     * @return retorna la cantidad de elementos 
     */
    public int cantidadDeClientes(){
		return listaCliente.size(); 
    }
    
    /**
     * Metodo para agregar cliente 
     * @param nuevoCliente recibe un objeto con los datos para agregar 
     */
    public void agregarCliente(ClienteModelo nuevoCliente){
        listaCliente.add(nuevoCliente); 
    }
     /**
      * Metodo que retorna la lista de clientes
      * @return lista de clientes 
      */
    public ArrayList<ClienteModelo> mostarCliente(){
        return listaCliente; 
    }
    /**
     * Metodo con el que se busca un cliente 
     * @param idPersonal id del cliente 
     * @return retorna el cliente encontrado 
     */
    public ClienteModelo verClienteId(String idPersonal){
		ClienteModelo clienteEncontrado = new ClienteModelo(); 
		for (ClienteModelo cliente : listaCliente ) {
			if (cliente.getIdPersonal().equals(idPersonal)){
				clienteEncontrado = cliente; 
			break; 
                        }
			
		}
		return clienteEncontrado; 
	}
    /**
     * Metodo para elimnar un cliente 
     * @param idPersonal recibe el id de la persona 
     */
     public void eliminarCliente(String idPersonal){
        ClienteModelo clienteEliminar = new ClienteModelo(); 
        for (ClienteModelo cli : listaCliente) {
            if (cli.getIdPersonal().equals(idPersonal)) {
                clienteEliminar = cli; 
                listaCliente.remove(clienteEliminar); 
                break;
            }
        }
    }
    
    /**
     * Metodo para actualizar cliente 
     * @param cliAntiguo recibe el id del cliente antiguo
     * @param cliActualiza recibe un objeto con los datos para actualizar 
     */ 
    public void actualizarEmpleado(String cliAntiguo, ClienteModelo cliActualiza ){ 
		for (ClienteModelo cli : listaCliente ) {
			if (cli.getIdPersonal().equals(cliAntiguo)){
				int cliAct; 
				cliAct = cli.getId(); 
				listaCliente.set(cliAct-1, cliActualiza);
                               

			break; 	
			}

		}

		
	}
    
    
}
