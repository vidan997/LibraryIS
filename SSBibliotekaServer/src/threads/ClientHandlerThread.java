/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import controller.Controller;
import domain.Administrator;
import domain.Klijent;
import domain.Knjiga;
import domain.OpstiDomenskiObjekat;
import exception.LogInException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
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
    private Administrator loggedAdmin;
    private Date vremeLogovanja;
    private Server server;

    public ClientHandlerThread(Socket socket, Server server) {
        this.socket = socket;
        this.server = server;
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
                    case Operation.OPERATION_PRETRAZI_KLIJENTA:
                        response = nadjiKlijenta(request);
                }
                sendResponse(response);
            } catch (Exception e) {
                try {
                    socket.close();
                    server.izbaci(this);
                } catch (IOException ex) {
                }
            }
        }
    }

    private ResponseObject logIn(RequestObject request) {
        Map<String, String> data = (Map<String, String>) request.getData();
        String username = (String) data.get("username");
        String password = (String) data.get("password");
        String adminKlijent = (String) data.get("adminKlijent");
        ResponseObject response = new ResponseObject();
        try {
            if (adminKlijent.equals("klijent")) {
                Klijent user = (Klijent) Controller.getInstance().logIn(username, password);
                response.setData(user);
                loggedUser = user;
            }else if(adminKlijent.equals("admin")){
                Administrator administrator = (Administrator) Controller.getInstance().logIn(username, password);
                response.setData(administrator);
                loggedAdmin = administrator;
            }
            vremeLogovanja = new Date(System.currentTimeMillis());
            server.dodajKlijenta(this);
        } catch (LogInException e) {
            e.printStackTrace();
            response.setException(e);
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
        List<OpstiDomenskiObjekat> zaduzivanja = (List<OpstiDomenskiObjekat>) request.getData();
        ResponseObject response = new ResponseObject();
        try {
            zaduzivanja = Controller.getInstance().sacuvajZaduzivanja(zaduzivanja);
            response.setData(zaduzivanja);
        } catch (Exception ex) {
            response.setException(ex);
            Logger.getLogger(ClientHandlerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
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

    private ResponseObject nadjiKlijenta(RequestObject request) throws Exception {
        Klijent klijent = (Klijent) request.getData();
        ResponseObject response = new ResponseObject();
        klijent = Controller.getInstance().nadjiKlijenta(klijent);
        response.setData(klijent);
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

    public void stopClientHandler() throws IOException {
        socket.close();
    }

    public OpstiDomenskiObjekat getLoggedUser() {
        if(loggedUser==null){
            return loggedAdmin;
        }
        return loggedUser;
    }

    public Date getVremDate() {
        return vremeLogovanja;
    }
}
