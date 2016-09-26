/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStreams;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author LAB_TI
 */
public class lima_25 {
    public static void main(String[] args) {
        Image image = null;
        try {
            // you may try both this technique
            
            //read from a file
            File sourceimage = new File("d:/untitled.jpg");
            image = ImageIO.read(sourceimage);
            
            //read from an input stream
            InputStream is = new BufferedInputStream(new FileInputStream("d:/untitled.jpg"));
            image = ImageIO.read(is);
        } catch (Exception e) {
        }
        
        //use a label to display the image
        JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label,BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
