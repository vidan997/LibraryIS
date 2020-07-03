/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so;

import database.DatabaseBroker;
import domain.OpstiDomenskiObjekat;
import exception.ValidationException;
import java.util.List;
import java.util.Map;
import validator.Validator;

/**
 *
 * @author student1
 */
public abstract class OpstaSistemskaOperacija {
    DatabaseBroker dbbr;
    Validator validator;
    OpstiDomenskiObjekat odo;
    List<OpstiDomenskiObjekat> listodo;
    Map<String,String> map;
    public OpstaSistemskaOperacija(OpstiDomenskiObjekat odo) {
        dbbr=new DatabaseBroker();
        this.odo=odo;
    }
    
    public OpstaSistemskaOperacija(List<OpstiDomenskiObjekat> listodo){
        dbbr = new DatabaseBroker();
        this.listodo = listodo;
    }

    public OpstaSistemskaOperacija(Map<String,String> map,Validator validator){
        this.map = map;
        this.validator = validator;
        dbbr= new DatabaseBroker();
    }
    
    public OpstaSistemskaOperacija() {
        dbbr = new DatabaseBroker();
    }
    
    public void uspostaviKonekciju() throws Exception{
        dbbr.connect();
    }
    
    public void raskiniKonekciju() throws Exception{
        dbbr.disconnect();
    }
    
    public void proveriPreduslove() throws ValidationException{
        
        if(validator!=null){
            odo = (OpstiDomenskiObjekat) validator.validate(map);
        }
    }
    
    public abstract void izvrsenjeOperacije() throws Exception;
    
    
    public void opsteIzvrsenje() throws Exception{
            
        uspostaviKonekciju();
        
        proveriPreduslove();
        
        try{
            izvrsenjeOperacije();
            dbbr.commit();
        }catch(Exception e){
            dbbr.rollback();
            throw e;
        }finally{
            raskiniKonekciju();
        }
        
        
    }
    
    public OpstiDomenskiObjekat getOdo(){
        return odo;
    }
    
    public List<OpstiDomenskiObjekat> getListOdo(){
        return listodo;
    }
}
