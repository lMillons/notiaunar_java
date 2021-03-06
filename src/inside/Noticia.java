/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inside;

import static inside.Inicio.ids3;
import static inside.Inicio.nombre;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import login.login1;

/**
 *
 * @author ASUS
 */
public class Noticia extends javax.swing.JFrame {

    public static int id, tipo;
    public JButton btnLeerMas[];
    public int ids[];

    /**
     * Creates new form Noticia
     */
    public Noticia() {
        initComponents();
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
        mostrarNoticia(id);
        mostrarRelacionados();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        if (tipo == 1) {
            btnPanel.setVisible(true);
            btnPanel.setEnabled(true);
        } else {
            btnPanel.setVisible(false);
            btnPanel.setEnabled(false);
        }
        jPanel2.setBackground(Color.white);
    }

    public int contarDatos() {
        int aux = 0;
        login1 lg1 = new login1();
        lg1.Conexion();
        try {
            Statement stmt = login1.con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id FROM noticias");
            while (rs.next()) {
                aux += 1;
            }
            stmt.close();
        } catch (Exception ex) {
            System.out.println("Error->" + ex);
        }
        return aux;
    }

    public ResultSet visualizar() {
        login1 lg1 = new login1();
        Connection Conexion;
        Conexion = lg1.Conexion();
        ResultSet rs = null;
        try {
            PreparedStatement ps = login1.con.prepareStatement("SELECT * FROM noticias");
            rs = ps.executeQuery();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error de consulta -> " + ex.getMessage());
        }
        return rs;
    }

    private void mostrarNoticia(int id) {
        login1 lg1 = new login1();
        lg1.Conexion();
        String query = "SELECT * FROM noticias WHERE id='" + id + "'";
        try {
            Statement stmt = login1.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            JLabel lblTitulo = new JLabel();
            lblTitulo.setText("<html>" + rs.getString("titulo") + "</html>");
            lblTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 32));
            lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lblTitulo.setBounds(40, 20, 650, rs.getString("titulo").length()*2);
            jPanel2.add(lblTitulo);
            JLabel lblImagen;
            Blob blob = rs.getBlob("img");
            byte[] data = blob.getBytes(1, (int) blob.length());
            BufferedImage img = null;
            try {
                img = ImageIO.read(new ByteArrayInputStream(data));
            } catch (IOException ex) {
                System.out.println("Error. " + ex.getMessage());
            }
            ImageIcon icono = new ImageIcon(img.getScaledInstance(650, 650, img.SCALE_DEFAULT));
            lblImagen = new JLabel(icono);
            lblImagen.setBounds(40, (int) (rs.getString("titulo").length()*2.5), 650, 650);
            jPanel2.add(lblImagen);
            JLabel contenido = new JLabel();
            contenido.setText(rs.getString("text_complet"));
            contenido.setBounds(40, 800, 650, rs.getString("text_complet").length());
            contenido.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            jPanel2.add(contenido);
            int height=(650+rs.getString("titulo").length()*2+(rs.getString("text_complet").length()/2));
            jPanel2.setPreferredSize(new Dimension(688, height));
        } catch (SQLException ex) {
            System.out.println("Error -> "+ex);
        }
    }
    
    private void mostrarRelacionados(){
        // x=717,y=22
        int numDatos = Inicio.contarDatos();
        login1 lg1 = new login1();
        String descrip[] = new String[3];
        ids = new int[3];
        Object imagenes[] = new Object[3];
        btnLeerMas = new JButton[3];
        int aux = 0;
        lg1.Conexion();
        String query2 = "SELECT * FROM noticias where id!="+id+" limit 3";
        try{
            Statement stmt = login1.con.createStatement();
            ResultSet rs = stmt.executeQuery(query2);
            rs.next();
            for(int i=0; i<3; i++){
                descrip[i] = rs.getString("descripc_breve");
                Blob blob = rs.getBlob("img");
                byte[] data = blob.getBytes(1, (int) blob.length());
                BufferedImage img = null;
                try{
                    img = ImageIO.read(new ByteArrayInputStream(data));
                }catch(Exception ex){
                    System.out.println("Error ->"+ex);
                }
                ImageIcon icono = new ImageIcon(img.getScaledInstance(100, 100, img.SCALE_DEFAULT));
                imagenes[i]=new JLabel(icono);
                ids[i] = rs.getInt("id");
                rs.next();
            }
            
            JLabel descrip3[] = new JLabel[3];
            JLabel imagenes3[] = new JLabel[3];
            
            for(int i=0; i<3; i++){
                descrip3[i] = new JLabel();
                descrip3[i].setText("<html>"+descrip[i]+"</html>");
                descrip3[i].setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                descrip3[i].setBounds(1010, 65+i*120, 200, 110);
                jPanel2.add(descrip3[i]);
                imagenes3[i] = (JLabel) imagenes[i];
                imagenes3[i].setBounds(900, 72+i*120, 100, 100);
                jPanel2.add(imagenes3[i]);
                btnLeerMas[i] = new JButton();
                btnLeerMas[i].setText("Leer más");
                btnLeerMas[i].setForeground(Color.white);
                btnLeerMas[i].setBackground(new java.awt.Color(0,0,102));
                btnLeerMas[i].setFont(new java.awt.Font("Trebuchet MS", 2, 14));
                btnLeerMas[i].setBounds(1200, 135+i*120, 110, 40);
                jPanel2.add(btnLeerMas[i]);
                btnLeerMas[i].addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent evt){
                        btnLeerMasActionPerformed(evt);
                    }
                });
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    public void btnLeerMasActionPerformed(ActionEvent evt){
        JButton btnPulsed = (JButton) evt.getSource();
        int aux=0;
        Point location = btnPulsed.getLocation();
        for(int i=0; i<3; i++){
            if(location.equals(btnLeerMas[i].getLocation())){
                Noticia.id = ids[i];
                Noticia nt = new Noticia();
                nt.setVisible(true);
                this.dispose();
                break;
            }
        }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addContainerGap(81, Short.MAX_VALUE))
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
        jPanel2.setPreferredSize(new java.awt.Dimension(688, 400));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setText(" ENTRADAS REL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(723, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(108, 108, 108))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addContainerGap(346, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        Inicio ventana = new Inicio();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        login1 lg1 = new login1();
        lg1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPanelMouseClicked
        String[] botones = {"Crear noticia", "Añadir administrador"};

        int opcion = JOptionPane.showOptionDialog(this, "¿Qué quiere hacer?", "Administrador", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
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

    public int contarSaltos(String cadena) {
        int posicion, contador = 0;
        posicion = cadena.indexOf("<br />");
        while (posicion != -1) {
            contador++;
            posicion = cadena.indexOf("<br />", posicion + 1);
        }
        return contador;
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
            java.util.logging.Logger.getLogger(Noticia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Noticia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Noticia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Noticia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Noticia().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
