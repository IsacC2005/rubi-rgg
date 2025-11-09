/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import paneles.reset_contraseña;
/**
 *
 * @author User
 */
public class Controller10 implements MouseListener{

    private final reset_contraseña view;
    
    public final void events (){
    view.jButton_cancel.addMouseListener(this);
    view.jButton_confir.addMouseListener(this);
    
    }
 
    public Controller10(reset_contraseña view) {
        this.view = view;
        events();
       
    }
   
    @Override
    public void mouseClicked(MouseEvent me) {
       
    }

    @Override
    public void mousePressed(MouseEvent me) {
  
        Object evt = me.getSource();
        
        if (evt.equals(view.jButton_confir)) {
            changeBackground(view.confir, new Color(0,204,255));
            
        }else if (evt.equals(view.jButton_cancel)) {
            changeBackground(view.cancel, new Color(0,204,255));
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.jButton_confir)) {
            changeBackground(view.confir, new Color(0,204,255));
        }else if (evt.equals(view.jButton_cancel)) {
            changeBackground(view.cancel, new Color(0,204,255));
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.jButton_confir)) {
            changeBackground(view.confir, new Color(0,204,255));
        }else if (evt.equals(view.jButton_cancel)) {
            changeBackground(view.cancel, new Color(0,204,255));
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
   
        Object evt = me.getSource();
        
       if (evt.equals(view.jButton_confir)) {
            changeBackground(view.confir, new Color(0,204,255));
        }else if (evt.equals(view.jButton_cancel)) {
            changeBackground(view.cancel, new Color(0,204,255));
        }
    }
    
    private void changeBackground (JPanel panel, Color color){
    
        panel.setBackground(color);
        
    }
    
}
