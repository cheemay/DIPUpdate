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
public class Startup {
    public static void main(String[] args) {
//        MessageInput input = new GuiInput();
//
//        String result = input.getMessageInput();
//         
//        
//        MessageOutput output = new GuiOutput();
//        output.getMessageOutput(result);

        MessageInput input = new ConsoleInput();
        MessageOutput output = new ConsoleOutput();
        
        MessageService message = new MessageService(input,output);
        message.getMessage();
           
    }
    
}
