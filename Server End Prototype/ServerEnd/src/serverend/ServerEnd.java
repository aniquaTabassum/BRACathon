/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverend;

import java.io.*;
import java.util.*;
import java.net.Authenticator.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;

/**
 *
 * @author User
 */
public class ServerEnd {

    /**
     * @param args the command line arguments
     */
    static ServerSocket ss;
    static Socket s;
    static InputStreamReader inr;
    static BufferedReader br;
    static String msg = "";

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // TODO code application logic here
            ss = new ServerSocket(49170);
            while (true) {
                s = ss.accept();
                System.out.println("waiting.......");
                /*     StringBuffer buff = new StringBuffer("");
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            while((msg = br.readLine())!= null)
            {
                buff.append(msg);
            }*/

                ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
                try {
                    Object stringObj = ois.readObject();
                    msg = String.valueOf(stringObj);
                    
                    
                } catch (ClassNotFoundException ex) {
                    //Logger.getLogger(Bracathon.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                HomeFrame.response = msg;
                System.out.println(msg);
                new HomeFrame().setVisible(true);
            }
        } catch (IOException ex) {
            //Logger.getLogger(Bracathon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
