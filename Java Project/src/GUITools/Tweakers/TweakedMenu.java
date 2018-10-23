/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUITools.Tweakers;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
/**
 *
 * @author Raiisa
 */
public class TweakedMenu {
    private List<TweakedLink> Menu;
    
    
    public TweakedMenu(List<TweakedLink> Menu){
        this.Menu=Menu;
        init();
        initListner();
    }

    private void init(){
        reset();
        Menu.get(0).getPage().setVisible(true);
        Menu.get(0).activateButton();
        Menu.get(0).setActive(true);
    }
    
    private void initListner() {
        for(TweakedLink link:Menu){
               link.getButton().addMouseListener(new MouseAdapter() {
                   @Override
                   public void mouseReleased(MouseEvent mevent){
                       if(link.isEnter())
                       {
                           if(!link.isActive()){
                                reset();
                                link.getPage().setVisible(true);
                                link.activateButton();
                                link.setActive(true);
                           }
                       }
                   }
                });
        }
    }
    
    
    private void reset(){
        for(TweakedLink link:Menu){
            link.getPage().setVisible(false);
            link.reset();
            link.setActive(false);
        }
    }
}
