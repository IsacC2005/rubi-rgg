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
import paneles.Usuario;
/**
 *
 * @author User
 */
public class Controller8 implements MouseListener{

    private final Usuario view;
    
    public final void events (){
    view.canc_U.addMouseListener(this);
    view.guard_U.addMouseListener(this);
    view.limp_U.addMouseListener(this);
    
    
    }
 
    public Controller8(Usuario view) {
        this.view = view;
        events();
       
    }
   
    @Override
    public void mouseClicked(MouseEvent me) {
       
    }

    @Override
    public void mousePressed(MouseEvent me) {
  
        Object evt = me.getSource();
        
        if (evt.equals(view.canc_U)) {
            changeBackground(view.ru_cance, new Color(0,204,255));
            
        }else if (evt.equals(view.guard_U)) {
            changeBackground(view.ru_guard, new Color(0,204,255));
        }else if (evt.equals(view.limp_U)) {
            changeBackground(view.ru_lim, new Color(0,204,255));
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.canc_U)) {
            changeBackground(view.ru_cance, new Color(0,204,255));
        }else if (evt.equals(view.guard_U)) {
            changeBackground(view.ru_guard, new Color(0,204,255));
        }else if (evt.equals(view.limp_U)) {
            changeBackground(view.ru_lim, new Color(0,204,255));
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.canc_U)) {
            changeBackground(view.ru_cance, new Color(0,204,255));
        }else if (evt.equals(view.guard_U)) {
            changeBackground(view.ru_guard, new Color(0,204,255));
        }else if (evt.equals(view.limp_U)) {
            changeBackground(view.ru_lim, new Color(0,204,255));
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
   
        Object evt = me.getSource();
        
       if (evt.equals(view.canc_U)) {
            changeBackground(view.ru_cance, new Color(0,204,255));
        }else if (evt.equals(view.guard_U)) {
            changeBackground(view.ru_guard, new Color(0,204,255));
        }else if (evt.equals(view.limp_U)) {
            changeBackground(view.ru_lim, new Color(0,204,255));
        }

    }
    
    private void changeBackground (JPanel panel, Color color){
    
        panel.setBackground(color);
        
    }
    
}
