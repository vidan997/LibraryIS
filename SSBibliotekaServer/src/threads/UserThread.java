/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import domain.Klijent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author vidan
 */
public class UserThread extends Thread {

    JTable table;
    Server serverThread;
    public UserThread(JTable table,Server serverThread) {
        this.table = table;
        this.serverThread = serverThread;
    }

    @Override
    public synchronized void start() {
        HashMap<Klijent, Date> hashmap = serverThread.vratiKlijente();
        table.setModel(tableModel(hashmap));
    }

    public TableModel tableModel(HashMap<Klijent, Date> map) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        DefaultTableModel model = new DefaultTableModel(
                new Object[]{"Klijent", "Vreme logovanja"}, 0
        );
        for (Map.Entry<Klijent, Date> entry : map.entrySet()) {
            model.addRow(new Object[]{entry.getKey().getIme() + " " + entry.getKey().getPrezime(), simpleDateFormat.format(entry.getValue().getTime())});
        }
        return model;
    }
}
