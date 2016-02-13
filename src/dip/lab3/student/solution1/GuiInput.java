/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class GuiInput implements MessageInput {

    @Override
    public String getMessageInput() {
       String result = JOptionPane.showInputDialog("Hello");
       return result;
        
    }   
}
