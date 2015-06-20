import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 777
 */
public class Model {
    
    
    
    private static String cross = "X";
    private static String zero  = "O";
    
    private static String state = "cross";
    
    private static int field  = 9;
    
    
    
    
    public Model(){
        
        this.cross  = cross;
        this.zero = zero;
        this.state = state;
        this.field = field; 
    }
    
    public int  getField(){
        return field;
        
    }
    
    public String getCross(){
        return cross;
    }
    public String getZero(){
        return zero;
    }
    
    public String getState(){
        return state;
    }
    
    public void setZero(){
        state = "zero";
    }
    public void setCross(){
        state = "cross";
    }
        
     public void erase(JButton [] buttons){
         for (int n = 0; n < buttons.length; n++){
               buttons[n].setText("");
     }
    }
    public boolean ifDraw(JButton [] arr){
        for (JButton arr1 : arr) {
            if (arr1.getText() == "") {
                return false;
            }
        }
        return true;
    }
    
 
    public boolean checkGoal(JButton [] arr){
    if (arr[0].getText().equals(this.cross) && arr[1].getText().equals(this.cross) && arr[2].getText() == this.cross)
    {return true;}
    
    else if (arr[3].getText() == this.cross && arr[4].getText() == this.cross && arr[5].getText() == this.cross)
    {return true;}
    
    else if (arr[6].getText() == this.cross && arr[7].getText() == this.cross && arr[8].getText() == this.cross)
    {return true;} 
    
    else if (arr[0].getText() == this.cross && arr[3].getText() == this.cross && arr[6].getText() == this.cross)
    {return true;}
    
    else if (arr[1].getText() == this.cross && arr[4].getText() == this.cross && arr[7].getText() == this.cross)
    { return true;}
    
    else if (arr[2].getText() == this.cross && arr[5].getText() == this.cross && arr[8].getText() == this.cross)
    {return true;}
    
    
    
    if (arr[0].getText().equals(this.zero) && arr[1].getText().equals(this.zero) && arr[2].getText() == this.zero)
    {return true;}
    
    else if (arr[3].getText() == this.zero && arr[4].getText() == this.zero && arr[5].getText() == this.zero)
    {return true;}
    
    else if (arr[6].getText() == this.zero && arr[7].getText() == this.zero && arr[8].getText() == this.zero)
    {return true;}  
    
    else if (arr[0].getText() == this.zero && arr[3].getText() == this.zero && arr[6].getText() == this.zero)
    {return true;}
    
    else if (arr[1].getText() == this.zero && arr[4].getText() == this.zero && arr[7].getText() == this.zero)
    {return true;}
    
    else if (arr[2].getText() == this.zero && arr[5].getText() == this.zero && arr[8].getText() == this.zero)
    {return true;}
    
    
    else if (arr[0].getText() == this.cross && arr[4].getText() == this.cross && arr[8].getText() == this.cross)
    {return true;}
    else if (arr[2].getText() == this.cross && arr[4].getText() == this.cross && arr[6].getText() == this.cross)
    {return true;}    
    else if (arr[0].getText() == this.zero && arr[4].getText() == this.zero && arr[8].getText() == this.zero)
    {return true;}
    else if (arr[2].getText() == this.zero && arr[4].getText() == this.zero && arr[6].getText() == this.zero)
    {return true;}
    
    return false;
    
   }
   
   
  
}
