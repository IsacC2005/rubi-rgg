/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class validar_campos {
     public static void soloLetras(JTextField campo, JLabel lblError) {
        campo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isISOControl(c)) {
                return;
            }
                
                if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                    e.consume(); // Bloquea la entrada
                    lblError.setText("Solo se permiten letras");
                    lblError.setForeground(Color.orange);
                } else {
                    lblError.setText("");
                }
            }
        });
    }

    // ===== Validar solo números =====
    public static void soloNumeros(JTextField campo, JLabel lblError) {
        campo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
               if (Character.isISOControl(c)) {
                return;
            }
                if (!Character.isDigit(c)) {
                    e.consume();
                    lblError.setText("Solo se permiten números");
                    lblError.setForeground(Color.orange);
                } else {
                    lblError.setText("");
                }
            }
        });
    }

    // ===== Validar contraseñas =====
    public static boolean validarPasswords(JPasswordField pass1, JPasswordField pass2,
                                           JLabel lblErrorPass, JLabel lblErrorConfirm) {
        String p1 = new String(pass1.getPassword());
        String p2 = new String(pass2.getPassword());
        boolean valido = true;

        if (p1.isEmpty()) {
            lblErrorPass.setText("La contraseña no puede estar vacía");
            lblErrorPass.setForeground(Color.orange);
            valido = false;
        } else if (p1.length() < 6) {
            lblErrorPass.setText("Debe tener al menos 6 caracteres");
            lblErrorPass.setForeground(Color.orange);
            valido = false;
        } else {
            lblErrorPass.setText("");
        }

        if (p2.isEmpty()) {
            lblErrorConfirm.setText("Debes confirmar la contraseña");
            lblErrorConfirm.setForeground(Color.orange);
            valido = false;
        } else if (!p1.equals(p2)) {
            lblErrorConfirm.setText("Las contraseñas no coinciden");
            lblErrorConfirm.setForeground(Color.orange);
            valido = false;
        } else {
            lblErrorConfirm.setText("");
        }

        return valido;
    }

    // ===== Validar campo vacío =====
    public static boolean validarCampoVacio(JTextField campo, JLabel label) {
        if (campo.getText().trim().isEmpty()) {
            label.setText("Campo obligatorio");
            label.setForeground(Color.orange);
            return false;
        } else {
            label.setText("");
            return true;
        }
    }

    public static boolean validarCombo(JComboBox combo, JLabel label) {
    if (combo.getSelectedIndex() == 0) { 
        // Asumiendo que el índice 0 es siempre "Seleccione"
        label.setText("X");
        label.setForeground(Color.ORANGE); // o el color que uses
        return false;
    } else {
        label.setText(""); // limpio el error
        return true;
    }
}

}
