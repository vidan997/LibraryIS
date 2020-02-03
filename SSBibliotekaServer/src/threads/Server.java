/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import controller.Controller;
import domain.Klijent;
import domain.OpstiDomenskiObjekat;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import view.MainFrame;

/**
 *
 * @author vidan
 */
public class Server extends Thread {

    private static ServerSocket serverSocket;
    private List<ClientHandlerThread> clientHandlers;


    public Server() throws IOException {
        serverSocket = new ServerSocket(9000);//todo
        clientHandlers = new ArrayList<>();
    }


    @Override
    public void run() {
        while (!serverSocket.isClosed()) {
            try {
                Socket socket = serverSocket.accept();
                ClientHandlerThread clientHandler = new ClientHandlerThread(socket,this);
                clientHandler.start();
            } catch (IOException ex) {
                System.out.println("Server je ugasen.");
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
        System.out.println(clientHandler.getLoggedUser().toString() + " se konektovao.");
    }

    public HashMap<OpstiDomenskiObjekat, Date> vratiKlijente() {
        HashMap<OpstiDomenskiObjekat, Date> map = new HashMap<>();
        for (ClientHandlerThread clientHandler : clientHandlers) {
            map.put(clientHandler.getLoggedUser(), clientHandler.getVremDate());
        }
        return map;
    }

    void izbaci(ClientHandlerThread client) {
        for (ClientHandlerThread clientHandler : clientHandlers) {
            if(clientHandler.getLoggedUser().equals(client.getLoggedUser())){
                clientHandlers.remove(clientHandler);
            }
        }
    
    }

}
