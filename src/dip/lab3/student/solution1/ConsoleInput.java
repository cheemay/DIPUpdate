/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;
import java.io.InputStream;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class ConsoleInput implements Input {

    @Override
    public String getInput() {
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        System.out.println("Name");
        String result = scanner.next();
        System.out.println("Hello" + result);
        scanner.close();
        return result;    
    }
    
}
