/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author samundrak
 */
public class SimpleGui extends JFrame implements ActionListener {

    JButton red, green, blue;
    JTextField txt;

    public SimpleGui() {

        super("TicTacToe");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public SimpleGui init() {
        red = new JButton("Red");
        green = new JButton("Green");
        blue = new JButton("Blue");
        txt = new JTextField();
        GridLayout gl = new GridLayout(4, 1);
        setLayout(gl);
        add(txt);
        add(green);
        add(blue);
        add(red);
        return this;
    }

    public SimpleGui eventListen() {
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        return this;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Red")) {
            txt.setBackground(Color.red);
        } else if (e.getActionCommand().equals("Green")) {
            txt.setBackground(Color.green);
        } else {
            txt.setBackground(Color.BLUE);
         }
    }
}
