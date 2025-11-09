/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paneles;

import com.formdev.flatlaf.FlatDarculaLaf;
import control.Controller;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.sound.midi.ControllerEventListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.View;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;



/**255,0,0
 *
 * @author User
 */
public class Interfaz extends javax.swing.JFrame{
  int xMouse;
    int yMouse;
    private javax.swing.JTable Table_detalles;
    /**
     *
     */
    private int rolUsuario; 
    public Controller controller;
    private String idcliente;
    

    public Interfaz() {
        this(2);
    }

    public Interfaz(int rol_usuario) {
        this.rolUsuario = rol_usuario; 
        
        initComponents(); 

        if (this.Table_detalles == null) {
            this.Table_detalles = new javax.swing.JTable();
        }
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf()); 
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        DefaultTableModel modeloDetalles = new DefaultTableModel();
        modeloDetalles.addColumn("Campo");
        modeloDetalles.addColumn("Valor");
        
        this.Table_detalles.setModel(modeloDetalles);
        
        controller = new Controller(this);
        Table_detalles.setModel(new javax.swing.table.DefaultTableModel());
        
        aplicarRestriccionesDeRol();
    }
    
    private void aplicarRestriccionesDeRol() {
        
        if (this.rolUsuario == 2) {
            
            User.setVisible(false);
            jButton_Cusu.setEnabled(false); 
            r_mer.setVisible(false);
            jButton_Rmerc.setEnabled(false);
        }
   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        t_sam = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        r_sam = new javax.swing.JPanel();
        jButton_Rmerc = new javax.swing.JButton();
        r_mer = new javax.swing.JPanel();
        jButton_Tlis = new javax.swing.JButton();
        t_sam1 = new javax.swing.JPanel();
        g_sam = new javax.swing.JPanel();
        jButton_Cusu = new javax.swing.JButton();
        r_fin = new javax.swing.JPanel();
        jButton_clin = new javax.swing.JButton();
        User = new javax.swing.JPanel();
        User1 = new javax.swing.JPanel();
        jPanel2 = new fondo2();
        inicial = new fondo();
        titulo = new javax.swing.JPanel();
        red_squr = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel3.setMinimumSize(new java.awt.Dimension(960, 620));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_sam.setBackground(new java.awt.Color(0, 204, 204));
        t_sam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_samMousePressed(evt);
            }
        });
        t_sam.setLayout(new java.awt.CardLayout());
        jPanel1.add(t_sam, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 210, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, 20));

        r_sam.setBackground(new java.awt.Color(0, 204, 204));
        r_sam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                r_samMousePressed(evt);
            }
        });
        r_sam.setLayout(new java.awt.CardLayout());

        jButton_Rmerc.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jButton_Rmerc.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Rmerc.setText("Respaldar y Restaurar");
        jButton_Rmerc.setContentAreaFilled(false);
        jButton_Rmerc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_Rmerc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_RmercMousePressed(evt);
            }
        });
        r_sam.add(jButton_Rmerc, "card2");

        jPanel1.add(r_sam, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 210, 50));

        r_mer.setBackground(new java.awt.Color(0, 204, 204));
        r_mer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                r_merMousePressed(evt);
            }
        });
        r_mer.setLayout(new java.awt.CardLayout());

        jButton_Tlis.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jButton_Tlis.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Tlis.setText("Cerrar Sesion");
        jButton_Tlis.setContentAreaFilled(false);
        jButton_Tlis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_Tlis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_TlisMousePressed(evt);
            }
        });
        jButton_Tlis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TlisActionPerformed(evt);
            }
        });
        r_mer.add(jButton_Tlis, "card2");

        jPanel1.add(r_mer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 210, 50));

        t_sam1.setBackground(new java.awt.Color(0, 204, 204));
        t_sam1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_sam1MousePressed(evt);
            }
        });
        t_sam1.setLayout(new java.awt.CardLayout());
        jPanel1.add(t_sam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 210, 50));

        g_sam.setBackground(new java.awt.Color(0, 204, 204));
        g_sam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                g_samMousePressed(evt);
            }
        });
        g_sam.setLayout(new java.awt.CardLayout());

        jButton_Cusu.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jButton_Cusu.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Cusu.setText("Usuario");
        jButton_Cusu.setContentAreaFilled(false);
        jButton_Cusu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_Cusu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_CusuMousePressed(evt);
            }
        });
        jButton_Cusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CusuActionPerformed(evt);
            }
        });
        g_sam.add(jButton_Cusu, "card2");

        jPanel1.add(g_sam, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 210, 50));

        r_fin.setBackground(new java.awt.Color(0, 204, 204));
        r_fin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                r_finMousePressed(evt);
            }
        });
        r_fin.setLayout(new java.awt.CardLayout());

        jButton_clin.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jButton_clin.setForeground(new java.awt.Color(255, 255, 255));
        jButton_clin.setText("Operaciones");
        jButton_clin.setContentAreaFilled(false);
        jButton_clin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_clin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton_clinMouseReleased(evt);
            }
        });
        jButton_clin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clinActionPerformed(evt);
            }
        });
        r_fin.add(jButton_clin, "card2");

        jPanel1.add(r_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 50));

        User.setBackground(new java.awt.Color(0, 204, 204));
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserMousePressed(evt);
            }
        });
        User.setLayout(new java.awt.CardLayout());
        jPanel1.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 210, 50));

        User1.setBackground(new java.awt.Color(0, 204, 204));
        User1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                User1MousePressed(evt);
            }
        });
        User1.setLayout(new java.awt.CardLayout());
        jPanel1.add(User1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 210, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 170));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 590));

        javax.swing.GroupLayout inicialLayout = new javax.swing.GroupLayout(inicial);
        inicial.setLayout(inicialLayout);
        inicialLayout.setHorizontalGroup(
            inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        inicialLayout.setVerticalGroup(
            inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel3.add(inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 750, 560));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tituloMouseDragged(evt);
            }
        });
        titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tituloMousePressed(evt);
            }
        });

        red_squr.setBackground(new java.awt.Color(255, 255, 255));

        exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 102, 102));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout red_squrLayout = new javax.swing.GroupLayout(red_squr);
        red_squr.setLayout(red_squrLayout);
        red_squrLayout.setHorizontalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        red_squrLayout.setVerticalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, red_squrLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout tituloLayout = new javax.swing.GroupLayout(titulo);
        titulo.setLayout(tituloLayout);
        tituloLayout.setHorizontalGroup(
            tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloLayout.createSequentialGroup()
                .addGap(0, 914, Short.MAX_VALUE)
                .addComponent(red_squr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        tituloLayout.setVerticalGroup(
            tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(red_squr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r_merMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r_merMousePressed
        
        Respal p1 = new Respal();
        p1.setSize(750, 560);
        p1.setLocation(0,0);
        
        inicial.removeAll();
        inicial.add(p1, BorderLayout.CENTER);
        inicial.revalidate();
        inicial.repaint();
    }//GEN-LAST:event_r_merMousePressed

    private void UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMousePressed
      
       
        Usuario p1 = new Usuario();
        p1.setSize(750, 560);
        p1.setLocation(0,0);
        
        inicial.removeAll();
        inicial.add(p1, BorderLayout.CENTER);
        inicial.revalidate();
        inicial.repaint();
    }//GEN-LAST:event_UserMousePressed

    private void g_samMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g_samMousePressed
      
    }//GEN-LAST:event_g_samMousePressed

    private void r_finMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r_finMousePressed
      
        
        
    }//GEN-LAST:event_r_finMousePressed

    private void r_samMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r_samMousePressed
       
        
      
    }//GEN-LAST:event_r_samMousePressed

    private void t_samMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_samMousePressed
       
        
        registro p1 = new registro(this, true); 
        p1.setVisible(true);
        p1.setSize(750, 560);
        p1.setLocation(0,0);
        
        inicial.removeAll();
        inicial.add(p1, BorderLayout.CENTER);
        inicial.revalidate();
        inicial.repaint();  
        
        
    }//GEN-LAST:event_t_samMousePressed

    private void jButton_RmercMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RmercMousePressed
       
       
        Respal p1 = new Respal();
        p1.setSize(750, 560);
        p1.setLocation(0,0);
        
        inicial.removeAll();
        inicial.add(p1, BorderLayout.CENTER);
        inicial.revalidate();
        inicial.repaint();
    }//GEN-LAST:event_jButton_RmercMousePressed

    private void jButton_TlisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_TlisMousePressed
        
      
        RVsistemas p1 = new RVsistemas();
        
        this.dispose();
        p1.setVisible(true);
       
       
        
        
    }//GEN-LAST:event_jButton_TlisMousePressed

    private void jButton_CusuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CusuMousePressed
     
       
        Usuario p1 = new Usuario();
        p1.setSize(750, 560);
        p1.setLocation(0,0);
        
        inicial.removeAll();
        inicial.add(p1, BorderLayout.CENTER);
        inicial.revalidate();
        inicial.repaint();
    }//GEN-LAST:event_jButton_CusuMousePressed

    private void jButton_clinMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_clinMouseReleased
        Operation p1 = new Operation();
        p1.setSize(750, 560);
        p1.setLocation(0,0);
        
        inicial.removeAll();
        inicial.add(p1, BorderLayout.CENTER);
        inicial.revalidate();
        inicial.repaint();
    }//GEN-LAST:event_jButton_clinMouseReleased

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_exitMouseExited

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void tituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_tituloMousePressed

    private void tituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_tituloMouseDragged

    private void jButton_TlisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TlisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_TlisActionPerformed

    private void jButton_CusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CusuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CusuActionPerformed

    private void jButton_clinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_clinActionPerformed

    private void t_sam1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_sam1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_sam1MousePressed

    private void User1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_User1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_User1MousePressed

    private void setColor(JPanel panel){
        panel.setBackground(new Color(221,13,14));
    }
    private void resetColor(JPanel panel){
        panel.setBackground(new Color(204,4,4));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         
        try {
        UIManager.setLookAndFeel(new FlatDarculaLaf()); // primero el Look&Feel
    } catch (Exception ex) {
        ex.printStackTrace();
    }
        
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    protected void cambio_ventana(JPanel ventana_activa){
        jPanel1.setVisible(false);
        inicial.setVisible(false);
        
        
        ventana_activa.setVisible(true);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel User;
    public javax.swing.JPanel User1;
    private javax.swing.JLabel exit;
    public javax.swing.JPanel g_sam;
    private javax.swing.JPanel inicial;
    public javax.swing.JButton jButton_Cusu;
    public javax.swing.JButton jButton_Rmerc;
    public javax.swing.JButton jButton_Tlis;
    public javax.swing.JButton jButton_clin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JPanel r_fin;
    public javax.swing.JPanel r_mer;
    public javax.swing.JPanel r_sam;
    private javax.swing.JPanel red_squr;
    public javax.swing.JPanel t_sam;
    public javax.swing.JPanel t_sam1;
    private javax.swing.JPanel titulo;
    // End of variables declaration//GEN-END:variables

class fondo extends JPanel {

     Image imag;
    
    @Override
    public void paint(Graphics g){
    
        
        imag = new ImageIcon(getClass().getResource("/imagen/fondo1.png")).getImage();
        
        g.drawImage(imag,0,0,getWidth(),getHeight(),this );
        
        setOpaque(false);
        
        super.paint(g);
    }
    
}
class fondo2 extends JPanel {

     Image imag;
    
    @Override
    public void paint(Graphics g){
    
        
        imag = new ImageIcon(getClass().getResource("/imagen/logo_1.png")).getImage();
        
        g.drawImage(imag,0,0,getWidth(),getHeight(),this );
        
        setOpaque(false);
        
        super.paint(g);
    }
    
}

}
