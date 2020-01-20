/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;

/**
 *
 * @author student1
 */
public class Operation implements Serializable{
    private static final long serialVersionUID=3;
    
    public static final int OPERATION_LOGIN=1;
    public static final int OPERATION_VRATI_KNJIGE=2;
    public static final int OPERATION_SACUVAJ_ZADUZIVANJE=3;
    public static final int OPERATION_RAZDUZI=4;
    public static final int OPERATION_DODAJ_NOVOG=5;
    public static final int OPERATION_DODAJ_NOVU_KNJIGU=6;
    public static final int OPERATION_BRISI_KNJIGU=7;
    public static final int OPERATION_UNOS_CLANARINE=8;
    public static final int OPERATION_IZMENA_KNJIGE=9;
    
}
