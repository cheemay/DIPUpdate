/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Dell
 */
public class ConsoleOutput implements MessageOutput {

    @Override
    public void getMessageOutput(String line) {
        System.out.print("Your entered:");
        System.out.println(line);
        
    }
    
}
