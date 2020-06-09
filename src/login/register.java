/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.*;
import java.sql.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Jose De Avila
 */
public class register extends javax.swing.JFrame {
    private static Connection con;
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String user="root";
    private static final String pass="26930470";
    private static final String url="jdbc:mysql://localhost:3306/notiaunar?serverTimezone=UTC";
    public register() {
        initComponents();
        ImageIcon image1 = new ImageIcon(getClass().getResource("/imagenes/left_notiaunar.png"));
        Icon fondo1= new ImageIcon(image1.getImage().getScaledInstance(left_notiaunar.getWidth(), left_notiaunar.getHeight(), Image.SCALE_DEFAULT));
        left_notiaunar.setIcon(fondo1);
        this.getContentPane().setBackground(Color.white);
        this.setExtendedState(this.getWidth());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        Conexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        left_notiaunar = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        title_name = new javax.swing.JLabel();
        nombreCompleto = new javax.swing.JTextField();
        title_programa = new javax.swing.JLabel();
        programa = new javax.swing.JComboBox<>();
        title_name1 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        title_contraseña = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        btnSingup = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        title.setText("      REGISTRO DE USUARIO");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        title_name.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        title_name.setText("Nombres y apellidos:");

        nombreCompleto.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        nombreCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCompletoActionPerformed(evt);
            }
        });

        title_programa.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        title_programa.setText("Programa:");

        programa.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        programa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería Informática", "Contaduría Pública", "Cocina Nacional e Internacional", "Decoración de Interiores" }));

        title_name1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        title_name1.setText("Correo electrónico:");

        email.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        title_contraseña.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        title_contraseña.setText("Contraseña:");

        password.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N

        btnSingup.setBackground(new java.awt.Color(0, 0, 204));
        btnSingup.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnSingup.setForeground(new java.awt.Color(255, 255, 255));
        btnSingup.setText("Registrarse");
        btnSingup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSingup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSingupActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 204));
        btnBack.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Volver");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setMaximumSize(new java.awt.Dimension(159, 39));
        btnBack.setMinimumSize(new java.awt.Dimension(159, 39));
        btnBack.setPreferredSize(new java.awt.Dimension(159, 39));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(left_notiaunar, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(title_name)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(title_programa)
                                .addGap(120, 120, 120))
                            .addComponent(programa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreCompleto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(title_name1)
                                .addGap(66, 66, 66))
                            .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(title_contraseña)
                                .addGap(107, 107, 107))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSingup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(149, 149, 149))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left_notiaunar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(title)
                .addGap(18, 18, 18)
                .addComponent(title_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(title_programa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(programa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(title_name1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(title_contraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSingup)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCompletoActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void btnSingupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSingupActionPerformed
        String completeName = "'"+nombreCompleto.getText()+"'";
        String program = "'"+programa.getSelectedItem().toString()+"'";
        String correo = "'"+email.getText()+"'";
        char[] arrayC = password.getPassword();
        try{
            String query = "SELECT email FROM usuarios where email="+correo;
            Statement stmt1 = con.createStatement();
            ResultSet rs = stmt1.executeQuery(query);
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "El usuario ya se encuentra registrado. Si es así, inicie sesión.");
            }else{
                String passs = new String(arrayC);
                Statement stmt = con.createStatement();
                int numero_datos = stmt.executeUpdate("INSERT INTO usuarios (nombreCompleto, tipo, programa, email,contrasena)"+" values(" +completeName+ ", 0, " +program+ "," +correo+ ",'" +passs+ "')");
                if (numero_datos>0){
                    JOptionPane.showMessageDialog(null, "Usuario registrado correctamente. Espere mientras lo redireccionamos al inicio de sesión.");
                    Thread.sleep(1000);
                    login1 lg1 = new login1();
                    lg1.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido registrar correctamente.");
                    stmt.close();
                }
            }
        }
        catch(Exception e){
            System.out.println("Erro."+ e );
        }
    }//GEN-LAST:event_btnSingupActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        login1 lg1 = new login1();
        lg1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        register rgst = new register();
        rgst.Conexion();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
                
            }
        });
    }
    
    public Connection Conexion(){
        con = null;
        try{
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("No se pudo conectar!"+e);
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSingup;
    private javax.swing.JTextField email;
    private javax.swing.JLabel left_notiaunar;
    private javax.swing.JTextField nombreCompleto;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> programa;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title_contraseña;
    private javax.swing.JLabel title_name;
    private javax.swing.JLabel title_name1;
    private javax.swing.JLabel title_programa;
    // End of variables declaration//GEN-END:variables
}
