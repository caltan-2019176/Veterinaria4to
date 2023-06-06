/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosaltan.veterinaria.vsitaGraf;

/**
 *JInternalFrame donde se hace la vista grafica de Cliente
 * @author Carlos Altán
 * @version 1.0
 */
public class VistaClienteG extends javax.swing.JInternalFrame {

    //cliente
    private static VistaAgregarCliente instanciaAgregarCliente = null;
    private static VistaVerCiente instanciaVerCiente = null;
    private static VistaBuscarCliente instanciaBuscarCliente =null; 
    //mascota
    private static VistaAgregarMascota instanciaAgregarMascota = null; 
    private static VistaVerMascota instancVistaVerMascota = null; 
    private static VistaBuscarMascota instanciaBuscarMascota = null; 
    //cita 
    private static VistaAgregarCita instanciaAgregarCita = null; 
    private static VistaEliminarCita instanciaEliminarCita = null; 
    private static VistaActualizarCita instanciarActualizarCita = null; 
     
    //doctor
    private static VistaVerDoctor instanciaVerDoctor = null; 
    private static VistaBuscarDoctor instanciaBuscarDoctor = null; 
    /**
     * Creates new form VistaClienteG
     */
    public VistaClienteG() {
        initComponents();
    }
    /**
     * Metodo con la instancia de agregar cliente  
     * @return instancia agregar cliente 
     */
    private synchronized VistaAgregarCliente getInstanciAgregarCliente(){
        if (instanciaAgregarCliente == null){
            instanciaAgregarCliente = new VistaAgregarCliente();
             instanciaAgregarCliente.setVisible(true);
            jDesktopPane1.add(instanciaAgregarCliente);
            
        }else if (instanciaAgregarCliente.isVisible() == false){
            instanciaAgregarCliente.setVisible(true);
           // jDesktopPane1.add(instanciaAgregarCliente); 
        }
        instanciaAgregarCliente.show();
        return instanciaAgregarCliente; 
    }
    /**
     * Metodo con la instancia de ver cliente 
     * @return instancia de ver cliente
     */
    private synchronized VistaVerCiente getInstancaiVerCiente(){
        if (instanciaVerCiente == null){
            instanciaVerCiente = new VistaVerCiente(); 
             instanciaVerCiente.setVisible(true);
            jDesktopPane1.add(instanciaVerCiente); 
        }else if (instanciaVerCiente.isVisible() == false){
            instanciaVerCiente.setVisible(true);
           // jDesktopPane1.add(instanciaVerCiente); 
        }
        instanciaVerCiente.show();
        return instanciaVerCiente; 
    }
    /**
     * Metodo con la instancia de agregar mascota
     * @return instancia de agregar mascota 
     */
    private synchronized VistaAgregarMascota getInstancaiAgregarMascota(){
        if (instanciaAgregarMascota == null){
            instanciaAgregarMascota = new VistaAgregarMascota();
            instanciaAgregarMascota.setVisible(true);
            jDesktopPane1.add(instanciaAgregarMascota); 
        }else if (instanciaAgregarMascota.isVisible() == false){
            instanciaAgregarMascota.setVisible(true);
           // jDesktopPane1.add(instanciaVerCiente); 
        }
        instanciaAgregarMascota.show();
        return instanciaAgregarMascota; 
    }
    /**
     * Metodo con la instancia de ver mascota 
     * @return instancia de ver mascota 
     */
    private synchronized VistaVerMascota getInstanciaVerMascota(){
        if (instancVistaVerMascota == null){
            instancVistaVerMascota = new VistaVerMascota(); 
            instancVistaVerMascota.setVisible(true);
            jDesktopPane1.add(instancVistaVerMascota); 
        }else if (instancVistaVerMascota.isVisible() == false){
            instancVistaVerMascota.setVisible(true);
           // jDesktopPane1.add(instanciaVerCiente); 
        }
        instancVistaVerMascota.show();
        return instancVistaVerMascota; 
    }
    /**
     * Metodo con la instancia agregar cita 
     * @return instancia de agregar cita 
     */
    private synchronized VistaAgregarCita getInstanciaAgregarCita(){
        if (instanciaAgregarCita == null){
            instanciaAgregarCita = new VistaAgregarCita(); 
            instanciaAgregarCita.setVisible(true);
            jDesktopPane1.add(instanciaAgregarCita); 
        }else if (instanciaAgregarCita.isVisible() == false){
            instanciaAgregarCita.setVisible(true);
           // jDesktopPane1.add(instanciaVerCiente); 
        }
        instanciaAgregarCita.show();
        return instanciaAgregarCita; 
    }
    /**
     * Metodo con la instancia de eliminar cita 
     * @return instancia de eliminar cita 
     */
    private synchronized VistaEliminarCita getInstanciaEliminarrCita(){
        if (instanciaEliminarCita == null){
            instanciaEliminarCita = new VistaEliminarCita(); 
            instanciaEliminarCita.setVisible(true);
            jDesktopPane1.add(instanciaEliminarCita); 
        }else if (instanciaEliminarCita.isVisible() == false){
            instanciaEliminarCita.setVisible(true);
           // jDesktopPane1.add(instanciaVerCiente); 
        }
        instanciaEliminarCita.show();
        return instanciaEliminarCita; 
    }
    /**
     * Metodo con la instancia de actualizar cita 
     * @return instancia de actualizar cita 
     */
    private synchronized VistaActualizarCita getInstanciActualizarCita(){
        if (instanciarActualizarCita == null){
            instanciarActualizarCita = new VistaActualizarCita(); 
            instanciarActualizarCita.setVisible(true);
            jDesktopPane1.add(instanciarActualizarCita); 
        }else if (instanciarActualizarCita.isVisible() == false){
            instanciarActualizarCita.setVisible(true);
           // jDesktopPane1.add(instanciaVerCiente); 
        }
        instanciarActualizarCita.show();
        return instanciarActualizarCita; 
    }
    /**
     * Metodo con la instancia de ver doctor 
     * @return instancia de ver doctor 
     */
    private synchronized VistaVerDoctor getInstanciaVerDoctor(){
        if (instanciaVerDoctor == null){
            instanciaVerDoctor = new VistaVerDoctor();
             instanciaVerDoctor.setVisible(true);
            jDesktopPane1.add(instanciaVerDoctor); 
        }else if (instanciaVerDoctor.isVisible() == false){
            instanciaVerDoctor.setVisible(true);
           // jDesktopPane1.add(instanciaVerCiente); 
        }
        instanciaVerDoctor.show();
        return instanciaVerDoctor; 
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
     * Metodo con la instancia de buscar doctor
     * @return instancia de buscar doctor 
     */
    private synchronized VistaBuscarDoctor getInstanciaBuscarDoctor(){
        if (instanciaBuscarDoctor == null){
            instanciaBuscarDoctor = new VistaBuscarDoctor(); 
            instanciaBuscarDoctor.setVisible(true);
            jDesktopPane1.add(instanciaBuscarDoctor); 
        }else if (instanciaBuscarDoctor.isVisible() == false){
            instanciaBuscarDoctor.setVisible(true);
           // jDesktopPane1.add(instanciaVerCiente); 
        }
        instanciaBuscarDoctor.show();
        return instanciaBuscarDoctor; 
    }
    /**
     * Metodo con la instancia de buscar masctoa
     * @return instancia de buscar mascota
     */
    private synchronized VistaBuscarMascota getInstanciaBuscarMascota(){
        if (instanciaBuscarMascota == null){
            instanciaBuscarMascota = new VistaBuscarMascota();
              instanciaBuscarMascota.setVisible(true);
            jDesktopPane1.add(instanciaBuscarMascota); 
        }else if (instanciaBuscarMascota.isVisible() == false){
            instanciaBuscarMascota.setVisible(true);
           // jDesktopPane1.add(instanciaVerCiente); 
        }
        instanciaBuscarMascota.show();
        return instanciaBuscarMascota; 
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
        MenuCliente = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuDoc = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuMascota = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        menuCita = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        setClosable(true);

        jDesktopPane1.setBackground(new java.awt.Color(204, 153, 255));
        jDesktopPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        MenuCliente.setText("Acceso Cliente");

        jMenuItem1.setText("Crear");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuCliente.add(jMenuItem1);

        jMenuItem2.setText("Mostrar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenuCliente.add(jMenuItem2);

        jMenuItem3.setText("Buscar Id");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MenuCliente.add(jMenuItem3);

        jMenuBar1.add(MenuCliente);

        menuDoc.setText("Acceso Doctor");

        jMenuItem4.setText("Ver Doctores");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuDoc.add(jMenuItem4);

        jMenuItem5.setText("Buscar Doctor");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuDoc.add(jMenuItem5);

        jMenuBar1.add(menuDoc);

        menuMascota.setText("Mascota");

        jMenuItem6.setText("Agregar Mascota");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuMascota.add(jMenuItem6);

        jMenuItem7.setText("Buscar Mascota");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuMascota.add(jMenuItem7);

        jMenuItem8.setText("Ver Mascota");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuMascota.add(jMenuItem8);

        jMenuBar1.add(menuMascota);

        menuCita.setText("Cita");

        jMenuItem9.setText("Agregar Cita");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menuCita.add(jMenuItem9);

        jMenuItem10.setText("Actualizar Cita");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        menuCita.add(jMenuItem10);

        jMenuItem11.setText("Eliminar Cita");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        menuCita.add(jMenuItem11);

        jMenuBar1.add(menuCita);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Action performed de JMenuItem 1 con el getInstancia de agregar cliente 
 * @param evt 
 */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        getInstanciAgregarCliente(); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed
/**
 * Action performed de JMenuItem 2 con el getInstancia de ver cliente 
 * @param evt 
 */
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        getInstancaiVerCiente(); 
        instanciaVerCiente.mostrarDatos();
    }//GEN-LAST:event_jMenuItem2ActionPerformed
/**
 * Action performed de JMenuItem 6 con el getInstancia de agregar mascota
 * @param evt 
 */
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        getInstancaiAgregarMascota(); 
    }//GEN-LAST:event_jMenuItem6ActionPerformed
/**
 * Action performed de JMenuItem 8 con el getInstancia de ver mascota 
 * @param evt 
 */
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        getInstanciaVerMascota(); 
        instancVistaVerMascota.mostrarDatos();
    }//GEN-LAST:event_jMenuItem8ActionPerformed
/**
 * Action performed de JMenuItem 9 con el getInstancia de agregar cita 
 * @param evt 
 */
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        getInstanciaAgregarCita(); 
    }//GEN-LAST:event_jMenuItem9ActionPerformed
