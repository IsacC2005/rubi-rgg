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

import paneles.Operation;
/**
 *
 * @author User
 */
public class Controller1 implements MouseListener{

    private final Operation view;
    
    public final void events (){
    view.guar_vc.addMouseListener(this);
    view.limpia_vc.addMouseListener(this);
    view.modi_vc.addMouseListener(this);
    }
 
    public Controller1(Operation view) {
        this.view = view;
        events();
       
    }
   
    @Override
    public void mouseClicked(MouseEvent me) {
       
    }

    @Override
    public void mousePressed(MouseEvent me) {
  
        Object evt = me.getSource();
        
        if (evt.equals(view.guar_vc)) {
            changeBackground(view.rc_guar, new Color(0,204,255));
        }else if (evt.equals(view.limpia_vc)) {
            changeBackground(view.cr_lim, new Color(0,204,255));
        }else if (evt.equals(view.modi_vc)) {
            changeBackground(view.rc_mod, new Color(0,204,255));
        }
            
    }

    @Override
    public void mouseReleased(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.guar_vc)) {
            changeBackground(view.rc_guar, new Color(0,204,255));
        }else if (evt.equals(view.limpia_vc)) {
            changeBackground(view.cr_lim, new Color(0,204,255));
        }else if (evt.equals(view.modi_vc)) {
            changeBackground(view.rc_mod, new Color(0,204,255));
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
   
        Object evt = me.getSource();
        
       if (evt.equals(view.guar_vc)) {
            changeBackground(view.rc_guar, new Color(0,204,255));
        }else if (evt.equals(view.limpia_vc)) {
            changeBackground(view.cr_lim, new Color(0,204,255));
        }else if (evt.equals(view.modi_vc)) {
            changeBackground(view.rc_mod, new Color(0,204,255));
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
   
        Object evt = me.getSource();
        
        if (evt.equals(view.guar_vc)) {     
            changeBackground(view.rc_guar, new Color(0,204,255));
        }else if (evt.equals(view.limpia_vc)) {
            changeBackground(view.cr_lim, new Color(0,204,255));
        }else if (evt.equals(view.modi_vc)) {
            changeBackground(view.rc_mod, new Color(0,204,255));
        }
    }
    
    private void changeBackground (JPanel panel, Color color){
    
        panel.setBackground(color);
        
    }
    
}
