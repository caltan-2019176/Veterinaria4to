/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.carlosaltan.veterinaria.vsitaGraf;


/**
 *JInterFrame donde se hace la vista grafica de Doctor
 * @author Carlos Altán
 * @version 1.0
 */
public class VistaDoctorG extends javax.swing.JInternalFrame {
    //DOCTOR
    private static VistaAgregarDoctor instanciaAgregarDoctor = null; 
    private static VistaVerDoctor instanciaVerDoctor = null; 
    private static VistaEliminarDoctor instanciaEliminarDoctor = null; 
    private static VistaActualizarDoctor instanciaActualizarDoctor = null; 
    private static VistaBuscarDoctor instanciaBuscarDoctor = null; 
    //CLIENTE
    private static VistaEliminarCliente instanciaEliminarCliente = null;
    private static VistaVerCiente instanciaVerCiente = null; 
    private static VistaActualizarCliente instancVistaActualizarCliente = null; 
    private static VistaBuscarCliente instanciaBuscarCliente =null; 
    //MASCOTA
    private static VistaEliminarMascota instanciaEliminarMascota = null; 
    private static VistaActualizarMascota instanciaActualizarMascota = null;
    private static VistaVerMascota instanciaVerMascota = null; 
    private static VistaBuscarMascota instanciaBuscarMascota = null; 
    //CITA
    private static VistaVerCita instanciaVerCita = null; 
    private static VistaEliminarCita instanciaEliminarCita = null; 
    private static VistaBuscarCita instanciaBuscarCita = null; 
    /**
     * Creates new form VistaDoctor
     */
    public VistaDoctorG() {
        initComponents();
        
    }
    /**
     * Metodo con la instancia de agregar  doctor 
     * @return instancia agregar doctor 
     */
    private synchronized VistaAgregarDoctor getInstanciaAgregarDoctor(){
        if (instanciaAgregarDoctor == null){
            instanciaAgregarDoctor = new VistaAgregarDoctor();
            instanciaAgregarDoctor.setVisible(true);
            jDesktopPane1.add(instanciaAgregarDoctor); 
        }else if (instanciaAgregarDoctor.isVisible() == false){
            instanciaAgregarDoctor.setVisible(true);
           //jDesktopPane1.add(instanciaAgregarDoctor); 
        }
        instanciaAgregarDoctor.show();
        return instanciaAgregarDoctor; 
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
          //  jDesktopPane1.add(instanciaVerDoctor); 
        }
        instanciaVerDoctor.show();
        return instanciaVerDoctor; 
    }
    /**
     * Metodo con la instancia de eliminar doctor 
     * @return instancia de eiminar doctor 
     */
    private synchronized VistaEliminarDoctor getInstanciaEliminarDoctor(){
        if (instanciaEliminarDoctor == null){
            instanciaEliminarDoctor = new VistaEliminarDoctor();
             instanciaEliminarDoctor.setVisible(true);
            jDesktopPane1.add(instanciaEliminarDoctor); 
        }else if (instanciaEliminarDoctor.isVisible() == false){
            instanciaEliminarDoctor.setVisible(true);
           // jDesktopPane1.add(instanciaEliminarDoctor); 
        }
        instanciaEliminarDoctor.show();
        return instanciaEliminarDoctor; 
    }
    /**
     * Metodo con la instancia de actualizar doctor
     * @return instancia de actualizar doctor
     */
    private synchronized VistaActualizarDoctor getInstanciActualizarDoctor(){
        if (instanciaActualizarDoctor == null){
            instanciaActualizarDoctor = new VistaActualizarDoctor(); 
            instanciaActualizarDoctor.setVisible(true);
            jDesktopPane1.add(instanciaActualizarDoctor); 
        }else if (instanciaActualizarDoctor.isVisible() == false){
            instanciaActualizarDoctor.setVisible(true);
           // jDesktopPane1.add(instanciaActualizarDoctor); 
        }
        instanciaActualizarDoctor.show();
        return instanciaActualizarDoctor; 
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
          //  jDesktopPane1.add(instanciaEliminarCliente); 
        }
        instanciaEliminarCliente.show();
        return instanciaEliminarCliente; 
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
     * Metodo con la instancia de actualizar cliente
     * @return instancia de actualizar cliente
     */
    private synchronized VistaActualizarCliente getInstanciaActualizarCliente(){
        if (instancVistaActualizarCliente == null){
            instancVistaActualizarCliente = new VistaActualizarCliente(); 
            instancVistaActualizarCliente.setVisible(true);
            jDesktopPane1.add(instancVistaActualizarCliente); 
        }else if (instancVistaActualizarCliente.isVisible() == false){
            instancVistaActualizarCliente.setVisible(true);
            //jDesktopPane1.add(instancVistaActualizarCliente); 
        }
        instancVistaActualizarCliente.show();
        return instancVistaActualizarCliente; 
    }
    /**
     * Metodo con la instancia de eliminar mascota
     * @return instancia de eliminar mascota 
     */
    private synchronized VistaEliminarMascota getInstancVistaEliminarMascota(){
        if (instanciaEliminarMascota == null){
            instanciaEliminarMascota = new VistaEliminarMascota(); 
            instanciaEliminarMascota.setVisible(true);
            jDesktopPane1.add(instanciaEliminarMascota); 
        }else if (instanciaEliminarMascota.isVisible() == false){
            instanciaEliminarMascota.setVisible(true);
            //jDesktopPane1.add(instancVistaActualizarCliente); 
        }
        instanciaEliminarMascota.show();
        return instanciaEliminarMascota; 
    }
    /**
     * Metodo con la instancia de actualizar mascota
     * @return instancia de actualizar mascota
     */
    private synchronized VistaActualizarMascota getIndstanciaActualizarMascota(){
        if (instanciaActualizarMascota == null){
            instanciaActualizarMascota = new VistaActualizarMascota(); 
            instanciaActualizarMascota.setVisible(true);
            jDesktopPane1.add(instanciaActualizarMascota); 
        }else if (instanciaActualizarMascota.isVisible() == false){
            instanciaActualizarMascota.setVisible(true);
            //jDesktopPane1.add(instancVistaActualizarCliente); 
        }
        instanciaActualizarMascota.show();
        return instanciaActualizarMascota; 
    }
    /**
     * Metodo con la instancia de ver mascota
     * @return instancia de ver mascota 
     */
    private synchronized VistaVerMascota getInstanciaVerMascota(){
        if (instanciaVerMascota == null){
            instanciaVerMascota = new VistaVerMascota(); 
            instanciaVerMascota.setVisible(true);
            jDesktopPane1.add(instanciaVerMascota); 
        }else if (instanciaVerMascota.isVisible() == false){
            instanciaVerMascota.setVisible(true);
            //jDesktopPane1.add(instancVistaActualizarCliente); 
        }
        instanciaVerMascota.show();
        return instanciaVerMascota; 
    }  
    /**
     * Metodo con la instancia de ver cita
     * @return instancia de ver cita
     */
    private synchronized VistaVerCita getInstanciaVerCita(){
        if (instanciaVerCita == null){
            instanciaVerCita = new VistaVerCita(); 
             instanciaVerCita.setVisible(true);
            jDesktopPane1.add(instanciaVerCita); 
        }else if (instanciaVerCita.isVisible() == false){
            instanciaVerCita.setVisible(true);
            //jDesktopPane1.add(instancVistaActualizarCliente); 
        }
        instanciaVerCita.show();
        return instanciaVerCita; 
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
            //jDesktopPane1.add(instancVistaActualizarCliente); 
        }
        instanciaEliminarCita.show();
        return instanciaEliminarCita; 
    } 
    /**
     * Metodo con la instancia de buscar cita
     * @return instancia de buscar cita 
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
     * Metodo con la instancia de buscar mascota
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuDoc = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        menuMascota = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        menuCitas = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setClosable(true);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));
        jDesktopPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        menuDoc.setText("Acceso Doctor");

        jMenuItem1.setText("Crear");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuDoc.add(jMenuItem1);

        jMenuItem2.setText("Buscar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuDoc.add(jMenuItem2);

        jMenuItem3.setText("Mostrar");
        jMenuItem3.setToolTipText("");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuDoc.add(jMenuItem3);

        jMenuItem4.setText("Actualizar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuDoc.add(jMenuItem4);

        jMenuItem5.setText("Eliminar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuDoc.add(jMenuItem5);

        jMenuBar1.add(menuDoc);

        menuCliente.setText("Acceso Cliente");

        jMenuItem6.setText("Mostrar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuCliente.add(jMenuItem6);

        jMenuItem7.setText("Buscar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuCliente.add(jMenuItem7);

        jMenuItem8.setText("Actualizar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuCliente.add(jMenuItem8);

        jMenuItem9.setText("Eliminar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menuCliente.add(jMenuItem9);

        jMenuBar1.add(menuCliente);

        menuMascota.setText("Acceso Mascotas");

        jMenuItem10.setText("Mostrar");
        jMenuItem10.setActionCommand("");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        menuMascota.add(jMenuItem10);

        jMenuItem11.setText("Buscar");
        jMenuItem11.setActionCommand("");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        menuMascota.add(jMenuItem11);

        jMenuItem12.setText("Actualizar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        menuMascota.add(jMenuItem12);

        jMenuItem13.setText("Eliminar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        menuMascota.add(jMenuItem13);

        jMenuBar1.add(menuMascota);

        menuCitas.setText("Acceso Citas");

        jMenuItem14.setText("Mostrar");
        jMenuItem14.setToolTipText("");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        menuCitas.add(jMenuItem14);

        jMenuItem15.setText("Buscar");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        menuCitas.add(jMenuItem15);

        jMenuItem16.setText("Eliminar");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        menuCitas.add(jMenuItem16);

        jMenuBar1.add(menuCitas);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * JItem con el getInstancia de agregar doctor 
     * @param evt 
     */
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        getInstanciaAgregarDoctor(); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    /**
     * JItem con el getInstancia de ver doctor 
     * @param evt 
     */
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        getInstanciaVerDoctor(); 
        instanciaVerDoctor.mostrarDatos();
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    /**
     * JItem con el getInstancia de eliminar doctor 
     * @param evt 
     */
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        getInstanciaEliminarDoctor(); 
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    /**
     * JItem con el getInstancia de actualizar doctor 
     * @param evt 
     */
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        getInstanciActualizarDoctor(); 
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    /**
     * JItem con el getInstancia de ver cliente 
     * @param evt 
     */
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        getInstancaiVerCiente(); 
        instanciaVerCiente.mostrarDatos();
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    /**
     * JItem con el getInstancia de eliminar cliente 
     * @param evt 
     */
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        getInstanciaEliminarCliente();
    }//GEN-LAST:event_jMenuItem9ActionPerformed
    /**
     * JItem con el getInstancia de actualizar cliente 
     * @param evt 
     */
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        getInstanciaActualizarCliente(); 
    }//GEN-LAST:event_jMenuItem8ActionPerformed
    /**
     * JItem con el getInstancia de eliminar mascota
     * @param evt 
     */
    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
       getInstancVistaEliminarMascota(); 
    }//GEN-LAST:event_jMenuItem13ActionPerformed
    /**
     * JItem con el getInstancia de actualizar mascota
     * @param evt 
     */
    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        getIndstanciaActualizarMascota(); 
    }//GEN-LAST:event_jMenuItem12ActionPerformed
    /**
     * JItem con el getInstancia de ver mascota 
     * @param evt 
     */
    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        getInstanciaVerMascota(); 
        instanciaVerMascota.mostrarDatos();
    }//GEN-LAST:event_jMenuItem10ActionPerformed
    /**
     * JItem con el getInstancia de ver cita 
     * @param evt 
     */
    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        getInstanciaVerCita(); 
        instanciaVerCita.mostrarDatos();
    }//GEN-LAST:event_jMenuItem14ActionPerformed
    /**
     * JItem con el getInstancia de eliminar cita
     * @param evt 
     */
    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        getInstanciaEliminarCita(); 
    }//GEN-LAST:event_jMenuItem16ActionPerformed
    /**
     * JItem con el getInstancia de buscar cliente 
     * @param evt 
     */
    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        getInstanciaBuscarCliente(); 
    }//GEN-LAST:event_jMenuItem7ActionPerformed
    /**
     * JItem con el getInstancia de buscar doctor 
     * @param evt 
     */
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        getInstanciaBuscarDoctor(); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    /**
     * JItem con el getInstancia de buscar mascota 
     * @param evt 
     */
    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       getInstanciaBuscarMascota(); 
    }//GEN-LAST:event_jMenuItem11ActionPerformed
    /**
     * JItem con el getInstancia de buscar cita 
     * @param evt 
     */
    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
       getInstanciaBuscarCita(); 
    }//GEN-LAST:event_jMenuItem15ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu menuCitas;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuDoc;
    private javax.swing.JMenu menuMascota;
    // End of variables declaration//GEN-END:variables
}
