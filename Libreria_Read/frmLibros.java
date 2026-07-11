package Libreria_Read;

import dao.BaseDatosMemoria;
import controlador.BibliotecaController;
import servicio.DataObserver;
import modelo.Libros;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class frmLibros extends javax.swing.JPanel implements DataObserver {
    private final BibliotecaController bibliotecaController;
    
    public frmLibros() {
        this.bibliotecaController = new BibliotecaController();
        initComponents(); 
        BaseDatosMemoria.getInstance().agregarObserver(this);
        actualizarTabla();
    }
    
     public void actualizarTabla() {

    DefaultTableModel model = (DefaultTableModel) tblLibros.getModel();
    model.setRowCount(0);

    java.util.List<Libros> libros = bibliotecaController.obtenerLibros();

    for (Libros l : libros) {
        model.addRow(new Object[]{
            l.getLibroID(),
            l.getTitulo(),
            l.getAutor(),
            l.getIdioma(),
            l.getPaginas(),
            l.getDisponibles()
        });
    }
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCuerpo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(750, 430));

        pnlCuerpo.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        lblTitulo.setText("Libros");

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        tblLibros.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Título", "Autor", "Idioma", "Páginas", "Disponibles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLibros.getTableHeader().setReorderingAllowed(false);
        tblLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblLibrosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblLibros);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setPreferredSize(new java.awt.Dimension(80, 32));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setPreferredSize(new java.awt.Dimension(80, 27));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(80, 27));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.setPreferredSize(new java.awt.Dimension(80, 27));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Read/fondo.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_Read/fondo1.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlCuerpoLayout = new javax.swing.GroupLayout(pnlCuerpo);
        pnlCuerpo.setLayout(pnlCuerpoLayout);
        pnlCuerpoLayout.setHorizontalGroup(
            pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlCuerpoLayout.createSequentialGroup()
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCuerpoLayout.setVerticalGroup(
            pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed

    }//GEN-LAST:event_txtBuscarMousePressed

    private void tblLibrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibrosMousePressed

    }//GEN-LAST:event_tblLibrosMousePressed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        frmSubirLibros panelNuevo = new frmSubirLibros();
        panelNuevo.setSize(pnlCuerpo.getSize());
        panelNuevo.setLocation(0, 0);
        pnlCuerpo.removeAll();
        pnlCuerpo.add(panelNuevo, BorderLayout.CENTER);
        pnlCuerpo.revalidate();
        pnlCuerpo.repaint();
        btnNuevo.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila = tblLibros.getSelectedRow();

            if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione un libro de la tabla.");
        return;
        }

        String id = tblLibros.getValueAt(fila, 0).toString();

        Libros libro = bibliotecaController.buscarLibroPorID(id);

        if (libro == null) {
        JOptionPane.showMessageDialog(this, "Libro no encontrado en la lista.");
        return;
        }

        JTextField txtTitulo = new JTextField(libro.getTitulo());
        JTextField txtAutor = new JTextField(libro.getAutor());
        JTextField txtIdioma = new JTextField(libro.getIdioma());
        JTextField txtPaginas = new JTextField(String.valueOf(libro.getPaginas()));
        JTextField txtDisp = new JTextField(String.valueOf(libro.getDisponibles()));

        Object[] campos = {
        "Título:", txtTitulo,
        "Autor:", txtAutor,
        "Idioma:", txtIdioma,
        "Páginas:", txtPaginas,
        "Disponibles:", txtDisp
    };

    int opcion = JOptionPane.showConfirmDialog(
            this, campos, "Editar Libro", JOptionPane.OK_CANCEL_OPTION);

    if (opcion == JOptionPane.OK_OPTION) {

        
        Libros nuevo = bibliotecaController.crearLibro(
            libro.getLibroID(),
            txtTitulo.getText(),
            txtAutor.getText(),
            txtIdioma.getText(),
            Integer.parseInt(txtPaginas.getText()),
            Integer.parseInt(txtDisp.getText())
        );

        boolean cambio = bibliotecaController.editarLibro(id, nuevo);

        if (cambio) {
            JOptionPane.showMessageDialog(this, "Libro editado correctamente.");
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo editar el libro.");
        }
    }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int fila = tblLibros.getSelectedRow();

    if (fila == -1) {
        JOptionPane.showMessageDialog(this,
                "Seleccione un libro de la tabla.",
                "Aviso",
                JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Obtener el ID desde la tabla
    String id = tblLibros.getValueAt(fila, 0).toString();

    int opcion = JOptionPane.showConfirmDialog(
            this,
            "¿Está seguro de borrar el libro con ID: " + id + "?",
            "Confirmar eliminación",
            JOptionPane.YES_NO_OPTION
    );

    if (opcion != JOptionPane.YES_OPTION) {
        return;
    }

    boolean eliminado = bibliotecaController.eliminarLibroPorID(id);

    if (eliminado) {
        JOptionPane.showMessageDialog(this, "Libro eliminado correctamente.");
        actualizarTabla();
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo eliminar el libro. ID no encontrado.");
    }

    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String id = txtBuscar.getText().trim();

    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Ingrese un código de libro para buscar.",
                "Aviso",
                JOptionPane.WARNING_MESSAGE);
        return;
    }

    Libros libro = bibliotecaController.buscarLibroPorID(id);

    if (libro == null) {
        JOptionPane.showMessageDialog(this,
                "No se encontró un libro con el código: " + id,
                "No encontrado",
                JOptionPane.ERROR_MESSAGE);
        return;
    }

    DefaultTableModel modelo = (DefaultTableModel) tblLibros.getModel();
    modelo.setRowCount(0);

    modelo.addRow(new Object[]{
        libro.getLibroID(),
        libro.getTitulo(),
        libro.getAutor(),
        libro.getIdioma(),
        libro.getPaginas(),
        libro.getDisponibles()
    });
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCuerpo;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
