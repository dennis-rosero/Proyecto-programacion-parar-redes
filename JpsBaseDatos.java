import guiTablas.JPTableDataTwitter;
import guiTablas.JPTableDateFacebook;
import guiTablas.JPTableDateInstagram;
import guiTablas.JPTableOpcFacebook;
import guiTablas.JPTableOpcInstagram;
import guiTablas.JPTableOpcTwitter;
import java.awt.CardLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class JPBaseDeDatos extends javax.swing.JPanel {
    
    /**
     * Creates new form JPBaseDeDatos
     */
    public JPBaseDeDatos(javax.swing.JPanel contenedor) {
        initComponents();
        this.contenedor=contenedor;
        tablaOpcTwitter = new JPTableOpcTwitter();
        tableDataTwtter = new JPTableDataTwitter();
        tablaOpcFacebook = new JPTableOpcFacebook();
        tableDataFacebook = new JPTableDateFacebook ();
        tableDataInstagram = new JPTableDateInstagram ();
        tablaOpcInstagram = new JPTableOpcInstagram ();
        
        
        //GRUPOS DE BOTONES
        btnGrupo = new javax.swing.ButtonGroup();
        btnGrupo.add(rbFacebook);
        btnGrupo.add(rbInstagram);
        btnGrupo.add(rbTwitter);
        //btnGrupo.setSelected(rbTwitter.getModel(), true);
        //Agregar laminal al contenedor jpOpcRedSocial cardLayout
        jpOpcRedSocial.setLayout(new java.awt.CardLayout(0,0));
        jpOpcRedSocial.add(tablaOpcTwitter,idJPTableOpcTwitter);
        jpOpcRedSocial.add(tablaOpcFacebook,idJPTableOpcFacebook);    
        jpOpcRedSocial.add(tablaOpcInstagram,idJPTableOpcInstagram);    
        
        //Agregar laminal al contenedor jpTableRedSocial cardLayout
        jpTableRedSocial.setLayout(new java.awt.CardLayout(0,0));
        jpTableRedSocial.add(tableDataTwtter,idJPTableDataTwitter);
        jpTableRedSocial.add(tableDataFacebook,idJPTableDataFacebook);
        jpTableRedSocial.add(tableDataInstagram,idJPTableDataInstagram);
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
        txtIdBusqueda = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        rbFacebook = new javax.swing.JRadioButton();
        rbInstagram = new javax.swing.JRadioButton();
        rbTwitter = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        jpOpcRedSocial = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        opcRedSocial = new javax.swing.JLabel();
        jpTableRedSocial = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        txtIdBusqueda.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtIdBusqueda.setForeground(new java.awt.Color(102, 102, 102));
        txtIdBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdBusqueda.setText("Ingrese el ID");
        txtIdBusqueda.setBorder(null);
        txtIdBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdBusquedaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdBusquedaFocusLost(evt);
            }
        });
        jPanel1.add(txtIdBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 200, 35));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 200, 10));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/search-40.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 40, 40));

        rbFacebook.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbFacebook.setForeground(new java.awt.Color(58, 180, 180));
        rbFacebook.setText("FACEBOOK");
        rbFacebook.setBorder(null);
        rbFacebook.setContentAreaFilled(false);
        rbFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonsActionPerformed(evt);
            }
        });
        jPanel1.add(rbFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 66, -1, -1));

        rbInstagram.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbInstagram.setForeground(new java.awt.Color(58, 180, 180));
        rbInstagram.setText("INSTAGRAM");
        rbInstagram.setBorder(null);
        rbInstagram.setContentAreaFilled(false);
        rbInstagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonsActionPerformed(evt);
            }
        });
        jPanel1.add(rbInstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 66, -1, -1));

        rbTwitter.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbTwitter.setForeground(new java.awt.Color(58, 180, 180));
        rbTwitter.setText("TWITTER");
        rbTwitter.setBorder(null);
        rbTwitter.setContentAreaFilled(false);
        rbTwitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonsActionPerformed(evt);
            }
        });
        jPanel1.add(rbTwitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 66, -1, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/back-40.png"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 100));

        jpOpcRedSocial.setBackground(new java.awt.Color(255, 255, 255));
        jpOpcRedSocial.setLayout(new java.awt.CardLayout());
        add(jpOpcRedSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 170, 230));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opcRedSocial.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        opcRedSocial.setForeground(new java.awt.Color(58, 180, 180));
        opcRedSocial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(opcRedSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 180, 30));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 570, 30));

        jpTableRedSocial.setBackground(new java.awt.Color(255, 255, 255));
        jpTableRedSocial.setLayout(new java.awt.CardLayout());
        add(jpTableRedSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 400, 230));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout carta = (CardLayout)contenedor.getLayout();
        carta.show(contenedor, idJPMenu);
    }//GEN-LAST:event_btnBackActionPerformed

    private void RadioButtonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonsActionPerformed
        // TODO add your handling code here:
        if(btnGrupo.isSelected(rbTwitter.getModel())){
            tablaOpcTwitter.getTable().startTable();
            
            CardLayout carta = (CardLayout)jpOpcRedSocial.getLayout();
            carta.show(jpOpcRedSocial, idJPTableOpcTwitter);
            carta = (CardLayout)jpTableRedSocial.getLayout();
            carta.show(jpTableRedSocial, idJPTableDataTwitter);
            
            opcRedSocial.setText("TWITTER");
        }
        if(btnGrupo.isSelected(rbInstagram.getModel())){
            //tablaOpcTwitter.startTable();
            tablaOpcInstagram.getTable().startTable();
            
            CardLayout carta = (CardLayout)jpOpcRedSocial.getLayout();
            carta.show(jpOpcRedSocial, idJPTableOpcInstagram);
            carta = (CardLayout)jpTableRedSocial.getLayout();
            carta.show(jpTableRedSocial, idJPTableDataInstagram);
            opcRedSocial.setText("INSTAGRAM");
        }
        if(btnGrupo.isSelected(rbFacebook.getModel())){
            tablaOpcFacebook.getTable().startTable();
            
            CardLayout carta = (CardLayout)jpOpcRedSocial.getLayout();
            carta.show(jpOpcRedSocial, idJPTableOpcFacebook);
            carta = (CardLayout)jpTableRedSocial.getLayout();
            carta.show(jpTableRedSocial, idJPTableDataFacebook);
            
            opcRedSocial.setText("FACEBOOK");
        }
    }//GEN-LAST:event_RadioButtonsActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String texto = txtIdBusqueda.getText();
        if(btnGrupo.isSelected(rbTwitter.getModel())){
            tableDataTwtter.setValorConsulta(texto);
            tableDataTwtter.startTable();
            txtIdBusqueda.setText("Ingrese el ID");
        }
        if(btnGrupo.isSelected(rbFacebook.getModel())){
            //tablaOpcTwitter.startTable();
            tableDataFacebook.setValorConsulta(texto);
            tableDataFacebook.startTable();
            txtIdBusqueda.setText("Ingrese el ID");
        }
        if(btnGrupo.isSelected(rbInstagram.getModel())){
            //tablaOpcTwitter.startTable();
            tableDataInstagram.setValorConsulta(texto);
            tableDataInstagram.startTable();
            txtIdBusqueda.setText("Ingrese el ID");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdBusquedaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdBusquedaFocusGained
        // TODO add your handling code here:
        txtIdBusqueda.setText("");
    }//GEN-LAST:event_txtIdBusquedaFocusGained

    private void txtIdBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdBusquedaFocusLost
        // TODO add your handling code here:
        if(txtIdBusqueda.getText().equals(""))txtIdBusqueda.setText("Ingrese el ID");
    }//GEN-LAST:event_txtIdBusquedaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpOpcRedSocial;
    private javax.swing.JPanel jpTableRedSocial;
    private javax.swing.JLabel opcRedSocial;
    private javax.swing.JRadioButton rbFacebook;
    private javax.swing.JRadioButton rbInstagram;
    private javax.swing.JRadioButton rbTwitter;
    private javax.swing.JTextField txtIdBusqueda;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JPanel contenedor;
    private final static String idJPMenu = "laminaMenu";
    private final static String idJPTableOpcTwitter = "laminaTableOpcTwitter";
    private final static String idJPTableDataTwitter = "laminaTableDataTwitter";
    private final static String idJPTableOpcFacebook = "laminaTableOpcFacebook";
    private final static String idJPTableDataFacebook = "laminaTableDataFacebook";
    private final static String idJPTableDataInstagram = "laminaTableDataInstagram";
    private final static String idJPTableOpcInstagram = "laminaTableOpcInstagram";
    
    private javax.swing.ButtonGroup btnGrupo;
    private JPTableOpcTwitter tablaOpcTwitter;
    private JPTableDataTwitter tableDataTwtter;
    private JPTableOpcFacebook tablaOpcFacebook;
    private JPTableDateFacebook tableDataFacebook;
    private JPTableDateInstagram tableDataInstagram;
    private JPTableOpcInstagram tablaOpcInstagram;
    
}