/**
 * Action performed de JMenuItem 11 con el getInstancia de aliminar cita 
 * @param evt 
 */
    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        getInstanciaEliminarrCita(); 
    }//GEN-LAST:event_jMenuItem11ActionPerformed
/**
 * Action performed de JMenuItem 10 con el getInstancia de actualizar cita 
 * @param evt 
 */
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        getInstanciActualizarCita(); 
       
    }//GEN-LAST:event_jMenuItem10ActionPerformed
/**
 * Action performed de JMenuItem 4 con el getInstancia de ver doctor 
 * @param evt 
 */
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        getInstanciaVerDoctor(); 
        instanciaVerDoctor.mostrarDatos();
    }//GEN-LAST:event_jMenuItem4ActionPerformed
/**
 * Action performed de JMenuItem 3 con el getInstancia de buscar cliente 
 * @param evt 
 */
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        getInstanciaBuscarCliente(); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    /**
     * Action performed de JMenuItem 5 con el getInstancia de buscar doctor 
     * @param evt 
     */
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        getInstanciaBuscarDoctor(); 
    }//GEN-LAST:event_jMenuItem5ActionPerformed
/**
 * Action performed de JMenuItem 7 con el getInstancia de buscar mascota 
 * @param evt 
 */
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       getInstanciaBuscarMascota(); 
    }//GEN-LAST:event_jMenuItem7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCliente;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu menuCita;
    private javax.swing.JMenu menuDoc;
    private javax.swing.JMenu menuMascota;
    // End of variables declaration//GEN-END:variables
}
