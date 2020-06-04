/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import inside.Inicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mysql.jdbc.Driver;
import javafx.scene.control.Alert;
import static javax.swing.JOptionPane.*;
/**
 *
 * @author Jose De Avila
 */
public class login1 extends javax.swing.JFrame {
    
    public static Connection con;
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String user="root";
    private static final String pass="26930470";
    private static final String url="jdbc:mysql://localhost:3306/notiaunar?serverTimezone=UTC";
    /**
     * Creates new form login1
     */
    public login1() {
        initComponents();
        ImageIcon image1 = new ImageIcon(getClass().getResource("/imagenes/left_notiaunar.png"));
        Icon fondo1= new ImageIcon(image1.getImage().getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_DEFAULT));
        image.setIcon(fondo1);
        this.repaint();
        this.getContentPane().setBackground(Color.white);
        this.setExtendedState(this.getWidth());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image = new javax.swing.JLabel();
        rightside = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        usuario_title = new javax.swing.JLabel();
        email_text = new javax.swing.JTextField();
        password_title = new javax.swing.JLabel();
        forgotPassword = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        btnSignIn = new javax.swing.JButton();
        password_text = new javax.swing.JPasswordField();
        imagen_logotipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        image.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rightside.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("INICIAR SESION");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        usuario_title.setBackground(new java.awt.Color(0, 0, 0));
        usuario_title.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        usuario_title.setForeground(new java.awt.Color(0, 0, 0));
        usuario_title.setText("CORREO:");

        email_text.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        email_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textActionPerformed(evt);
            }
        });

        password_title.setBackground(new java.awt.Color(0, 0, 0));
        password_title.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        password_title.setForeground(new java.awt.Color(0, 0, 0));
        password_title.setText("CONTRASEÑA");

        forgotPassword.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(102, 102, 255));
        forgotPassword.setText("¿Olvidaste tu contraseña?");
        forgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnSignUp.setBackground(new java.awt.Color(0, 0, 204));
        btnSignUp.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("REGISTRARSE");
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUpMouseClicked(evt);
            }
        });
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        btnSignIn.setBackground(new java.awt.Color(0, 0, 204));
        btnSignIn.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("INICIAR SESION");
        btnSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        password_text.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        password_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_text.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        password_text.setNextFocusableComponent(password_title);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(imagen_logotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSignIn)
                    .addComponent(password_title)
                    .addComponent(usuario_title)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(forgotPassword)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSignUp)
                                .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(rightside, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagen_logotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rightside, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usuario_title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email_text, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(password_title)
                        .addGap(5, 5, 5)
                        .addComponent(password_text, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(forgotPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSignUp)
                            .addComponent(btnSignIn))
                        .addGap(51, 51, 51))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_textActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        register vu= new register();
        vu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        String correo = email_text.getText();
        char[] contrasenia = password_text.getPassword();
        String passs = new String(contrasenia);
        String query = "SELECT * from usuarios where email='"+correo+"'";
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            String pass1 = rs.getString("contrasena");
            if(passs.equals(pass1)){
                JOptionPane.showMessageDialog(null, "Acceso concedido. Espere un momento mientras lo redireccionamos.", "Access Confirm", INFORMATION_MESSAGE);
                int tipo = rs.getInt("tipo");
                Inicio.tipo = tipo;
                Inicio init = new Inicio();
                init.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Hay un error al iniciar sesión, la contraseña es incorrecta.");
            }
        }
        catch(Exception e){
            System.out.println("Ocurrió un error. "+ e);
        }
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseClicked
        register register = new register();
        register.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignUpMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        login1 pro = new login1();
        pro.Conexion();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login1().setVisible(true);
            }
        });
    }
    
    public Connection Conexion(){
        con = null;
        try{
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, pass);
            if(con!=null){
                System.out.println("Conexión establecida!");
            }
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println("No se pudo conectar!"+e);
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JTextField email_text;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JLabel image;
    private javax.swing.JLabel imagen_logotipo;
    private javax.swing.JPasswordField password_text;
    private javax.swing.JLabel password_title;
    private javax.swing.JLabel rightside;
    private javax.swing.JLabel title;
    private javax.swing.JLabel usuario_title;
    // End of variables declaration//GEN-END:variables
}