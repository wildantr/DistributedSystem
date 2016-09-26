/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternetAddressing;

import java.io.*;
import java.net.*;

/**
 *
 * @author LAB_TI
 */
public class soal2 {

    public static void main(String[] args) {
        soal2 d = new soal2();
        d.setMenu();
    }

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String host;
    String adress;
    InetAddress go;
    String status;

    public void setMenu() {
        int menu;
        try {
            System.out.println("Input your selection :");
            System.out.println("1. IP adress\n2. Address host");
            System.out.print("Your Choice\t: ");
            menu = Integer.parseInt(in.readLine());
            if (menu == 1) {
                inputIP();
                System.out.println("");
                ulang();
            } else if (menu == 2) {
                inputHost();
                System.out.println("");
                ulang();
            } else {
                System.err.println("Sorry, your choice is nothing.");
                System.out.println("");
            }

        } catch (Exception e) {
        }
    }

    public void ulang() {
        try {
            String jawab;
            System.out.print("Want to repeat ? y/n : ");
            jawab = in.readLine();
            if (jawab.equals("y")) {
                setMenu();
            } else if (jawab.equals("n")) {
                System.out.println("Thanks");
            }
        } catch (Exception e) {
        }
    }

    public void inputHost() {
        try {
            System.out.println("# Get host adress from current name");
            System.out.print("Input your IP Address\t: ");
            adress = in.readLine();
            System.out.println("Host/IP " + adress + " : "
                    + InetAddress.getByName(adress).getHostAddress());
            System.out.println("Host/IP " + adress + " : "
                    + InetAddress.getByName(adress));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void inputIP() {
        try {
            System.out.println("# Get hostname from current ip");
            System.out.print("Input your IP\t: ");
            host = in.readLine();
            go = InetAddress.getByName(host);
            System.out.println("Hostname from IP " + host + " : "
                    + go.getHostName());
            if (go.isReachable(3000)) {
                status = "is Reachable";
            } else {
                status = "is unReachable";
            }
            System.out.println("Status : " + status);
        } catch (Exception e) {
        }
    }
}
