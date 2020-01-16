/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import domain.OpstiDomenskiObjekat;
import java.util.List;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student1
 */
public class DatabaseBroker {

    Connection connection;

    public DatabaseBroker() {
    }

    public void connect() throws Exception {
        try {
            FileInputStream in = new FileInputStream("db.properties");
            Properties props = new Properties();
            props.load(in);
            String driver = props.getProperty("driver");
            String url = props.getProperty("url");
            String user = props.getProperty("user");
            String password = props.getProperty("password");

            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(false);
            System.out.println("Uspesno uspostavljena konekcija sa bazom!");
            in.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Greska prilikom uspostavljanja konekcije sa bazom!\n" + ex.getMessage());
        }
    }

    public void disconnect() throws Exception {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                throw new Exception("Greska prilikom raskidanja konekcije: " + ex.getMessage());
            }
        }
    }

    public void commit() throws Exception {
        if (connection != null) {
            try {
                connection.commit();
            } catch (SQLException ex) {
                throw new Exception("Greska prilikom potvrdjivanja transakcije: " + ex.getMessage());
            }
        }
    }

    public void rollback() throws Exception {
        if (connection != null) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new Exception("Greska prilikom ponistavanja transakcije: " + ex.getMessage());
            }
        }
    }

    public OpstiDomenskiObjekat insert(OpstiDomenskiObjekat o) {
        try {
            String upit = "INSERT INTO " + o.dajNazivTabele() + " (" + o.dajNaziveAtributa() + ") VALUES (" + o.dajVrednostiAtributa() + ")";
            Statement statement = connection.createStatement();

            statement.executeUpdate(upit, Statement.RETURN_GENERATED_KEYS);
            if (o.isAutoincrement()) {
                ResultSet rs = statement.getGeneratedKeys();
                if (rs.next()) {
                    Long id = rs.getLong(1);
                    o.setId(id);
                }
                rs.close();
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return o;
    }

    public ResultSet select(OpstiDomenskiObjekat odo) throws Exception {
        try {
            String upit = "SELECT " + odo.dajNaziveAtributa() + " FROM " + odo.dajNazivTabele();
            System.out.println(upit);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(upit);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new Exception("Greska pri citanju iz baze!");
    }
}
