/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosaltan.veterinaria.vsitaGraf;
import org.carlosaltan.veterinaria.modelo.DoctorModelo; 
import org.carlosaltan.veterinaria.controlador.ControladorDoctor; 
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel; 
/**
 *JInternalFrame donde se muestran los datos de doctor; 
 * @author Carlos Altán
 */
public class VistaVerDoctor extends javax.swing.JInternalFrame {
    public ControladorDoctor controlador = ControladorDoctor.getInstancia(); 
    /**
     * Creates new form VistaVerDoctor
     */
    public VistaVerDoctor() {
        initComponents();
    }
    
    public void mostrarDatos(){
        String estado; 
        String [] encabezados = {"Id", "Nombre", "Email", "Telefono", "Direccion", "Especialidad", "Colegiado", "Estado"}; 
        int cantidadDeElementos = controlador.cantidadDeDoctores(); 
        DefaultTableModel cabeceraDeTabla = new DefaultTableModel(encabezados, cantidadDeElementos);
        jTable1.setModel(cabeceraDeTabla);  
        TableModel listaDeDatos  = jTable1.getModel();  
        for (int i = 0; i< cantidadDeElementos; i++ ){
            DoctorModelo doctor = controlador.mostrarDoctor().get(i);
            listaDeDatos.setValueAt(doctor.getId(), i, 0); 
            listaDeDatos.setValueAt(doctor.getNombre(), i, 1);
            listaDeDatos.setValueAt(doctor.getEmail(), i, 2); 
            listaDeDatos.setValueAt(doctor.getTelefono(), i, 3);
            listaDeDatos.setValueAt(doctor.getDireccion(), i, 4);
            listaDeDatos.setValueAt(doctor.getEspecialidad(), i, 5);
            listaDeDatos.setValueAt(doctor.getColegiado(), i, 6);
            if (doctor.isEstado() == false ){
            estado = "Inactivo"; 
        }else {
                estado = "Activo"; 
            }
            listaDeDatos.setValueAt(estado, i, 7);
            
        }
        
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Email", "Telefono", "Direccion", "Especialidad", "Colegiado", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
