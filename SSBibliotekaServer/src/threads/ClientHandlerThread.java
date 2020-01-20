/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import controller.Controller;
import domain.Klijent;
import domain.Knjiga;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
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
                        response = razduziKnjigu(request);    
                        break;
                    case Operation.OPERATION_SACUVAJ_ZADUZIVANJE:
                        response = sacuvajZaduzivanje(request);
                        break;
                    case Operation.OPERATION_VRATI_KNJIGE:
                        response = vratiKnjige();
                        break;
                    case Operation.OPERATION_UNOS_CLANARINE:
                        response = unosClanarine(request);
                        break;
                    case Operation.OPERATION_BRISI_KNJIGU:
                        response = brisiKnjigu(request);
                        break;
                    case Operation.OPERATION_DODAJ_NOVOG:
                        response = dodajNovogKlijenta(request);
                        break;
                    case Operation.OPERATION_DODAJ_NOVU_KNJIGU:
                        response = dodajNovuKnjigu(request);
                        break;
                    case Operation.OPERATION_IZMENA_KNJIGE:
                        response = izmeniKnjigu(request);
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
    
    
    private ResponseObject razduziKnjigu(RequestObject request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ResponseObject sacuvajZaduzivanje(RequestObject request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ResponseObject unosClanarine(RequestObject request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ResponseObject vratiKnjige() {
        ResponseObject response = new ResponseObject();
        try {
            response.setData(Controller.getInstance().vratiKnjige());
        } catch (Exception ex) {
            Logger.getLogger(ClientHandlerThread.class.getName()).log(Level.SEVERE, null, ex);
            response.setException(ex);
        }
        return response;
    }

    private ResponseObject brisiKnjigu(RequestObject request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ResponseObject dodajNovogKlijenta(RequestObject request) {
        Klijent klijent = (Klijent) request.getData();
        ResponseObject response = new ResponseObject();
        try {
            klijent = Controller.getInstance().novKlijent(klijent);
            response.setData(klijent);
        } catch (Exception ex) {
            Logger.getLogger(ClientHandlerThread.class.getName()).log(Level.SEVERE, null, ex);
            response.setException(ex);
        }
        return response;
    }

    private ResponseObject dodajNovuKnjigu(RequestObject request) {
        Knjiga knjiga = (Knjiga) request.getData();
        ResponseObject response = new ResponseObject();
        try {
            knjiga = Controller.getInstance().novaKnjiga(knjiga);
            response.setData(knjiga);
        } catch (Exception ex) {
            Logger.getLogger(ClientHandlerThread.class.getName()).log(Level.SEVERE, null, ex);
            response.setException(ex);
        }
        return response;
    }

    private ResponseObject izmeniKnjigu(RequestObject request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
