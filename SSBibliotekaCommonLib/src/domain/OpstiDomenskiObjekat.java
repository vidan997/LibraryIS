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
    public String dajKljuc();
    public String join();
    public String update();
    public Long dajVrednostiKljuca();
    public boolean isAutoincrement();
    public void setId(Object id);
    public String dajUslov();
}
