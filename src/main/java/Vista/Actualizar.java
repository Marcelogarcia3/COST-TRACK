/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Empleado;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Actualizar extends javax.swing.JFrame {

    Empleado empleado;
    int row;
    DefaultTableModel modelo;
    JTable tabla;
    
    
    public Actualizar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Actualizar(Empleado empleado, int row , JTable tabla) {
        
        initComponents();
        this.empleado= empleado;
        nombre.setText(empleado.getNombre()); 
        apellido.setText(empleado.getApellido());
        rut.setText(empleado.getRut());
        telefono.setText(String.valueOf(empleado.getTelefono()));
        rol.setText(empleado.getRol());
        salario.setText(String.valueOf(empleado.getSalario()));
        estado.setSelectedItem(empleado.getEstado());
        
        this.row=row;
        this.tabla=tabla;
        this.modelo=(DefaultTableModel)tabla.getModel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        rut = new javax.swing.JTextField();
        rol = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        salario = new javax.swing.JTextField();
        estado = new javax.swing.JComboBox();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel1.setText("Actualizar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 58, -1, 30));

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 98, -1, -1));

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 172, -1, 30));

        jLabel5.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel5.setText("Rut");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 133, -1, 30));

        jLabel6.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel6.setText("Salario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 250, -1, 30));

        jLabel7.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel7.setText("Estado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 301, -1, 30));

        jLabel8.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel8.setText("Rol");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 211, -1, 30));

        apellido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 97, 171, 30));

        nombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 61, 171, 30));

        rut.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rutFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rutFocusLost(evt);
            }
        });
        jPanel1.add(rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 136, 171, 30));

        rol.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jPanel1.add(rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 214, 171, 30));

        telefono.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 175, 171, 30));

        salario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 253, 171, 30));

        estado.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 304, -1, 30));

        btnGuardar.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 352, -1, 42));

        btnCancelar.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 352, -1, 42));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/jejej.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODOa add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        
        String nombre = this.nombre.getText();
        String apellido = this.apellido.getText();
        String rut= this.rut.getText();
        int telefono=Integer.parseInt(this.telefono.getText());
        String rol = this.rol.getText();
        int salario= Integer.parseInt(this.salario.getText());
        String estado = this.estado.getSelectedItem().toString();
        
        modelo.setValueAt(nombre, row, 0);
        modelo.setValueAt(apellido, row, 1);
        modelo.setValueAt(rut, row, 2);
        modelo.setValueAt(telefono, row, 3);
        modelo.setValueAt(rol, row, 4);
        modelo.setValueAt(salario, row, 5);
        modelo.setValueAt(estado, row, 6);
        
        this.setVisible(false);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void rutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rutFocusGained
        rut.setText("");
    }//GEN-LAST:event_rutFocusGained

    private void rutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rutFocusLost
        String rut="";
        String rutTemp=this.rut.getText();
        if(rutTemp.length()>0){
            String resto = rutTemp.substring(rutTemp.length()-1);
            String sub = rutTemp.substring(0,rutTemp.length()-1);
            rut="-"+resto;
            while(sub.length()>3){
                resto = sub.substring(sub.length()-3);
                sub = sub.substring(0,sub.length()-3);
                rut="."+resto+rut;
            }
            rut=sub+rut;
            this.rut.setText(rut);
        }
    }//GEN-LAST:event_rutFocusLost
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar().setVisible(true);
            }
        });
    }

    public JTextField getIntSalario() {
        return salario;
    }

    public JTextField getIntTelefono() {
        return telefono;
    }

    public JTextField getTxtApellido() {
        return apellido;
    }

    public JComboBox getTxtEstado() {
        return estado;
    }

    public JTextField getTxtNombre() {
        return nombre;
    }

    public JTextField getTxtRol() {
        return rol;
    }

    public JTextField getTxtRut() {
        return rut;
    }

    public void setRut(JTextField rut) {
        this.rut = rut;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField apellido;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JComboBox estado;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField nombre;
    public javax.swing.JTextField rol;
    public javax.swing.JTextField rut;
    public javax.swing.JTextField salario;
    public javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
