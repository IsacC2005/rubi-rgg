/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import paneles.Interfaz;
import paneles.Operation;
/**
 *
 * @author User
 */
public class Controller implements MouseListener{

    private final Interfaz view;
    
    
    public final void events (){
    view.jButton_clin.addMouseListener(this);
    view.jButton_Rmerc.addMouseListener(this);
    view.jButton_Tlis.addMouseListener(this);
    view.jButton_Cusu.addMouseListener(this);
    
    }

    public Controller(Interfaz view) {
        this.view = view;
        events();
       
    }
   
       
     
    
    @Override
    public void mouseClicked(MouseEvent me) {
       
    }

    @Override
    public void mousePressed(MouseEvent me) {
  
        Object evt = me.getSource();
        
        if (evt.equals(view.jButton_Rmerc)) {
            changeBackground(view.r_mer, new Color(0,204,255));
        }else if (evt.equals(view.jButton_Cusu)) {
            changeBackground(view.User, new Color(0,204,255));
        }else if (evt.equals(view.jButton_Tlis)) {
            changeBackground(view.t_sam, new Color(0,204,255));
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.jButton_Rmerc)) {
            changeBackground(view.r_mer, new Color(0,204,255));
        }else if (evt.equals(view.jButton_Cusu)) {
            changeBackground(view.User, new Color(0,204,255));
        }else if (evt.equals(view.jButton_Tlis)) {
            changeBackground(view.t_sam, new Color(0,204,255));
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.jButton_Rmerc)) {
            changeBackground(view.r_mer, new Color(0,204,255));
        }else if (evt.equals(view.jButton_Cusu)) {
            changeBackground(view.User, new Color(0,204,255));
        }else if (evt.equals(view.jButton_Tlis)) {
            changeBackground(view.t_sam, new Color(0,204,255));
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.jButton_Rmerc)) {
            changeBackground(view.r_mer, new Color(0,204,255));
        }else if (evt.equals(view.jButton_Cusu)) {
            changeBackground(view.User, new Color(0,204,255));
        }else if (evt.equals(view.jButton_Tlis)) {
            changeBackground(view.t_sam, new Color(0,204,255));
        }
    }
    
    private void changeBackground (JPanel panel, Color color){
    
        panel.setBackground(color);
        
    }
    
}
