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
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author LAB_TI
 */
public class lima_26 {
    public static void main(String[] args) throws Exception {
        //open the sound file as a java input stream
        String audioFile = "d:/mudul/bubbles.wav";
        InputStream in = new FileInputStream(audioFile);
        
        //create an audiostream from the inputstream
        AudioStream audioStream = new AudioStream(in);
        
        //play the audio clip with the audioplayer class
        AudioPlayer.player.start(audioStream);
    }
}
