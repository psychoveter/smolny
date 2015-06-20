/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 777
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class View extends JFrame{
    Model model = new Model();
    
   public View(){
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout (3,3));
        
        JButton [] buttons = new JButton[model.getField()];
        
        for(int k = 0; k < model.getField() ; k++){
            JButton btn = new JButton();
            buttons[k] = btn;
            add(btn);
            
         
        
            btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
              
                if(model.getState() == "cross") { 
               
                btn.setText(model.getCross());
                 model.setZero();
                 if(model.checkGoal(buttons) == true){
                     
                     int reply;
//                      
                  reply = JOptionPane.showConfirmDialog(null, "Победа! Продолжить", null, JOptionPane.YES_NO_OPTION);
                    
                         if (reply == JOptionPane.YES_OPTION) {
                          model.erase(buttons);
                   }
                         else {
                         System.exit(0);
                         }
                 }
                      
                 
                 if(model.ifDraw(buttons) == true && model.checkGoal(buttons) == false){
                     int reply;
//                      
                  reply = JOptionPane.showConfirmDialog(null, "Ничья! Продолжить?", null, JOptionPane.YES_NO_OPTION);
                    
                         if (reply == JOptionPane.YES_OPTION) {
                          model.erase(buttons);
                   }
                         else {
                         System.exit(0);
                         }
                 }
                 
                    
                }
                 
                
                 else {
                   
                   btn.setText(model.getZero());
                   model.setCross();
                  if(model.checkGoal(buttons) == true){
                      int reply;
//                      
                  reply = JOptionPane.showConfirmDialog(null, "Победа! Продолжить?", null, JOptionPane.YES_NO_OPTION);
                    
                         if (reply == JOptionPane.YES_OPTION) {
                          model.erase(buttons);
                   }
                         else {
                         System.exit(0);
                         }

                    
                  }
                  
                   if(model.ifDraw(buttons) == true && model.checkGoal(buttons) == false){
                     int reply;
//                      
                  reply = JOptionPane.showConfirmDialog(null, "Ничья! Продолжить?", null, JOptionPane.YES_NO_OPTION);
                    
                         if (reply == JOptionPane.YES_OPTION) {
                          model.erase(buttons);
                   }
                         else {
                         System.exit(0);
                         }
                 
                   }
               }
              

            }
              });
            
           
        }
    setVisible(true);
   }
       
      
       
        
        
        
       
      
    

    public static void main(String [] args){
        View view = new View();
        
    }

   
}
