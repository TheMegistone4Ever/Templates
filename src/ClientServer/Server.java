package ClientServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import static ClientServer.Constants.PORT;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.printf("Server started on port %d\n", PORT);
            while (true) {
                try (Socket socket = serverSocket.accept();
                     DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                     DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream())) {
                    System.out.println("Client connected");

                    // Handle client

                } catch (Exception e) {
                    throw new RuntimeException("Error communicating with client", e);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Cannot open port", e);
        }
    }
}
