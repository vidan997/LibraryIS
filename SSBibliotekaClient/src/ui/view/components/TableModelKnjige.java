/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.components;

import domain.Knjiga;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vidan
 */
public class TableModelKnjige extends AbstractTableModel {

    List<Knjiga> knjige;
    private String[] columnNames = new String[]{"Naziv", "Autori", "Broj stranica", "Jezik", "Izdavalac", "Zanr"};

    public TableModelKnjige() {
        knjige = new ArrayList<>();
    }

    @Override
    public String getColumnName(int i) {
        return columnNames[i];
    }

    @Override
    public Object getValueAt(int x, int y) {
        Knjiga item = knjige.get(x);
        switch (y) {
            case 0:
                return item.getNaziv();
            case 1:
                return null;
            case 2:
                return item.getBrojStranica();
            case 3:
                return item.getJezik();
            case 4:
                return item.getIzdavalac();
            case 5:
                return null;
            default:
                return "n/a";
        }
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return knjige.size();
    }
}
