/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administrador;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    ArrayList<Pizza> lista=new ArrayList<Pizza>();
    ArrayList<PizzaJal> lista2=new ArrayList<PizzaJal>();
    ArrayList<PizzaPG> lista3=new ArrayList<PizzaPG>();
    int Indice = 0;
    String nombresucursal;
    
    public Administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        lblsucursalA = new javax.swing.JLabel();
        lblpizzas = new javax.swing.JLabel();
        lblnombrepizzaA = new javax.swing.JLabel();
        lbldescripcionA = new javax.swing.JLabel();
        sucursal = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtDescripcion = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePizza = new javax.swing.JTable();
        lblprecioA = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btncrearpizza = new javax.swing.JButton();
        btnOrdenes = new javax.swing.JButton();
        number = new javax.swing.JLabel();
        lbladministracion = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblsucursalA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblsucursalA.setText("Sucursal");

        lblpizzas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblpizzas.setForeground(new java.awt.Color(153, 0, 0));
        lblpizzas.setText("Pizzas");

        lblnombrepizzaA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblnombrepizzaA.setText("Nombre:");

        lbldescripcionA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbldescripcionA.setText("Descripci??n:");

        sucursal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sucursal.setForeground(new java.awt.Color(0, 51, 102));
        sucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guatemala", "Jalapa", "El Progreso" }));
        sucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jTablePizza.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTablePizza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Descripci??n", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePizza);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        lblprecioA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblprecioA.setText("Precio:");

        btncrearpizza.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 18)); // NOI18N
        btncrearpizza.setForeground(new java.awt.Color(255, 0, 51));
        btncrearpizza.setText("Crear");
        btncrearpizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearpizzaActionPerformed(evt);
            }
        });

        btnOrdenes.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        btnOrdenes.setForeground(new java.awt.Color(0, 0, 255));
        btnOrdenes.setText("Ir a Ordenes");
        btnOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrdenesMouseClicked(evt);
            }
        });
        btnOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenesActionPerformed(evt);
            }
        });

        number.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbldescripcionA)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblnombrepizzaA)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblprecioA)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblsucursalA)
                                        .addGap(47, 47, 47)
                                        .addComponent(sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblpizzas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncrearpizza, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsucursalA)
                    .addComponent(sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenes))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpizzas)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombrepizzaA)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblprecioA)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldescripcionA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncrearpizza, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbladministracion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lbladministracion.setForeground(new java.awt.Color(153, 0, 0));
        lbladministracion.setText("ADMINISTRACION");
        lbladministracion.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbladministracion)
                .addGap(262, 262, 262))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbladministracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenesActionPerformed

    }//GEN-LAST:event_btnOrdenesActionPerformed

    private void btnOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdenesMouseClicked
        Ordenes ordenes=new Ordenes();
        ordenes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrdenesMouseClicked

    private void btncrearpizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearpizzaActionPerformed
        switch(Indice){
            case 0:
            Pizza pizza=new Pizza(txtNombre.getText(),txtDescripcion.getText(),txtPrecio.getText());
            lista.add(pizza);
            break;
            case 1:
            PizzaJal pizzaJal=new PizzaJal(txtNombre.getText(),txtDescripcion.getText(),txtPrecio.getText());
            lista2.add(pizzaJal);
            break;
            case 2:
            PizzaPG pizzaPG=new PizzaPG(txtNombre.getText(),txtDescripcion.getText(),txtPrecio.getText());
            lista3.add(pizzaPG);
            break;
        }
        //Pizza pizza=new Pizza(txtNombre.getText(),txtDescripcion.getText(),txtPrecio.getText());
        //lista.add(pizza);

        mostrar();
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
    }//GEN-LAST:event_btncrearpizzaActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void sucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalActionPerformed
        Indice = sucursal.getSelectedIndex();
        
        if (Indice == 0) {
            nombresucursal = "Guatemala";
        }
        if (Indice == 1) {
            nombresucursal = "Jalapa";
        }
        if (Indice == 2) {
            nombresucursal = "El Progreso";
        }
    }//GEN-LAST:event_sucursalActionPerformed

    public void mostrar()
    {
        String matris[][]=new String[lista.size()][3];
        String matris2[][]=new String[lista2.size()][3];
        String matris3[][]=new String[lista3.size()][3];
        
        
        switch(Indice){
            case 0:
                for (int i = 0; i < lista.size(); i++) {
            
                matris[i][0]=lista.get(i).getNombre();
                matris[i][1]=lista.get(i).getDescripcion();
                matris[i][2]=lista.get(i).getPrecio();
                }
                break;
            case 1:
                for (int i = 0; i < lista2.size(); i++) {
            
                matris2[i][0]=lista2.get(i).getNombre();
                matris2[i][1]=lista2.get(i).getDescripcion();
                matris2[i][2]=lista2.get(i).getPrecio();
                }
                break;
            case 2:
                for (int i = 0; i < lista3.size(); i++) {
            
                matris3[i][0]=lista3.get(i).getNombre();
                matris3[i][1]=lista3.get(i).getDescripcion();
                matris3[i][2]=lista3.get(i).getPrecio();
                }
                break;
        }
        /*for (int i = 0; i < lista.size(); i++) {
            
            matris[i][0]=lista.get(i).getNombre();
            matris[i][1]=lista.get(i).getDescripcion();
            matris[i][2]=lista.get(i).getPrecio();
        }*/
        switch (Indice){
            case 0:
                jTablePizza.setModel(new javax.swing.table.DefaultTableModel(
                    matris,
                    new String [] {
                        "Nombre", "Descripci??n", "Precio"
                    }
                ) {
                    boolean[] canEdit = new boolean [] {
                        false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });break;
            case 1:
                jTablePizza.setModel(new javax.swing.table.DefaultTableModel(
                    matris2,
                    new String [] {
                        "Nombre", "Descripci??n", "Precio"
                    }
                ) {
                    boolean[] canEdit = new boolean [] {
                        false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });break;
            case 2:
                jTablePizza.setModel(new javax.swing.table.DefaultTableModel(
                    matris3,
                    new String [] {
                        "Nombre", "Descripci??n", "Precio"
                    }
                ) {
                    boolean[] canEdit = new boolean [] {
                        false, false, false
                    };

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });break;
        }
    }
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrdenes;
    private javax.swing.JButton btncrearpizza;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePizza;
    private javax.swing.JLabel lbladministracion;
    private javax.swing.JLabel lbldescripcionA;
    private javax.swing.JLabel lblnombrepizzaA;
    private javax.swing.JLabel lblpizzas;
    private javax.swing.JLabel lblprecioA;
    private javax.swing.JLabel lblsucursalA;
    private javax.swing.JLabel number;
    private javax.swing.JComboBox<String> sucursal;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
