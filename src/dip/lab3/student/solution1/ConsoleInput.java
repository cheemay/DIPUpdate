/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class ConsoleInput implements MessageInput {

    @Override
    public String getMessageInput() {
        System.out.print("Please enter text here:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();   
    }
    
}
