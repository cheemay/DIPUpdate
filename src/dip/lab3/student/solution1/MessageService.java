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
public class MessageService {
    
    private MessageInput input;
    private MessageOutput output;

    public MessageService(MessageInput input, MessageOutput output) {
        this.input = input;
        this.output = output;
    }
    
    public void getMessage(){
        String line = input.getMessageInput();
        output.getMessageOutput(line);
        
    }
    
}