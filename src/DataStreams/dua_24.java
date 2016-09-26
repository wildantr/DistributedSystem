/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStreams;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author LAB_TI
 */
public class dua_24 {
    public static void main(String[] args) {
        try {
            //ghet the output stream representing standart output
            OutputStream output = System.out;
            
            //create an OutputStreamWriter
            OutputStreamWriter writer = new OutputStreamWriter(output);
            
            //write to standart output using a writer
            writer.write("Haii sahabat");
            
            //flush and close the writer, to ensure it is written
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.err.println("I/O error : "+ e);
        }
    }
}
