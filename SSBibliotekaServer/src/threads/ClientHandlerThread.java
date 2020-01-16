/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import controller.Controller;
import domain.Klijent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import transfer.RequestObject;
import transfer.ResponseObject;
import util.Operation;

/**
 *
 * @author student1
 */
public class ClientHandlerThread extends Thread {

    private Socket socket;
    private Klijent loggedUser;

    public ClientHandlerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while (!socket.isClosed()) {
            try {
                RequestObject request = receiveRequest();
                ResponseObject response = null;
                switch (request.getOperation()) {
                    case Operation.OPERATION_LOGIN:
                        response = logIn(request);
                        break;
                    case Operation.OPERATION_RAZDUZI:
                        break;
                    case Operation.OPERATION_SACUVAJ_ZADUZIVANJE:
                        break;
                    case Operation.OPERATION_VRATI_KNJIGE:
                        break;

                }
                sendResponse(response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private ResponseObject logIn(RequestObject request) {
        Map<String, String> data = (Map<String, String>) request.getData();
        String username = (String) data.get("username");
        String password = (String) data.get("password");
        ResponseObject response = new ResponseObject();
        try {
            Klijent user = Controller.getInstance().logIn(username, password);
            loggedUser=user;
            response.setData(user);
        } catch (Exception e) {
            e.printStackTrace();
            response.setException(e);
        }
        return response;
    }

    private RequestObject receiveRequest() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        return (RequestObject) in.readObject();
    }

    private void sendResponse(ResponseObject response) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(response);
        out.flush();
    }
    
    public void stopClientHandler() throws IOException{
            socket.close();
    }

    public Klijent getLoggedUser() {
        return loggedUser;
    }
    
    

}
