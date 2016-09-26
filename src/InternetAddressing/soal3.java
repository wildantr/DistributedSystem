/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternetAddressing;

import java.net.*;

/**
 *
 * @author LAB_TI
 */
public class soal3 {

    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Looking up Localhost");
        String host = "Jaringan07";
        InetAddress[] add = InetAddress.getAllByName(host);
        for (int i = 0; i < add.length; i++) {
            System.out.println("IP Address from " + i + " : " + add[i]);
        }
    }
}
