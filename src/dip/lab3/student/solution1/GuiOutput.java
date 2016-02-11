/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class GuiOutput implements Output {

    @Override
    public void getOutput(String line) {
        JOptionPane.showMessageDialog(null, line);
    }

   
      
   
}
