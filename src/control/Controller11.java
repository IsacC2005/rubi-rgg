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
import paneles.cambio_contra;
/**
 *
 * @author User
 */
public class Controller11 implements MouseListener{

    private final cambio_contra view;
    
    public final void events (){
    view.jButton_confir2.addMouseListener(this);
    view.jButton_cancel2.addMouseListener(this);
    
    }
 
    public Controller11(cambio_contra view) {
        this.view = view;
        events();
       
    }
   
    @Override
    public void mouseClicked(MouseEvent me) {
       
    }

    @Override
    public void mousePressed(MouseEvent me) {
  
        Object evt = me.getSource();
        
        if (evt.equals(view.jButton_confir2)) {
            changeBackground(view.confir2, new Color(0,204,255));
            
        }else if (evt.equals(view.jButton_cancel2)) {
            changeBackground(view.cancel2, new Color(0,204,255));
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.jButton_confir2)) {
            changeBackground(view.confir2, new Color(0,204,255));
        }else if (evt.equals(view.jButton_cancel2)) {
            changeBackground(view.cancel2, new Color(0,204,255));
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.jButton_confir2)) {
            changeBackground(view.confir2, new Color(0,204,255));
        }else if (evt.equals(view.jButton_cancel2)) {
            changeBackground(view.cancel2, new Color(0,204,255));
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
   
        Object evt = me.getSource();
        
       if (evt.equals(view.jButton_confir2)) {
            changeBackground(view.confir2, new Color(0,204,255));
        }else if (evt.equals(view.jButton_cancel2)) {
            changeBackground(view.cancel2, new Color(0,204,255));
        }
    }
    
    private void changeBackground (JPanel panel, Color color){
    
        panel.setBackground(color);
        
    }
    
}
