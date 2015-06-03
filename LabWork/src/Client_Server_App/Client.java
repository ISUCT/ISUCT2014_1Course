/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Client_Server_App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author stud_17
 */
public class Client {
    
        public void go() {
        try {
            Socket s = new Socket("127.0.0.1", 5000);

            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            System.out.println("Сегодня ты должен " + advice);

            reader.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.go();
    }
}
