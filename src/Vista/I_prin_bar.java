/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author JUAN JOSE
 */
public class I_prin_bar extends javax.swing.JFrame {

    /**
     * Creates new form I_prin_bar
     */
    public I_prin_bar() {
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

        lblPinBar = new javax.swing.JPanel();
        lblBienveniddo = new javax.swing.JLabel();
        lblBoricuasSystem = new javax.swing.JLabel();
        jMenuBar4 = new javax.swing.JMenuBar();
        Productos = new javax.swing.JMenu();
        AgergarProductos = new javax.swing.JMenuItem();
        BuscarProducto = new javax.swing.JMenuItem();
        Vender = new javax.swing.JMenu();
        Generarfactura = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        lblPinBar.setBackground(new java.awt.Color(0, 153, 153));
        lblPinBar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4), "prin bar"));

        lblBienveniddo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblBienveniddo.setText("Bienvenido");

        lblBoricuasSystem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBoricuasSystem.setText("Boricuas system");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(lblPinBar);
        lblPinBar.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lblBienveniddo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblBoricuasSystem)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblBienveniddo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBoricuasSystem)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        getContentPane().add(lblPinBar);

        Productos.setText("Productos");

        AgergarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/Product-documentation-icon.png"))); // NOI18N
        AgergarProductos.setText("Agregar producto");
        AgergarProductos.setEnabled(false);
        AgergarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AprodActionPerformed(evt);
            }
        });
        Productos.add(AgergarProductos);

        BuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/search-icon.png"))); // NOI18N
        BuscarProducto.setText("Buscar Producto");
        BuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BprodActionPerformed(evt);
            }
        });
        Productos.add(BuscarProducto);

        jMenuBar4.add(Productos);

        Vender.setText("Vender");

        Generarfactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/sale-icon.png"))); // NOI18N
        Generarfactura.setText("Generar factura");
        Generarfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GfacturaActionPerformed(evt);
            }
        });
        Vender.add(Generarfactura);

        jMenuBar4.add(Vender);

        setJMenuBar(jMenuBar4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AprodActionPerformed
        
    }//GEN-LAST:event_AprodActionPerformed

    private void BprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BprodActionPerformed
        I_buscar IBuscar=new I_buscar();
        IBuscar.setVisible(rootPaneCheckingEnabled);
        
    }//GEN-LAST:event_BprodActionPerformed

    private void GfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GfacturaActionPerformed
        I_factur IFactura=new I_factur();
        IFactura.setVisible(rootPaneCheckingEnabled);
        
    }//GEN-LAST:event_GfacturaActionPerformed

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
            java.util.logging.Logger.getLogger(I_prin_bar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_prin_bar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_prin_bar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_prin_bar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_prin_bar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgergarProductos;
    private javax.swing.JMenuItem BuscarProducto;
    private javax.swing.JMenuItem Generarfactura;
    private javax.swing.JMenu Productos;
    private javax.swing.JMenu Vender;
    private javax.swing.JLabel lblBienveniddo;
    private javax.swing.JLabel lblBoricuasSystem;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JPanel lblPinBar;
    // End of variables declaration//GEN-END:variables
}
