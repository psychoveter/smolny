package clock;


import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.SwingConstants;
import java.util.*;
import java.text.*;
 
public class Clock {
 
  public static void main(String[] arguments) {
 
    ClockLabel date = new ClockLabel("date");
    ClockLabel time = new ClockLabel("time");
    ClockLabel day = new ClockLabel("day");
 
    JFrame f = new JFrame("Useless thing");
    f.setSize(300,150);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(new GridLayout(3, 1));
 
    
    f.add(time);
    f.add(date);
    f.add(day);
 
    f.getContentPane().setBackground(Color.white);
 
    f.setVisible(true);
  }
}
 
class ClockLabel extends JLabel implements ActionListener {
 
  String type;
  SimpleDateFormat sdf;//It's cool feature!!!
 
  public ClockLabel(String type) {
    this.type = type;
    setForeground(Color.red);
 
    switch (type) {
      
      case "time" : sdf = new SimpleDateFormat("HH:MM:ss");
                    setFont(new Font("sans-serif", Font.PLAIN, 40));
                    setHorizontalAlignment(SwingConstants.CENTER);
                    break;
      case "date" : sdf = new SimpleDateFormat("MMMM dd yyyy");
                    setFont(new Font("sans-serif", Font.PLAIN, 20));
                    setHorizontalAlignment(SwingConstants.CENTER);
                    break;
      case "day"  : sdf = new SimpleDateFormat("EEEE");
                    setFont(new Font("sans-serif", Font.PLAIN, 20));
                    setHorizontalAlignment(SwingConstants.CENTER);
                    break;
      default     : sdf = new SimpleDateFormat();
                    break;
    }
 
    Timer t = new Timer(1000, this);
    t.start();
  }
 
  public void actionPerformed(ActionEvent ae) {
    Date d = new Date();
    setText(sdf.format(d));
  }
  }
