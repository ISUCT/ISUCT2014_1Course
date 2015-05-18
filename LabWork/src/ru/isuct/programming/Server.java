/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.isuct.programming;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author stud_17
 */
public class Server {

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4242);

            while (true) {
                Socket sock = serverSock.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = "HELLO";
                writer.println(advice);
                writer.close();
                System.out.println(advice);

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    } //

    public static void main(String[] args) {
        Server server = new Server();
        server.go();
    }
}
