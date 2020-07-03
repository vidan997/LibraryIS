/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

import domain.Autor;
import domain.Klijent;
import domain.Knjiga;
import domain.OpstiDomenskiObjekat;
import domain.Zaduzivanje;
import domain.Zanr;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import transfer.RequestObject;
import transfer.ResponseObject;
import util.Operation;

/**
 *
 * @author vidan
 */
public class CommunicationController {

    private Socket socket;
    private static CommunicationController instance;

    private CommunicationController() throws IOException {
        socket = new Socket("localhost", 9000);
    }

    public static CommunicationController getInstance() throws IOException {
        if (instance == null) {
            instance = new CommunicationController();
        }
        return instance;
    }

    public OpstiDomenskiObjekat logIn(Map data) throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(Operation.OPERATION_LOGIN);

        request.setData(data);

        sendRequest(request);

        ResponseObject response = receiveResponse();
        if (response.getException() != null) {
            throw response.getException();
        }

        return (OpstiDomenskiObjekat) response.getData();
    }

    private void sendRequest(RequestObject request) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();
    }

    private ResponseObject receiveResponse() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        return response;
    }

    public List<Zanr> vratiZanrove() throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(Operation.OPERATION_VRATI_ZANROVE);
        sendRequest(request);
        ResponseObject response = receiveResponse();

        if (response.getException() != null) {
            throw response.getException();
        }

        return (List<Zanr>) response.getData();
    }

    public List<Autor> vratiAutore() throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(Operation.OPERATION_VRATI_AUTORE);
        sendRequest(request);
        ResponseObject response = receiveResponse();

        if (response.getException() != null) {
            throw response.getException();
        }

        return (List<Autor>) response.getData();
    }

    public Klijent sacuvajNovogKlijenta(Map<String, String> data) throws IOException, ClassNotFoundException, Exception {
        RequestObject request = new RequestObject();
        request.setData(data);
        request.setOperation(Operation.OPERATION_DODAJ_NOVOG);
        sendRequest(request);

        ResponseObject response = receiveResponse();
        if (response.getException() != null) {
            throw response.getException();
        }
        return (Klijent) response.getData();
    }

    public Knjiga sacuvajNovuKnjigu(Map<String, Object> data) throws IOException, ClassNotFoundException, Exception {
        RequestObject request = new RequestObject();
        request.setOperation(Operation.OPERATION_DODAJ_NOVU_KNJIGU);
        request.setData(data);
        sendRequest(request);
        ResponseObject response = receiveResponse();

        if (response.getException() != null) {
            throw response.getException();
        }

        return (Knjiga) response.getData();
    }

    public Klijent pretraziKlijenta(String imeUser) throws IOException, Exception {
        RequestObject request = new RequestObject();
        request.setOperation(Operation.OPERATION_PRETRAZI_KLIJENTA);
        request.setData(imeUser);
        sendRequest(request);

        ResponseObject response = receiveResponse();

        if (response.getException() != null) {
            throw response.getException();
        }

        return (Klijent) response.getData();
    }

    public List<Zaduzivanje> vratiZaduzenja(Klijent klijent) throws IOException, ClassNotFoundException, Exception {
        RequestObject request = new RequestObject();
        request.setOperation(Operation.OPERATION_VRATI_ZADUZIVANJA);
        request.setData(klijent);
        sendRequest(request);

        ResponseObject response = receiveResponse();

        if (response.getException() != null) {
            throw response.getException();
        }

        return (List<Zaduzivanje>) response.getData();
    }

    public void sacuvajIzmeneZaduzenja(List<Zaduzivanje> zaduzanja) throws IOException, Exception {
        RequestObject request = new RequestObject();
        request.setOperation(Operation.OPERATION_RAZDUZI);
        request.setData(zaduzanja);
        sendRequest(request);

        ResponseObject response = receiveResponse();

        if (response.getException() != null) {
            throw response.getException();
        }
    }

    public void izmeniKorisnika(Klijent klijent) throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(Operation.OPERATION_IZMENA_KLIJENTA);
        request.setData(klijent);
        sendRequest(request);

        ResponseObject response = receiveResponse();

        if (response.getException() != null) {
            throw response.getException();
        }
    }

}
