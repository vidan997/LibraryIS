/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.view.components;

import domain.Autor;
import domain.Zanr;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vidan
 */
public class TableZanr extends AbstractTableModel{
    List<Zanr> zanr;
    private String[] columnNames = new String[]{"Naziv"};

    public TableZanr() {
        zanr = new ArrayList<>();
    }

    @Override
    public String getColumnName(int i) {
        return columnNames[i];
    }

    @Override
    public Object getValueAt(int x, int y) {
        Zanr item = zanr.get(x);
        switch (y) {
            case 0:
                return item.toString();
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
        return zanr.size();
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            default:
                return String.class;
        }
    }

    public void setZanr(List<Zanr> autori) {
        this.zanr = autori;
        fireTableDataChanged();
    }

    public void add(Zanr zanr) {
        this.zanr.add(zanr);
        fireTableDataChanged();
    }

    public List<Zanr> getZanr() {
        return zanr;
    }
    
}
