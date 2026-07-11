package Libreria_Read;

import controlador.BibliotecaController;
import modelo.Devolucion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmDevoluciones extends javax.swing.JPanel {
    private final BibliotecaController bibliotecaController;
    
    public frmDevoluciones() {
        this.bibliotecaController = new BibliotecaController();
        initComponents();
        actualizarTabla();
    }
    public void actualizarTabla() {
    DefaultTableModel model = (DefaultTableModel) tblDevoluciones.getModel();
    model.setRowCount(0);

    for (Devolucion d : bibliotecaController.obtenerDevolucionesPendientes()) {
        model.addRow(new Object[]{
            d.getDevolucionID(),
            d.getUsuarioID(),
            d.getLibroID()
        });
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCuerpo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDevolver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDevoluciones = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(750, 430));

        pnlCuerpo.setBackground(new java.awt.Color(255, 255, 255));
        pnlCuerpo.setForeground(new java.awt.Color(255, 255, 255));
        pnlCuerpo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Devolución de Libros");
        pnlCuerpo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 16, -1, -1));

        btnDevolver.setBackground(new java.awt.Color(0, 0, 0));
        btnDevolver.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnDevolver.setForeground(new java.awt.Color(255, 255, 255));
        btnDevolver.setText("Devolver");
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });
        pnlCuerpo.add(btnDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 230, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Libros prestados pendientes a devolución:");
        pnlCuerpo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        tblDevoluciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Prestamo", "Usuario", "Libro"
            }
        ));
        jScrollPane1.setViewportView(tblDevoluciones);

        pnlCuerpo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 620, 170));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Read/devolverr (1).png"))); // NOI18N
        pnlCuerpo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 0, 442, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        Devolucion d = bibliotecaController.procesarDevolucion();
        if (d == null) {
        JOptionPane.showMessageDialog(this, 
            "No hay devoluciones pendientes (PILA vacía).");
        return;
    }

    JOptionPane.showMessageDialog(this,
        "Devolución procesada:\n" +
        "N° Devolución: " + d.getDevolucionID() + "\n" +
        "Usuario: " + d.getUsuarioID() + "\n" +
        "Libro: " + d.getLibroID()
    );


    actualizarTabla();

    }//GEN-LAST:event_btnDevolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCuerpo;
    private javax.swing.JTable tblDevoluciones;
    // End of variables declaration//GEN-END:variables
}
