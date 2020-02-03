/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


/**
 *
 * @author vidan
 */
public interface OpstiDomenskiObjekat {
    
    public String dajNazivTabele();
    public String dajNaziveAtributa();
    public String dajVrednostiAtributa();
    public boolean isAutoincrement();
    public void setId(Object id);
    public void dajUslov();
}
