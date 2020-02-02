/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.components;

import domain.Knjiga;
import domain.PrimerakKnjige;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vidan
 */
public class TableModelZaduzivanja extends AbstractTableModel {

    List<PrimerakKnjige> knjige;
    private String[] columnNames = new String[]{"Naziv", "Autori", "Broj stranica", "Izdavalac", "Zauzeno"};

    public TableModelZaduzivanja() {
        knjige = new ArrayList<>();
    }

    @Override
    public String getColumnName(int i) {
        return columnNames[i];
    }

    @Override
    public Object getValueAt(int x, int y) {
        PrimerakKnjige item = knjige.get(x);
        switch (y) {
            case 0:
                return item.getKnjiga().getNaziv();
            case 1:
                return null;
            case 2:
                return item.getKnjiga().getBrojStranica();
            case 3:
                return item.getKnjiga().getIzdavalac();
            case 4:
                return false;
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

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return String.class;
            case 4:
                return Boolean.class;
            default:
                return String.class;
        }
    }

}
