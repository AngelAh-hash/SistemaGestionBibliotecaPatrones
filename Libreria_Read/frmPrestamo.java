package Libreria_Read;

import controlador.BibliotecaController;
import modelo.Prestamo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmPrestamo extends javax.swing.JPanel {
    public frmLibros frmLibrosInstancia;
    private final BibliotecaController bibliotecaController;
    
    public frmPrestamo() {
        this.bibliotecaController = new BibliotecaController();
        initComponents();
        actualizarTabla();
    }
    
    private void  actualizarTabla(){
        DefaultTableModel model = (DefaultTableModel) tblColaPrestamos.getModel();
        model.setRowCount(0);

        for (Prestamo p : bibliotecaController.obtenerPrestamosPendientes()) {
            model.addRow(new Object[]{
                p.getSolicitudID(),
                p.getUsuarioID(),
                p.getLibroID()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCuerpo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblColaPrestamos = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtLibro = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btnSolicitar = new javax.swing.JButton();
        btnPrestar = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(750, 430));

        pnlCuerpo.setBackground(new java.awt.Color(255, 255, 255));
        pnlCuerpo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblColaPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Solicitud", "Usuario", "Libro"
            }
        ));
        jScrollPane1.setViewportView(tblColaPrestamos);

        pnlCuerpo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 320, 120));

        lblTitulo.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Nuevo Préstamo");
        pnlCuerpo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Text1.setForeground(new java.awt.Color(0, 0, 0));
        Text1.setText("Código de Libro");
        pnlCuerpo.add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        Text2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Text2.setForeground(new java.awt.Color(0, 0, 0));
        Text2.setText("Código de Usuario");
        pnlCuerpo.add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        pnlCuerpo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 10, 350));

        txtLibro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtLibro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtLibroMousePressed(evt);
            }
        });
        txtLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLibroActionPerformed(evt);
            }
        });
        pnlCuerpo.add(txtLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 260, 30));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        pnlCuerpo.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 260, 30));

        btnSolicitar.setBackground(new java.awt.Color(0, 0, 0));
        btnSolicitar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnSolicitar.setForeground(new java.awt.Color(255, 255, 255));
        btnSolicitar.setText("Solicitar Préstamo");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });
        pnlCuerpo.add(btnSolicitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 180, 40));

        btnPrestar.setBackground(new java.awt.Color(0, 0, 0));
        btnPrestar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnPrestar.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestar.setText("Prestar");
        btnPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestarActionPerformed(evt);
            }
        });
        pnlCuerpo.add(btnPrestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 180, 40));

        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Read/prestamo_readd.png"))); // NOI18N
        lblImagen.setMaximumSize(new java.awt.Dimension(750, 430));
        lblImagen.setMinimumSize(new java.awt.Dimension(750, 430));
        pnlCuerpo.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLibroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLibroMousePressed

    }//GEN-LAST:event_txtLibroMousePressed

    private void txtLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLibroActionPerformed

    }//GEN-LAST:event_txtLibroActionPerformed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed

    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        String usuario = txtUsuario.getText();
        String libro = txtLibro.getText();

        if (usuario.isEmpty() || libro.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Complete Usuario y Libro.");
        return;
        }

        bibliotecaController.solicitarPrestamo(usuario, libro);

        actualizarTabla();

        txtUsuario.setText("");
        txtLibro.setText("");
    }//GEN-LAST:event_btnSolicitarActionPerformed

    private void btnPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestarActionPerformed
        Prestamo p = bibliotecaController.procesarPrestamo();
        if (p == null) {
            JOptionPane.showMessageDialog(this, "No hay préstamos pendientes.");
            return;
        }
      
        JOptionPane.showMessageDialog(this, "Solicitud de préstamo N° " + p.getSolicitudID() + " procesado\n" +
                "Usuario: " + p.getUsuarioID() + "\n" +
                "Libro: " + p.getLibroID() + "\n" +
                "Estado: " + p.getEstado());

        // Actualizar tabla de frmLibros si tenemos referencia
        if (frmLibrosInstancia != null) {
            frmLibrosInstancia.actualizarTabla();
        }

        actualizarTabla();
    }//GEN-LAST:event_btnPrestarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JButton btnPrestar;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCuerpo;
    private javax.swing.JTable tblColaPrestamos;
    private javax.swing.JTextField txtLibro;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
