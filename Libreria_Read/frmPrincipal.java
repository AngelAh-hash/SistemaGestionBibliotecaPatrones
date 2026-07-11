/*MARVIN VARGAS U21320420*/
package Libreria_Read;

import java.awt.BorderLayout;
import java.time.LocalDate;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        pnlContenido.setLayout(new BorderLayout());
        
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"," ;Septiembre"
            ,"Octubre","Noviembre","Diciemrbre"};
        lblFecha.setText("Hoy es "+dia+" de "+meses[month - 1]+" de "+year);
        
        mostrarPrincipal();
    }

    private void mostrarPrincipal() {
        frmCon_Prin p1 = new frmCon_Prin();
        p1.setSize(750, 430);
        p1.setLocation(0, 0);

        pnlContenido.removeAll();
        pnlContenido.add(p1, BorderLayout.CENTER);
        pnlContenido.revalidate();
        pnlContenido.repaint();
    }

    private void mostrarPanel(javax.swing.JPanel panel) {
        panel.setSize(750, 430);
        panel.setLocation(0, 0);

        pnlContenido.removeAll();
        pnlContenido.add(panel, BorderLayout.CENTER);
        pnlContenido.revalidate();
        pnlContenido.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        appName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnPrincipal = new javax.swing.JButton();
        btnPrestamos = new javax.swing.JButton();
        btnDevoluciones = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnLibros = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        navText = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        pnlContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(51, 51, 51));
        menu.setPreferredSize(new java.awt.Dimension(270, 431));

        appName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName.setText("Biblioteca Legendaria");

        btnPrincipal.setBackground(new java.awt.Color(61, 61, 61));
        btnPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setText("Principal");
        btnPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnPrincipal.setBorderPainted(false);
        btnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        btnPrestamos.setBackground(new java.awt.Color(61, 61, 61));
        btnPrestamos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestamos.setText("Préstamos");
        btnPrestamos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnPrestamos.setBorderPainted(false);
        btnPrestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamosActionPerformed(evt);
            }
        });

        btnDevoluciones.setBackground(new java.awt.Color(61, 61, 61));
        btnDevoluciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDevoluciones.setForeground(new java.awt.Color(255, 255, 255));
        btnDevoluciones.setText("Devoluciones");
        btnDevoluciones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnDevoluciones.setBorderPainted(false);
        btnDevoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionesActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(61, 61, 61));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnLibros.setBackground(new java.awt.Color(61, 61, 61));
        btnLibros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnLibros.setText("Libros");
        btnLibros.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnLibros.setBorderPainted(false);
        btnLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnDevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(btnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnDevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(50, 50, 50))
        );

        background.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        header.setBackground(new java.awt.Color(102, 102, 102));
        header.setPreferredSize(new java.awt.Dimension(780, 150));

        navText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        navText.setText("Administración/Control/Biblioteca");

        lblFecha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFecha.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha)
                    .addComponent(navText))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(navText)
                .addGap(27, 27, 27)
                .addComponent(lblFecha)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 750, -1));

        mensaje.setText("Ayudando a tu saber!");
        background.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 25, 514, 37));

        pnlContenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlContenidoLayout = new javax.swing.GroupLayout(pnlContenido);
        pnlContenido.setLayout(pnlContenidoLayout);
        pnlContenidoLayout.setHorizontalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        pnlContenidoLayout.setVerticalGroup(
            pnlContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        background.add(pnlContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 750, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        mostrarPrincipal();
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamosActionPerformed
        mostrarPanel(new frmPrestamo());
    }//GEN-LAST:event_btnPrestamosActionPerformed

    private void btnDevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionesActionPerformed
        mostrarPanel(new frmDevoluciones());
    }//GEN-LAST:event_btnDevolucionesActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        mostrarPanel(new frmUsuarios());
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
        mostrarPanel(new frmLibros());
    }//GEN-LAST:event_btnLibrosActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appName;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnDevoluciones;
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnPrestamos;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel navText;
    private javax.swing.JPanel pnlContenido;
    // End of variables declaration//GEN-END:variables
}
