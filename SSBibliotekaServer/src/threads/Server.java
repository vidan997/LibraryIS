/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import controller.Controller;
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

    private static Server instance;

    private Server() throws IOException {
        serverSocket = new ServerSocket(9000);//todo
        clientHandlers = new ArrayList<>();
    }

    public static Server getInstance() throws IOException {
        if (instance == null) {
            instance = new Server();
        }
        return instance;
    }

    @Override
    public void run() {
        while (!serverSocket.isClosed()) {
            try {
                Socket socket = serverSocket.accept();
                ClientHandlerThread clientHandler = new ClientHandlerThread(socket);
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

    void dodajKlijenta(ClientHandlerThread clientHandler) {
        clientHandlers.add(clientHandler);
        System.out.println(clientHandler.getLoggedUser().getIme() + " " + clientHandler.getLoggedUser().getPrezime() + "se konektovao.");
    }
}
