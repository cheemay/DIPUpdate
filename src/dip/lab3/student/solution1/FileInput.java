/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;
import java.io.*;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Dell
 */
public class FileInput implements Input {

    @Override
    public String getInput() {
        File data = new File("data.txt");
         try{   
             FileReader fileReader = new FileReader(data);
         

			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
			}
			fileReader.close();
		
			return stringBuffer.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
         
         return "";
    }
    

}
