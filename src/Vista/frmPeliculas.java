/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Datos.DatosPelicula;
import Logica.Pelicula;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jon
 */
public class frmPeliculas extends javax.swing.JDialog {

    DefaultTableModel modelo;
    DatosPelicula almacenaPeli = new DatosPelicula(20);
    Pelicula peliObj = new Pelicula();
    int posi;

    /**
     * Creates new form frmPeliculas
     */
    public frmPeliculas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        cmbBuscar = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeliculas = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int vColIndex) {
                return false;
            }};
            lblRegistros = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setTitle("Gestión de Películas");
            addWindowFocusListener(new java.awt.event.WindowFocusListener() {
                public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                    formWindowGainedFocus(evt);
                }
                public void windowLostFocus(java.awt.event.WindowEvent evt) {
                }
            });
            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowActivated(java.awt.event.WindowEvent evt) {
                    formWindowActivated(evt);
                }
            });

            jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

            lblBuscar.setText("Buscar por:");

            txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    txtBuscarKeyReleased(evt);
                }
            });

            cmbBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Título", "Género", "Tipo" }));

            btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
            btnAgregar.setText("Agregar");
            btnAgregar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAgregarActionPerformed(evt);
                }
            });

            btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
            btnActualizar.setText("Actualizar");
            btnActualizar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnActualizarActionPerformed(evt);
                }
            });

            btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
            btnEliminar.setText("Eliminar");
            btnEliminar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnEliminarActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(26, Short.MAX_VALUE)
                    .addComponent(lblBuscar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(cmbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(65, 65, 65)
                    .addComponent(btnAgregar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnActualizar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnEliminar)
                    .addGap(24, 24, 24))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBuscar)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregar)
                        .addComponent(btnActualizar)
                        .addComponent(btnEliminar))
                    .addContainerGap(24, Short.MAX_VALUE))
            );

            tblPeliculas.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
            ));
            jScrollPane1.setViewportView(tblPeliculas);

            lblRegistros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            lblRegistros.setText("Total de registros:");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addComponent(lblRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(29, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblRegistros)
                    .addContainerGap(15, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        frmAgregaPelicula win = new frmAgregaPelicula(null, true, almacenaPeli, -1, 1);
        win.setTitle("Agregar Película Nueva");
        win.setVisible(true);
        almacenaPeli = win.almacenaPeli;
        cargaTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowGainedFocus

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        if (tblPeliculas.getSelectedRow() >= 0) {
            frmAgregaPelicula win = new frmAgregaPelicula(null, true, almacenaPeli, tblPeliculas.getSelectedRow(), 2);
            win.setTitle("Actualizar Película");
            win.setVisible(true);
            almacenaPeli = win.almacenaPeli;
            cargaTabla();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:

        String titulos[] = {"ID", "Título", "Género", "Duración", "Idioma", "Clasificación",
            "Tipo"};
        modelo = new DefaultTableModel(null, titulos);

        for (int i = 0; i < almacenaPeli.getNumRegs(); i++) {
            peliObj = almacenaPeli.getRegistro(i);

            switch (cmbBuscar.getSelectedIndex()) {
                case 0:
                    if (peliObj.getTitulo().contains(txtBuscar.getText())) {
                        Object nuevaFila[] = {peliObj.getId(), peliObj.getTitulo(), peliObj.getGenero(),
                            peliObj.getDuracion(), peliObj.getIdioma(), peliObj.getClasif(),
                            peliObj.getTipo()};
                        modelo.addRow(nuevaFila);
                    }
                    break;
                case 1:
                    if (peliObj.getGenero().contains(txtBuscar.getText())) {
                        Object nuevaFila[] = {peliObj.getId(), peliObj.getTitulo(), peliObj.getGenero(),
                            peliObj.getDuracion(), peliObj.getIdioma(), peliObj.getClasif(),
                            peliObj.getTipo()};
                        modelo.addRow(nuevaFila);
                    }
                    break;
                case 2:
                    if (peliObj.getTipo().contains(txtBuscar.getText())) {
                        Object nuevaFila[] = {peliObj.getId(), peliObj.getTitulo(), peliObj.getGenero(),
                            peliObj.getDuracion(), peliObj.getIdioma(), peliObj.getClasif(),
                            peliObj.getTipo()};
                        modelo.addRow(nuevaFila);
                    }
                    break;
            }
        }
        tblPeliculas.setModel(modelo);

        lblRegistros.setText("Cantidad de registros: " + String.valueOf(modelo.getRowCount()));
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int filaselet=tblPeliculas.getSelectedRow();
        if(filaselet>=0){
            int desicion=JOptionPane.showConfirmDialog(null, "Está seguro de eliminar?");
            if(desicion==JOptionPane.YES_NO_OPTION){
            almacenaPeli.eliminar(posi, peliObj);
            modelo.removeRow(tblPeliculas.getSelectedRow());
            lblRegistros.setText("Cantidad de registros: " + String.valueOf(modelo.getRowCount()));
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(frmPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmPeliculas dialog = new frmPeliculas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    public void cargaTabla() {
        String titulos[] = {"ID", "Título", "Género", "Duración", "Idioma", "Clasificación",
            "Tipo"};
        modelo = new DefaultTableModel(null, titulos);

        for (int i = 0; i < almacenaPeli.getNumRegs(); i++) {
            peliObj = almacenaPeli.getRegistro(i);
            Object nuevaFila[] = {peliObj.getId(), peliObj.getTitulo(), peliObj.getGenero(),
                peliObj.getDuracion(), peliObj.getIdioma(), peliObj.getClasif(),
                peliObj.getTipo()};
            modelo.addRow(nuevaFila);
        }
        tblPeliculas.setModel(modelo);

        lblRegistros.setText("Cantidad de registros: " + String.valueOf(modelo.getRowCount()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblRegistros;
    private javax.swing.JTable tblPeliculas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
