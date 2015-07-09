/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork;

import java.util.Scanner;

/**
 *
 * @author samundrak
 */
public class AbstractExampleChild extends AbstractExample{
    private String in;

    @Override
    public void input() {
      in = new Scanner(System.in).nextLine();
    }

    @Override
    public void display() {
        System.out.println(in);
    }

    
    
}
