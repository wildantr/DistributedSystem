/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStreams;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author LAB_TI
 */
public class dua_23 {
    public static void main(String[] args) {
        try {
            System.out.print("Please enter your name : ");
            
            //get the input stream representing standart input
            InputStream input = System.in;
            
            // create an inputstreamreader
            InputStreamReader reader = new InputStreamReader(input);
            
            //connect to a buffered reader, to use the readline() method
            BufferedReader bufReader = new BufferedReader(reader);
            String name = bufReader.readLine();
            System.out.println("Hi, Nice to meet you, "+ name);
        } catch (Exception e) {
            System.err.println("I?O error : "+e);
        }
    }
}
