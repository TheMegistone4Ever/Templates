package ClientServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import static ClientServer.Constants.PORT;
import static ClientServer.Constants.SERVER_ADDRESS;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, PORT);
             DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
             DataInputStream dataInputStream = new DataInputStream(socket.getInputStream())) {
            System.out.println("Connected to server");

            // Handle server

        } catch (Exception e) {
            throw new RuntimeException("Error communicating with server", e);
        }
    }
}
