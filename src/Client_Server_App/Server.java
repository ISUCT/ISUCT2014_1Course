
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client_Server_App;

import java.net.*;
import java.io.*;

/**
 *
 * @author stud_17
 */
public class Server {

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(5000);
            while (true) {
                Socket sock = serverSock.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = "hello";
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.go();
    }
}
