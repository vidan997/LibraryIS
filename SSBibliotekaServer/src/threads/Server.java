/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vidan
 */
public class Server extends Thread {

    private ServerSocket serverSocket;
    private List<ClientHandlerThread> clientHandlers;

    public Server() throws IOException {
        serverSocket = new ServerSocket(9000);//todo
        clientHandlers = new ArrayList<>();
    }

    @Override
    public void run() {
        while (!serverSocket.isClosed()) {
            try {
                System.out.println("waiting...");
                Socket socket = serverSocket.accept();
                ClientHandlerThread clientHandler = new ClientHandlerThread(socket);
                clientHandlers.add(clientHandler);
                clientHandler.start();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        stopAllClientHandlers();
    }

    private void stopAllClientHandlers() {
        for (ClientHandlerThread clientHandler : clientHandlers) {
            try {
                clientHandler.stopClientHandler();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void stopServer() throws IOException {
        serverSocket.close();
    }

    public boolean isServerBound() {
        return serverSocket.isBound();
    }
}
