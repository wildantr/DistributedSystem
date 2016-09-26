/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternetAddressing;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author LAB_TI
 */
public class soal1_contoh1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Looking up Localhost");
        InetAddress localAddress = InetAddress.getLocalHost();
        System.out.println("Name : " + localAddress.getHostName());
        System.out.println("IP Address : " + localAddress.getHostAddress());
        System.out.println(localAddress);
    }

}
