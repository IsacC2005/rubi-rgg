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
import paneles.Respal;
/**
 *
 * @author User
 */
public class Controller2 implements MouseListener{

    private final Respal view;
    
     public final void events (){
   
    view.respalda.addMouseListener(this);
    view.busca_pl.addMouseListener(this);
    }
 
    public Controller2(Respal view) {
        this.view = view;
        events();
       
    }
   
    @Override
    public void mouseClicked(MouseEvent me) {
       
    }

    @Override
    public void mousePressed(MouseEvent me) {
  
        Object evt = me.getSource();
        
        if (evt.equals(view.respalda)) {
            changeBackground(view.rm_mod, new Color(0,204,255));
        }else if (evt.equals(view.busca_pl)) {
            changeBackground(view.rm_lim, new Color(0,204,255));
        }
            
    }

    @Override
    public void mouseReleased(MouseEvent me) {
   
        Object evt = me.getSource();
        
       if (evt.equals(view.respalda)) {
            changeBackground(view.rm_mod, new Color(0,204,255));
        }else if (evt.equals(view.busca_pl)) {
            changeBackground(view.rm_lim, new Color(0,204,255));
      
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.respalda)) {
            changeBackground(view.rm_mod, new Color(0,204,255));
        }else if (evt.equals(view.busca_pl)) {
            changeBackground(view.rm_lim, new Color(0,204,255));
        
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.respalda)) {
            changeBackground(view.rm_mod, new Color(0,204,255));
        }else if (evt.equals(view.busca_pl)) {
            changeBackground(view.rm_lim, new Color(0,204,255));
        
        }
    }
    
    private void changeBackground (JPanel panel, Color color){
    
        panel.setBackground(color);
        
    }
    
}