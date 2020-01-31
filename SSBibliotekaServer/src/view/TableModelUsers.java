/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import domain.Klijent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vidan
 */
public class TableModelUsers extends AbstractTableModel {

    private List<Klijent> loggedUsers;
    private String[] columnNames = new String[]{"Ime i prezime", "Vreme logovanja", "Vreme provedeno na serveru"};

    public TableModelUsers() {
        loggedUsers = new ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return loggedUsers.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Klijent item = loggedUsers.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return item.getIme() + " " + item.getPrezime();
            case 1:
                return null;
            case 2:
                return null;
            default:
                return "n/a";
        }
    }
}
