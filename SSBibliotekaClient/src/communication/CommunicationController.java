/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communication;

import domain.Klijent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
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
    
    public Klijent logIn(String username, String password) throws Exception{
        RequestObject request=new RequestObject();
        request.setOperation(Operation.OPERATION_LOGIN);
        
        Map<String, String> data=new HashMap<>();
        data.put("username", username);
        data.put("password", password);
        request.setData(data);
        
        sendRequest(request);
        
        ResponseObject response=receiveResponse();
        if(response.getException()!=null){
            throw response.getException();
        }
        
        return (Klijent)response.getData();
    }
    
    
    
    
    private void sendRequest(RequestObject request) throws IOException{
        ObjectOutputStream out=new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();
    }
    
    private ResponseObject receiveResponse() throws IOException, ClassNotFoundException{
        ObjectInputStream in=new ObjectInputStream(socket.getInputStream());
        ResponseObject response=(ResponseObject)in.readObject();
        return response;
    }

}
