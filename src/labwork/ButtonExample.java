/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author samundrak
 */
public class ButtonExample extends JFrame implements ActionListener
{
    ArrayList<JButton> jb;
    
    public ButtonExample(){
        super("Sam");
        jb = new ArrayList<JButton>();

        addButtons();
        setSize(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public ButtonExample display(){
                setVisible(true);
                return this;
    }
 
    private void addButtons() {
         JButton one = new JButton("Start");
         JButton two = new JButton("Stop");
         FlowLayout fl = new FlowLayout();
         
         add(one);
         add(two);
         
         
         for (int i = 0; i < 10; i++) {
             JButton j = new JButton(i+"");
             jb.add(j);
         
         }
         
         for (int i = 0; i < jb.size(); i++) {
            add(jb.get(i));
            jb.get(i).addActionListener(this);
        }
 
         
          System.out.println(jb.size());
         setLayout(fl);
         Listen l = new Listen();
         one.addActionListener(l);
         two.addActionListener(l);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
    
    
    
    class Listen implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand() == "Start"){
                    System.out.println("Program is Starting");
         }else{
                    System.out.println("Program is stopping");
                }
        }
        
    }
}
