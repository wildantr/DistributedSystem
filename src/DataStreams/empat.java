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
public class empat {
    public static void main(String[] args) {
        empat a = new empat();
        a.input();
    }
    
    int no=0;
    String inputan;
    InputStream dataIn=System.in;
    InputStreamReader read=new InputStreamReader(dataIn);
    BufferedReader buffread=new BufferedReader(read);
    public void input(){
        try {
            this.no +=1;
            System.out.println("Input 'exit' to close your program");
            System.out.print("Input your word\t: ");
            inputan=buffread.readLine();
            
            if(inputan.equals("exit")){
                System.out.println("your type : exit");
                System.exit(0);
            }else{
                System.err.println(this.no+" your type : "+inputan+"\n");
                input();
            }
        } catch (Exception e) {
        }
    }
}
