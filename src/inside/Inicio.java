/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inside;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import login.login1;

/**
 *
 * @author ASUS_X441M
 */
public class Inicio extends javax.swing.JFrame {

    public static int tipo;
    public static String nombre;
    public JLabel titulos[], descripciones[], fechas[], autores[], facultades[];
    public JButton btnLeerMas[];
    
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
        // panelPrincip.setBackground(Color.white);
        actualizarNoticias("general");
        if(tipo==1){
            btnPanel.setVisible(true);
            btnPanel.setEnabled(true);
        }else{
            btnPanel.setVisible(false);
            btnPanel.setEnabled(false);
        }   
        jPanel2.setBackground(Color.white);
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
        btnInicio = new javax.swing.JLabel();
        btnInformatica = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnContaduria = new javax.swing.JLabel();
        btnDecoracion = new javax.swing.JLabel();
        btnCocina = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        btnPanel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setAutoscrolls(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.PNG"))); // NOI18N

        btnInicio.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("Inicio");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        btnInformatica.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnInformatica.setForeground(new java.awt.Color(255, 255, 255));
        btnInformatica.setText("Informática");
        btnInformatica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnContaduria.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnContaduria.setForeground(new java.awt.Color(255, 255, 255));
        btnContaduria.setText("Contaduria");
        btnContaduria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnDecoracion.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnDecoracion.setForeground(new java.awt.Color(255, 255, 255));
        btnDecoracion.setText("Decoración");
        btnDecoracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnCocina.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnCocina.setForeground(new java.awt.Color(255, 255, 255));
        btnCocina.setText("Cocina ");
        btnCocina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnExit.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        btnPanel.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        btnPanel.setForeground(new java.awt.Color(255, 255, 255));
        btnPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar-sesion.png"))); // NOI18N
        btnPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInicio)
                        .addGap(32, 32, 32)
                        .addComponent(btnInformatica)))
                .addGap(32, 32, 32)
                .addComponent(btnContaduria)
                .addGap(32, 32, 32)
                .addComponent(btnDecoracion)
                .addGap(32, 32, 32)
                .addComponent(btnCocina)
                .addGap(31, 31, 31)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnInicio)
                        .addComponent(btnInformatica, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(btnContaduria)
                        .addComponent(btnDecoracion)
                        .addComponent(btnCocina)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setAutoscrolls(true);
        jPanel2.setPreferredSize(new java.awt.Dimension(688, 1000));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("NOTICIAS ACTUALES");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setText("OTROS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(112, 112, 112))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addContainerGap(962, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1023, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        actualizarNoticias("general");
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPanelMouseClicked
        String [] botones = {"Crear noticia", "Añadir administrador"};
        
        int opcion = JOptionPane.showOptionDialog(this, "¿Qué quiere hacer?","Administrador",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[0]);
            switch (opcion) {
                case 0: {
                    Admin.nombre = nombre;
                    Admin ventana = new Admin();
                    ventana.setVisible(true);
                    this.dispose();
                    break;
                }
                    
                case 1: {
                    AdministrarAdmin ventana = new AdministrarAdmin();
                    ventana.setVisible(true);
                    this.dispose();
                    break;
                }       
            }
            
    }//GEN-LAST:event_btnPanelMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        login1 lg1 = new login1();
        lg1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitMouseClicked
    
    public int contarDatos(){
        int aux=0;
        login1 lg1 = new login1();
        lg1.Conexion();
        try{
            Statement stmt = login1.con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id FROM noticias");
            while(rs.next()){
                aux+=1;
            }
        }catch(Exception ex){
            System.out.println("Error->"+ex);
        }
        return aux;
    }
    
    public ResultSet visualizar(){
        login1 lg1 = new login1();
        Connection Conexion;
        Conexion = lg1.Conexion();
        ResultSet rs = null;    
        try{
            PreparedStatement ps = login1.con.prepareStatement("SELECT * FROM noticias");
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Error de consulta -> "+ ex.getMessage());
        }
        return rs;
    }
    
    public void actualizarNoticias(String facultad){
        int numDatos = contarDatos();
        String titulos3[], descripciones3[], fechas3[], autores3[], facultades3[];
        login1 lg1 = new login1();
        lg1.Conexion();
        if(facultad=="general"){
            String query = "SELECT * FROM noticias";
            try {
                Statement stmt = login1.con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                titulos3 = new String[numDatos];
                descripciones3 = new String[numDatos];
                fechas3 = new String[numDatos];
                autores3 = new String[numDatos];
                facultades3 = new String[numDatos];
                rs.next();
                for(int i=0; i<numDatos; i++){
                    titulos3[i]=rs.getString("titulo");
                    descripciones3[i]=rs.getString("descripc_breve");
                    fechas3[i]=rs.getString("fecha");
                    autores3[i]=rs.getString("autor");
                    facultades3[i]=rs.getString("facultad");
                    rs.next();
                    System.out.println("1");
                }
                titulos = new JLabel[numDatos];
                descripciones = new JLabel[numDatos];
                fechas = new JLabel[numDatos];
                autores = new JLabel[numDatos];
                facultades = new JLabel[numDatos];
                btnLeerMas = new JButton[numDatos];
                for(int i=0; i<numDatos; i++){
                    System.out.println("2");
                    titulos[i] = new JLabel();
                    titulos[i].setText(titulos3[i]);
                    titulos[i].setFont(new java.awt.Font("Trebuchet MS", 1, 18));
                    titulos[i].setBounds(150, 40+i*140, 530, 30);
                    jPanel2.add(titulos[i]);
                    descripciones[i] = new JLabel();
                    descripciones[i].setText("<html>"+descripciones3[i]+"</html>");
                    descripciones[i].setBounds(150, 90+i*140, 530, 80);
                    descripciones[i].setVerticalAlignment(javax.swing.SwingConstants.TOP);
                    jPanel2.add(descripciones[i]);
                    fechas[i] = new JLabel();
                    fechas[i].setText(fechas3[i]+" - ");
                    fechas[i].setFont(new java.awt.Font("Trebuchet MS", 1, 14));
                    fechas[i].setBounds(150, 65+i*140, 100, 20);
                    jPanel2.add(fechas[i]);
                    autores[i] = new JLabel();
                    autores[i].setText(autores3[i]);
                    autores[i].setFont(new java.awt.Font("Trebuchet MS", 1, 14));
                    autores[i].setBounds(223, 65+i*140, 250, 20);
                    jPanel2.add(autores[i]);
                    facultades[i] = new JLabel();
                    facultades[i].setText(facultades3[i]);
                    facultades[i].setFont(new java.awt.Font("Trebuchet MS", 2, 14));
                    facultades[i].setForeground(new java.awt.Color(0,0,102));
                    facultades[i].setBounds(150, 160+i*140, 250, 20);
                    jPanel2.add(facultades[i]);
                    btnLeerMas[i] = new JButton();
                    btnLeerMas[i].setText("LEER MAS");
                    btnLeerMas[i].setBackground(new java.awt.Color(0,0,102));
                    btnLeerMas[i].setForeground(Color.white);
                    btnLeerMas[i].setBounds(550, 160+i*140, 100, 30);
                    jPanel2.add(btnLeerMas[i]);
                }
            } catch (SQLException ex) {
                System.out.println("Error. ->" + ex);
            }
            
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCocina;
    private javax.swing.JLabel btnContaduria;
    private javax.swing.JLabel btnDecoracion;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnInformatica;
    private javax.swing.JLabel btnInicio;
    private javax.swing.JLabel btnPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
