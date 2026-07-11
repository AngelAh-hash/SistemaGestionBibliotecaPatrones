package Libreria_Read;

import dao.BaseDatosMemoria;
import controlador.BibliotecaController;
import servicio.DataObserver;
import modelo.Usuarios;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class frmUsuarios extends javax.swing.JPanel implements DataObserver {
    private final BibliotecaController bibliotecaController;

    public frmUsuarios() {
        this.bibliotecaController = new BibliotecaController();
        initComponents();
        BaseDatosMemoria.getInstance().agregarObserver(this);
        actualizarTabla();
    }
    
    public void actualizarTabla() {

    DefaultTableModel model = (DefaultTableModel) tblUsuarios.getModel();
    model.setRowCount(0);

    java.util.List<Usuarios> usuarios = bibliotecaController.obtenerUsuarios();

    for (Usuarios u : usuarios) {
        model.addRow(new Object[]{
            u.getCodigo(),
            u.getNombre(),
            u.getApellidoP(),
            u.getApellidoM(),
            u.getTelefono()
        });
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        pnlCuerpo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        pnlCuerpo.setBackground(new java.awt.Color(255, 255, 255));
        pnlCuerpo.setPreferredSize(new java.awt.Dimension(750, 430));

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setText("Usuarios");

        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBuscar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Apellido Paterno", "Apellido Materno", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        btnNuevo.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Read/fondo.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Read/fondo1.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlCuerpoLayout = new javax.swing.GroupLayout(pnlCuerpo);
        pnlCuerpo.setLayout(pnlCuerpoLayout);
        pnlCuerpoLayout.setHorizontalGroup(
            pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlCuerpoLayout.createSequentialGroup()
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlCuerpoLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(581, 581, 581))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCuerpoLayout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCuerpoLayout.setVerticalGroup(
            pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        frmSubirUsuarios panelNuevo = new frmSubirUsuarios();
        panelNuevo.setSize(pnlCuerpo.getSize());
        panelNuevo.setLocation(0, 0);
        pnlCuerpo.removeAll();
        pnlCuerpo.add(panelNuevo, BorderLayout.CENTER);
        pnlCuerpo.revalidate();
        pnlCuerpo.repaint();
        btnNuevo.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila = tblUsuarios.getSelectedRow();

    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un usuario de la tabla.");
        return;
    }

    
    Usuarios u = bibliotecaController.obtenerUsuarioPorIndice(fila);

    if (u == null) {
        JOptionPane.showMessageDialog(this, "Usuario no encontrado en la lista.");
        return;
    }

    
    JTextField txtNombre = new JTextField(u.getNombre());
    JTextField txtApellidoP = new JTextField(u.getApellidoP());
    JTextField txtApellidoM = new JTextField(u.getApellidoM());
    JTextField txtTelefono = new JTextField(u.getTelefono());

    Object[] campos = {
        "Nombre:", txtNombre,
        "Apellido Paterno:", txtApellidoP,
        "Apellido Materno:", txtApellidoM,
        "Teléfono:", txtTelefono
    };

    int opcion = JOptionPane.showConfirmDialog(
            this, campos, "Editar Usuario", JOptionPane.OK_CANCEL_OPTION);

    if (opcion == JOptionPane.OK_OPTION) {
        
        String codigo = u.getCodigo();
        Usuarios nuevo = bibliotecaController.crearUsuarioManual(
                codigo,
                txtNombre.getText(),
                txtApellidoP.getText(),
                txtApellidoM.getText(),
                txtTelefono.getText()
        );

        boolean cambio = bibliotecaController.editarUsuario(fila, nuevo);

        if (cambio) {
            JOptionPane.showMessageDialog(this, "Usuario editado correctamente.");
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo editar el usuario.");
        }
    }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int fila = tblUsuarios.getSelectedRow();

        if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un usuario de la tabla.");
        return;
        }

        int opcion = JOptionPane.showConfirmDialog(
            this,
            "¿Está seguro de eliminar este usuario?",
            "Confirmar eliminación",
            JOptionPane.YES_NO_OPTION
        );

        if (opcion == JOptionPane.YES_OPTION) {
        String codigo = tblUsuarios.getValueAt(fila, 0).toString();
        boolean eliminado = bibliotecaController.eliminarUsuarioPorCodigo(codigo);

        if (eliminado) {
            actualizarTabla();
            JOptionPane.showMessageDialog(this, "Usuario eliminado.");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar el usuario en la lista.");
        }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigo = txtBuscar.getText().trim();

        if (codigo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un código para buscar.");
        return;
        }

        int fila = bibliotecaController.buscarIndiceUsuarioPorCodigo(codigo);

        if (fila == -1) {
        JOptionPane.showMessageDialog(this, "No se encontró un usuario con código: " + codigo);
        return;
        }

    tblUsuarios.setRowSelectionInterval(fila, fila);

    tblUsuarios.scrollRectToVisible(tblUsuarios.getCellRect(fila, 0, true));
    }//GEN-LAST:event_btnBuscarActionPerformed

    @Override
    public void onDataChanged() {
        actualizarTabla();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCuerpo;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
