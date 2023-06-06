/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosaltan.veterinaria.vsitaGraf;

/**
 *Clase donde se hace la vista grafica de Empleado
 * @author Carlos Altán
 * @version 1.0
 */
public class VistaEmpleadoG extends javax.swing.JInternalFrame {

    
    //EMPLEADO
    
    private static VistaAgregarEmpleado instanciAgregarEmpleado = null;
    private static VistaVerEmpleado instanciaVerEmpleado = null; 
    private static VistaEliminarEmpleado instancaiEliminarEmpleado = null; 
    private static VistaActualizarEmpleado instancaiActualizarEmpleado = null; 
    private static VistaBuscarEmpleado instanciaBuscarEmpleado = null; 
    //DOCTOR
    private static VistaEliminarDoctor instanciaEliminarDoctor = null; 
    private static VistaActualizarDoctor instanciaActualizarDoctor = null; 
    //CLIENTE
    private static VistaVerCiente instanciaVerCiente = null; 
    private static VistaEliminarCliente instanciaEliminarCliente = null; 
     private static VistaBuscarCliente instanciaBuscarCliente =null; 
    //CITA
    private static VistaEliminarCita instanciaEliminarCita = null; 
    private static VistaBuscarCita instanciaBuscarCita = null; 

    /**
     * Creates new form VistaEmpleadoG
     */
    public VistaEmpleadoG() {
        initComponents();
    }
    /**
     * Metodo con la instancia de agregar empleado 
     * @return instancia de empleado 
     */
    private synchronized VistaAgregarEmpleado getInstanciaAgregarEmpleado(){
        if (instanciAgregarEmpleado == null){
            instanciAgregarEmpleado = new VistaAgregarEmpleado(); 
            instanciAgregarEmpleado.setVisible(true);
            jDesktopPane1.add(instanciAgregarEmpleado);
            
        }else if (instanciAgregarEmpleado.isVisible() == false){
            instanciAgregarEmpleado.setVisible(true);
            // jDesktopPane1.add(instanciAgregarEmpleado);
           
        }
        instanciAgregarEmpleado.show();
        return instanciAgregarEmpleado; 
    }
    /**
     * Metodo con la instancia de ver empleado 
     * @return instancia de ver empleado
     */
    private synchronized VistaVerEmpleado getInstancaiVerEmpleado(){
        if (instanciaVerEmpleado == null){
            instanciaVerEmpleado = new VistaVerEmpleado();
             instanciaVerEmpleado.setVisible(true);
            jDesktopPane1.add(instanciaVerEmpleado);
            
        }else if (instanciaVerEmpleado.isVisible() == false){
            instanciaVerEmpleado.setVisible(true);
           
        }
        instanciaVerEmpleado.show();
        return instanciaVerEmpleado; 
    }
    /**
     * Metodo con la instancia de eliminar empleado 
     * @return instancia de eliminar empleado 
     */
    private synchronized VistaEliminarEmpleado getInstanciaEliminarEmpleado(){
        if (instancaiEliminarEmpleado == null){
            instancaiEliminarEmpleado = new VistaEliminarEmpleado(); 
            instancaiEliminarEmpleado.setVisible(true);
            jDesktopPane1.add(instancaiEliminarEmpleado);
            
        }else if (instancaiEliminarEmpleado.isVisible() == false){
            instancaiEliminarEmpleado.setVisible(true);
           
        }
        instancaiEliminarEmpleado.show();
        return instancaiEliminarEmpleado; 
    }
    /**
     * Metodo con la instancia de actualizar empleado 
     * @return instancia de ectualizar empleado 
     */
    private synchronized VistaActualizarEmpleado getInstanciaActualizarEmpleado(){
        if (instancaiActualizarEmpleado == null){
            instancaiActualizarEmpleado = new VistaActualizarEmpleado(); 
            instancaiActualizarEmpleado.setVisible(true);
            jDesktopPane1.add(instancaiActualizarEmpleado);
            
        }else if (instancaiActualizarEmpleado.isVisible() == false){
            instancaiActualizarEmpleado.setVisible(true);
           
        }
        instancaiActualizarEmpleado.show();
        return instancaiActualizarEmpleado; 
    }
    /**
     * Metodo con la instancia de eliminar doctor 
     * @return instancia de eliminar doctor
     */
    private synchronized VistaEliminarDoctor getInstanciaEliminarDoctor(){
        if (instanciaEliminarDoctor == null){
            instanciaEliminarDoctor = new VistaEliminarDoctor(); 
            instanciaEliminarDoctor.setVisible(true);
            jDesktopPane1.add(instanciaEliminarDoctor);
            
        }else if (instanciaEliminarDoctor.isVisible() == false){
            instanciaEliminarDoctor.setVisible(true);
           
        }
        instanciaEliminarDoctor.show();
        return instanciaEliminarDoctor; 
    }
    /**
     * Metodo con la instancia de actualizar doctor 
     * @return instancia de actualizar doctor 
     */
    private synchronized VistaActualizarDoctor getInstanciaActualizarDoctor(){
        if (instanciaActualizarDoctor == null){
            instanciaActualizarDoctor = new VistaActualizarDoctor(); 
            instanciaActualizarDoctor.setVisible(true);
            jDesktopPane1.add(instanciaActualizarDoctor);
            
        }else if (instanciaActualizarDoctor.isVisible() == false){
            instanciaActualizarDoctor.setVisible(true);
           
        }
        instanciaActualizarDoctor.show();
        return instanciaActualizarDoctor; 
    }
    /**
     * Metodo con la instancia de ver cliente 
     * @return instancia de ver cliente 
     */
    private synchronized VistaVerCiente getInstanciaVerCliente(){
        if (instanciaVerCiente == null){
            instanciaVerCiente = new VistaVerCiente(); 
            instanciaVerCiente.setVisible(true);
            jDesktopPane1.add(instanciaVerCiente);
            
        }else if (instanciaVerCiente.isVisible() == false){
            instanciaVerCiente.setVisible(true);
           
        }
        instanciaVerCiente.show();
        return instanciaVerCiente; 
    }
    /**
     * Metodo con la instancia de eliminar cliente 
     * @return instancia de eliminar cliente
     */
    private synchronized VistaEliminarCliente getInstanciaEliminarCliente(){
        if (instanciaEliminarCliente == null){
            instanciaEliminarCliente = new VistaEliminarCliente();
             instanciaEliminarCliente.setVisible(true);
            jDesktopPane1.add(instanciaEliminarCliente);
            
        }else if (instanciaEliminarCliente.isVisible() == false){
            instanciaEliminarCliente.setVisible(true);
           
        }
        instanciaEliminarCliente.show();
        return instanciaEliminarCliente; 
    }
    /**
     * Metodo con la instancia de eliminar cita 
     * @return instancia de eliminar cita 
     */
    private synchronized VistaEliminarCita getInstanciaEliminarCita(){
        if (instanciaEliminarCita == null){
            instanciaEliminarCita = new VistaEliminarCita();
            instanciaEliminarCita.setVisible(true);
            jDesktopPane1.add(instanciaEliminarCita);
            
        }else if (instanciaEliminarCita.isVisible() == false){
            instanciaEliminarCita.setVisible(true);
           
        }
        instanciaEliminarCita.show();
        return instanciaEliminarCita; 
    }
    /**
     * Metodo con la instancia de buscar cliente 
     * @return instancia de buscar cliente 
     */
    private synchronized VistaBuscarCliente getInstanciaBuscarCliente(){
        if (instanciaBuscarCliente == null){
            instanciaBuscarCliente = new VistaBuscarCliente(); 
            instanciaBuscarCliente.setVisible(true);
            jDesktopPane1.add(instanciaBuscarCliente); 
        }else if (instanciaBuscarCliente.isVisible() == false){
            instanciaBuscarCliente.setVisible(true);
           // jDesktopPane1.add(instanciaVerCiente); 
        }
        instanciaBuscarCliente.show();
        return instanciaBuscarCliente; 
    }
    /**
     * Metodo con la instancia de buscar cita
     * @return instancia de buscar cita 
     */
    private synchronized VistaBuscarCita getInstanciaBuscarCita(){
        if (instanciaBuscarCita == null){
            instanciaBuscarCita = new VistaBuscarCita(); 
            instanciaBuscarCita.setVisible(true);
            jDesktopPane1.add(instanciaBuscarCita); 
        }else if (instanciaBuscarCita.isVisible() == false){
            instanciaBuscarCita.setVisible(true);
           // jDesktopPane1.add(instanciaVerCiente); 
        }
        instanciaBuscarCita.show();
        return instanciaBuscarCita; 
    }
    /**
     * Metodo con la instancia de buscar empleado 
     * @return instancia de buscar empleado 
     */
     private synchronized VistaBuscarEmpleado getInstanciaBuscarEmpleado(){
        if (instanciaBuscarEmpleado == null){
            instanciaBuscarEmpleado = new VistaBuscarEmpleado();
             instanciaBuscarEmpleado.setVisible(true);
            jDesktopPane1.add(instanciaBuscarEmpleado); 
        }else if (instanciaBuscarEmpleado.isVisible() == false){
            instanciaBuscarEmpleado.setVisible(true);
           // jDesktopPane1.add(instanciaVerCiente); 
        }
        instanciaBuscarEmpleado.show();
        return instanciaBuscarEmpleado; 
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuEmpleado = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuDoc = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        menuClien = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        menuCita = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setClosable(true);

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 153));
        jDesktopPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        menuEmpleado.setText("Acceso Empleado");

        jMenuItem1.setText("Crear");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuEmpleado.add(jMenuItem1);

        jMenuItem2.setText("Buscar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuEmpleado.add(jMenuItem2);

        jMenuItem3.setText("Mostrar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuEmpleado.add(jMenuItem3);

        jMenuItem4.setText("Eliminar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuEmpleado.add(jMenuItem4);

        jMenuItem5.setText("Actualizar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuEmpleado.add(jMenuItem5);

        jMenuBar1.add(menuEmpleado);

        menuDoc.setText("Acceso Doctor");

        jMenuItem6.setText("Actualizar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuDoc.add(jMenuItem6);

        jMenuItem7.setText("Eliminar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuDoc.add(jMenuItem7);

        jMenuBar1.add(menuDoc);

        menuClien.setText("Acceso Cliente");

        jMenuItem8.setText("Mostrar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuClien.add(jMenuItem8);

        jMenuItem9.setText("Buscar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menuClien.add(jMenuItem9);

        jMenuItem10.setText("Eliminar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        menuClien.add(jMenuItem10);

        jMenuBar1.add(menuClien);

        menuCita.setText("Acceso Cita");

        jMenuItem11.setText("Buscar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        menuCita.add(jMenuItem11);

        jMenuItem12.setText("Eliminar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        menuCita.add(jMenuItem12);

        jMenuBar1.add(menuCita);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Item con la instancia de agregar empleado 
     * @param evt  
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        getInstanciaAgregarEmpleado(); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    /**
     * Item con las instancia de ver empleado 
     * @param evt  
     */
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        getInstancaiVerEmpleado(); 
        instanciaVerEmpleado.mostrarDatos();
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    /**
     * Item con la getinstancia de eliminar empleado 
     * @param evt 
     */
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        getInstanciaEliminarEmpleado(); 
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    /**
     * Item con el getInstancia de actualizar empleado 
     * @param evt 
     */
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        getInstanciaActualizarEmpleado(); 
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    /**
     * Item con el getInstancia de actualizar doctor
     * @param evt 
     */
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        getInstanciaActualizarDoctor(); 
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    /**
     * Item con la instancia de eliminar doctor 
     * @param evt 
     */
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        getInstanciaEliminarDoctor(); 
    }//GEN-LAST:event_jMenuItem7ActionPerformed
    /**
     * Item con el getInstancia de ver cliente 
     * @param evt 
     */
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        getInstanciaVerCliente(); 
        instanciaVerCiente.mostrarDatos();
    }//GEN-LAST:event_jMenuItem8ActionPerformed
    /**
     * Item con el getInstancia de eliminar cliente 
     * @param evt  
     */
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       getInstanciaEliminarCliente(); 
    }//GEN-LAST:event_jMenuItem10ActionPerformed
    /**
     * Item con el getInstancia de eliminar cita 
     * @param evt 
     */
    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        getInstanciaEliminarCita(); 
    }//GEN-LAST:event_jMenuItem12ActionPerformed
    /**
     * Item con el getInstancia de buscar cliente 
     * @param evt 
     */
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        getInstanciaBuscarCliente(); 
    }//GEN-LAST:event_jMenuItem9ActionPerformed
    /**
     * Item con el getInstancia de buscar cita 
     * @param evt 
     */
    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       getInstanciaBuscarCita(); 
    }//GEN-LAST:event_jMenuItem11ActionPerformed
    /**
     * Item con el getInstancia de buscar empleado 
     * @param evt  
     */
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       getInstanciaBuscarEmpleado(); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu menuCita;
    private javax.swing.JMenu menuClien;
    private javax.swing.JMenu menuDoc;
    private javax.swing.JMenu menuEmpleado;
    // End of variables declaration//GEN-END:variables
}
