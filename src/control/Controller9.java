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
import paneles.RVsistemas;
/**
 *
 * @author User
 */
public class Controller9 implements MouseListener{

    private final RVsistemas view;
    
    public final void events (){
    view.Inicio.addMouseListener(this);
    
    
    }
 
    public Controller9(RVsistemas view) {
        this.view = view;
        events();
       
    }
   
    @Override
    public void mouseClicked(MouseEvent me) {
       
    }

    @Override
    public void mousePressed(MouseEvent me) {
  
        Object evt = me.getSource();
        
        if (evt.equals(view.Inicio)) {
            changeBackground(view.ini, new Color(0,204,255));
            
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.Inicio)) {
            changeBackground(view.ini, new Color(0,204,255));
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.Inicio)) {
            changeBackground(view.ini, new Color(0,204,255));
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.Inicio)) {
            changeBackground(view.ini, new Color(0,204,255));
        }
    }
    
    private void changeBackground (JPanel panel, Color color){
    
        panel.setBackground(color);
        
    }
    
}
