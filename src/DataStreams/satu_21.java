/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author LAB_TI
 */
public class satu_21 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream fileInput = new FileInputStream("d:/wildantr.txt");
        
        //read the first byte of data
        int data = fileInput.read();
        
        while (data != -1){
            System.out.print((char)data);
            
            data = fileInput.read();
        }
        fileInput.close();
    }
}
